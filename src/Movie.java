import java.util.Objects;

public class Movie implements Cloneable {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\n" +
                "Studio: " + this.studio + "\n" +
                "Raiting: " + this.rating + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(studio, movie.studio) && Objects.equals(rating, movie.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, studio, rating);
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }
}
