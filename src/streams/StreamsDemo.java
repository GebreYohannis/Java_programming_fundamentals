package streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("Avator", 10),
                new Movie("Knowing", 5),
                new Movie("Nobody", 20)
        );

        int count = 0;
//       Imperative programming
        for (Movie movie : movies)
            if (movie.getLikes() >= 10)
                count++;
//        System.out.println("Count: " + count);

//        Declarative(Functional Programming)
        var anotherCount = movies.stream()
                .filter(movie -> movie.getLikes() >= 10)
                .count();

//        System.out.println("AnotherCount: " + anotherCount);

//        createStream();
//        mapElement();
//        filterElement();

//        slicingStream();
//        sortStream();
//        getUniqueValue();
//        peekElement();
//        reducers();

//        reduceStream();

//        collectElements();
//        groupElements();
//        partitionElement();
        primitiveTypeStream();
    }


    private static void createStream() {
        /**
         *  We can create a stream from:
         *  - collections
         *  - arrays
         *  - an arbitrary number of objects
         *  - we can also create infinite/finite streams
         */

        Collection<Integer> collection = new ArrayList<>();
        var streamFromCollections = collection.stream();

        int[] numbers = new int[4];
        var streamFromArrays = Arrays.stream(numbers);
//        streamFromArrays.forEach(n-> System.out.println(n));
//        streamFromArrays.forEach(System.out::println); // the same as above

        Stream<Movie> streamFromArbitraryObjects = Stream.of(
                new Movie("a", 19),
                new Movie("b", 1)
        );

//        streamFromArbitraryObjects.forEach(System.out::println);

//        Generate Infinite
        var infiniteNumberStream = Stream.generate(() -> Math.random());
//        infiniteNumberStream.forEach(n-> System.out.println(n));

        infiniteNumberStream
                .limit(10)
                .forEach(System.out::println);

        // Another way to generate infinite or finite stream
        var infiniteStreamWithIterators = Stream.iterate(1, n -> n + 1);
        infiniteStreamWithIterators
                .limit(20)
                .forEach(n -> System.out.println(n));
    }

    private static void mapElement() {
        Stream<Movie> movies = Stream.of(
                new Movie("Avator", 19),
                new Movie("c", 2),
                new Movie("The Lion King", 3)
        );

//        Stream<String> movieTitles = movies.map(movie-> movie.getTitle());
        Stream<String> movieTitles = movies.map(Movie::getTitle);
        movieTitles
                .filter(title -> title.length() > 2)
                .forEach(title -> System.out.println(title));

        var stream = Stream.of(
                List.of(1, 4, 5, 3, 6),
                List.of(4, 5, 6, 8)
        );


//        stream.forEach(list -> System.out.println(list));
        /**
         * It returns the following
         * [1, 4, 5, 3, 6]
         * [4, 5, 6, 8]
         */

        /**
         * Instead of returning a list we can return a stream
         */

        stream
                .flatMap(list -> list.stream())
                .forEach(list -> System.out.println(list));

    }

    private static void filterElement() {
        List<Movie> movies = List.of(
                new Movie("a", 39),
                new Movie("b", 2),
                new Movie("d", 12)
        );

        Stream<Movie> moviesWithGreaterLikes = movies.stream()
                .filter(movie -> movie.getLikes() > 10);
        moviesWithGreaterLikes
                .forEach(System.out::println);

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        Stream<Movie> popularMovie = movies.stream()
                .filter(isPopular);
        popularMovie
                .forEach(System.out::println);
    }

    private static void slicingStream() {
        List<Movie> movies = List.of(
                new Movie("b", 2),
                new Movie("a", 39),
                new Movie("d", 12)
        );

//        Limit element from the stream
//        movies.stream()
//                .limit(2)
//                .forEach(movie-> System.out.println(movie.getTitle()));

//        Skip some element of stream
//        movies.stream()
//                .skip(2)
//                .forEach(movie-> System.out.println(movie.getTitle())); // d
// Real world examples
        /**
         * 2000 movies
         * 20 movies per page = pageSize
         * 3rd page = currentPage
         * skip(40) = skip((currentPage - 1) * pageSize)
         * limit(20) = limit(pageSize)
         */
//        movies.stream()
//                .skip(40)
//                .limit(20)
//                .forEach(movie -> System.out.println(movie.getTitle()));

//        movies.stream()
//                .takeWhile(movie-> movie.getLikes() < 20) // takeWhile terminates the program the moment it get the first false condition
//                .forEach(movie -> System.out.println(movie.getTitle()));

        movies.stream()
                .dropWhile(movie -> movie.getLikes() < 20) // The opposite of the above, this method skip all the elements that match the condition
                .forEach(movie -> System.out.println(movie.getTitle()));
    }

    private static void sortStream() {
        List<Movie> movies = List.of(
                new Movie("b", 2),
                new Movie("a", 39),
                new Movie("d", 12)
        );

//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(System.out::println);
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(System.out::println);
    }

    private static void getUniqueValue() {
        List<Movie> movies = List.of(
                new Movie("b", 2),
                new Movie("a", 39),
                new Movie("d", 12),
                new Movie("d", 12)
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);
    }

    private static void peekElement() {
        List<Movie> movies = List.of(
                new Movie("b", 2),
                new Movie("a", 39),
                new Movie("d", 12)
        );

        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .peek(movie -> System.out.println("Filtered: " + movie))
                .map(Movie::getTitle)
                .peek(title -> System.out.println("Mapped: " + title))
                .forEach(System.out::println);
    }

    private static void reducers() {
        List<Movie> movies = List.of(
                new Movie("b", 2),
                new Movie("a", 39),
                new Movie("d", 12)
        );
        // All the following operation are terminal operation
        // meaning the cannot produce another stream
        // like intermediate operation (.filter,.map,and so on)
        /**
         * Reducers reduce values into a single value
         *  .count()
         *  .anyMatch(Predicate)
         *  .allMatch(Predicate)
         *  .noneMatch(Predicate)
         *  .findFirst()
         *  .findAny()
         *  .max(Comparator)
         *  .min(Comparator)
         */

        long movieCount = movies.stream().count();
        boolean isThereMoviesMoreThan20Likes = movies.stream().anyMatch(movie -> movie.getLikes() > 20); // true
        boolean isAllMoviesMoreThan20Likes = movies.stream().allMatch(movie -> movie.getLikes() > 20); // false
        boolean isNoneOfTheMoviesMoreThan20Likes = movies.stream().allMatch(movie -> movie.getLikes() > 20); // false

        Optional<Movie> findFirst = movies.stream()
                .findFirst();
        Movie firstMovie = findFirst.get();
        System.out.println(firstMovie);

        Optional<Movie> findAny = movies.stream()
                .findAny();

        Movie anyMovie = findAny.get();
        System.out.println(anyMovie);

        Optional<Movie> movieWithMaxLikes = movies.stream()
                .max(Comparator.comparing(Movie::getLikes));
        Movie result = movieWithMaxLikes.get();
        System.out.println(result);

    }

    private static void reduceStream() {
        List<Movie> movies = List.of(
                new Movie("b", 2),
                new Movie("a", 39),
                new Movie("d", 12)
        );

        Optional<Integer> sum = movies.stream()
                .map(Movie::getLikes)
                .reduce((a, b) -> a + b);

        sum = movies.stream()
                .map(Movie::getLikes)
                .reduce(Integer::sum); // with method reference
//        var result = sum.get(); // This may through an exception so to prevent this use the following
        Integer result = sum.orElse(0);
        System.out.println("Sum: " + result);

        // Instead or working with optional object we can supply an integer object as a first parameter of reduce

        Integer sumResult = movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum);
        movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum);

        System.out.println("Sum result: " + sumResult);
    }

    private static void collectElements() {
        List<Movie> movies = List.of(
                new Movie("b", 2),
                new Movie("a", 39),
                new Movie("d", 12)
        );

        List<Movie> result = movies.stream()
                .collect(Collectors.toList());
        result.add(
                new Movie("E", 18)
        );
        result.forEach(System.out::println);

        Set<Movie> movieSet = movies.stream()
                .collect(Collectors.toSet());
        result.add(
                new Movie("E", 18)
        );
        movieSet.add(
                new Movie("F", 3)
        );
        System.out.println("Set result");
        movieSet.forEach(System.out::println);

        Map<String, Integer> movieMap = movies.stream()
                .collect(Collectors.toMap(
                                m -> m.getTitle(),
                                m -> m.getLikes()
                        )
                );
        Integer likes = movieMap.get("a");
        System.out.println("Likes: " + likes);

        Map<String, Movie> movieStore = movies.stream()
                .collect(Collectors.toMap(
                        m -> m.getTitle(),
                        Function.identity() //movie -> movie
                ));
        System.out.println(movieStore);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Integer sum = numbers.stream()
                .collect(Collectors.summingInt(s -> s));
        System.out.println("Sum: " + sum);

        Integer primitiveIntSum = numbers.stream()
                .mapToInt(s -> s).sum();

        var summarize = movies.stream()
                .collect(Collectors.summarizingInt(m -> m.getLikes()));
        System.out.println("Summarized Value: " + summarize);

        String concatenatedTitle = movies.stream()
                .filter(movie -> movie.getLikes() >= 10)
                .map(movie -> movie.getTitle())
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated Title: " + concatenatedTitle);

    }

    private static void groupElements() {
        List<Music> musics = List.of(
                new Music("a", 20, MusicGenre.A),
                new Music("b", 5, MusicGenre.T),
                new Music("d", 40, MusicGenre.A),
                new Music("c", 3, MusicGenre.R)
        );

        var groupedMusics = musics.stream()
                .collect(Collectors.groupingBy(music -> music.getGenre()));
        System.out.println(groupedMusics);

        var getMovieByGenre = groupedMusics.get(MusicGenre.A);
        System.out.println(getMovieByGenre);

        Map<MusicGenre, Set<Music>> result = musics.stream()
                .collect(Collectors.groupingBy(
                        movie -> movie.getGenre(),
                        Collectors.toSet()
                ));
        System.out.println(result);

        var musicCount = musics.stream()
                .collect(
                        Collectors.groupingBy(Music::getGenre,
                                Collectors.counting()
                        )
                );
        System.out.println("Music Count: " + musicCount);

        Map<MusicGenre, String> joinMusicTitle = musics.stream()
                .collect(Collectors.groupingBy(
                        Music::getGenre,
                        Collectors.mapping(
                                Music::getTitle,
                                Collectors.joining(",")
                        )
                ));
        System.out.println(joinMusicTitle);
    }

    private static void partitionElement() {
        List<Music> musics = List.of(
                new Music("a", 20, MusicGenre.A),
                new Music("b", 5, MusicGenre.T),
                new Music("d", 40, MusicGenre.A),
                new Music("c", 3, MusicGenre.R)
        );

        var partitionResult = musics.stream()
                .collect(Collectors.partitioningBy(
                                music -> music.getLikes() > 10,
                                Collectors.mapping(Music::getTitle,
                                        Collectors.joining(","))
                        )
                );
        System.out.println(partitionResult);
    }

    private static void primitiveTypeStream() {
        var squareSum = IntStream.of(1,2,4)
                .map(n->n*n)
                .reduce(0,(a,b)->a + b);
        System.out.println(squareSum);

        IntStream.rangeClosed(1,20)
                .forEach(System.out::println);

        LongStream.range(1,4)
                .forEach(System.out::println);

    }
}
