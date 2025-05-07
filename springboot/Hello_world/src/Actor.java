import java.util.List;
import java.util.ArrayList;

public class Actor {
    // Fields
    private String name;
    private int birthYear;
    private String nationality;
    private List<String> notableMovies; // List of movie titles

    // Constructor
    public Actor(String name, int birthYear, String nationality ,List<String> notableMovies) {
        this.name = name;
        this.birthYear = birthYear;
        this.nationality = nationality;
        this.notableMovies = notableMovies; // Initialize empty list
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<String> getNotableMovies() {
        return notableMovies;
    }

    // Add a movie to the actor's filmography
    public void addNotableMovie(String movieTitle) {
        notableMovies.add(movieTitle);
    }

    // Remove a movie from the list
    public boolean removeNotableMovie(String movieTitle) {
        return notableMovies.remove(movieTitle);
    }

    // Override toString() for readable output
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", nationality='" + nationality + '\'' +
                ", notableMovies=" + notableMovies +
                '}';
    }

    // Example usage
    public static void main(String[] args) {
        Actor actor = new Actor("Leonardo DiCaprio", 1974, "American" ,new ArrayList<>());
        actor.addNotableMovie("Inception");
        actor.addNotableMovie("The Revenant");
        actor.addNotableMovie("Titanic");

        System.out.println(actor);
    }
}