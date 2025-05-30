public class Movies {
    public static void main(String[] args) {


    }


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
        public String getTitle(){
            return title ;
        }
        public void setTitle(){
            this.title = title;
        }
        public String getDirector(){
            return director;
        }
        public void setDirector(){
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

    }

}