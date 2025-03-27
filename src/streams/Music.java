package streams;

public class Music {
    private String title;
    private Integer likes;
    private MusicGenre genre;

    public Music(
            String title,
            Integer likes,
            MusicGenre genre
    ) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public MusicGenre getGenre() {
        return genre;
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return ("{ title: " + this.getTitle() +
                ", likes: " + getLikes() +
                ", genre: " + getGenre() + " }"
        );
    }
}
