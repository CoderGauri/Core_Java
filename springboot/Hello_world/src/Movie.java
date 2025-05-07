public class Movie {
    // Fields (attributes)
    private String title;
    private String director;
    private int releaseYear;
    private double rating; // e.g., 4.5 out of 5

    // Constructor
    public Movie(String title, String director, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Override toString() for better readability
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                '}';
    }

    // Example usage
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
        System.out.println(movie); // Uses toString()
    }
}