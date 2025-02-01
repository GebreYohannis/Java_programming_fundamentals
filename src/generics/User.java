package generics;

public class User implements Comparable<User> {

    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // this < o -> -1
        // this == o -> 0
        // this > o -> 1

        if (points < other.points)
            return -1;
        if (points == other.points)
            return 0;

        return 1;

//        Instead of writing all the above we have a better way. Take a look the following
//        return points - other.points;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": { points : " + points + " }";
    }
}
