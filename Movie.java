/**
 * Represents a Movie with a title, duration, and rating.
 */
public class Movie {
    private String title;
    private double duration;
    private int rating;

    /**
     * Constructor to create a Movie object.
     * @param title The title of the movie.
     * @param duration The length of the movie in minutes.
     * @param rating The numerical rating assigned to the movie.
     */
    public Movie(String title, double duration, int rating){
        this.title = title;
        this.duration = duration;
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
    }   else {
            this.rating = 0;
    }
    }

    public Movie(String title, double duration){
        this.title = title;
        this.duration = duration;
        this.rating = 0; 
    }

    /**
     * Gets the movie title.
     * @return The title of the movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the movie duration.
     * @return The length of the movie in minutes.
     */
    public double getDuration() {
        return duration;
    }
    
    /**
     * Gets the movie rating.
     * @return The current rating.
     */
    public int getRating() {
        return rating;
    }
    
    /**
     * Provides a string representation of the movie details.
     * @return A formatted string with title, duration, and rating.
     */
    @Override
    public String toString() 
    {
        String info = "\"" + title + "\", duration of " + duration + "\", minutes and rating of " + rating;
        return info;
    }

    /**
     * Updates the movie title.
     * @param t The new title.
     */
    public void setTitle(String t) {
        title = t;
    }

    /**
     * Updates the movie duration.
     * @param d The new duration in minutes.
     */
    public void setDuration(double d) {
        duration = d;
    }

    /**
     * Updates the movie rating.
     * @param r The new rating value.
     * @precondition The current rating must be between 1 to 10.
     * @postcondition The rating is updated to r if the precondition is met.
     */

    public void setRating(int r){
    if (r > 0 && r <= 10) {
      rating = r;
    }
    else{
      System.out.println("Rating: N/A");
    }
    }

    public void adjustRating(int r) {
    rating += r;
    }
    
    /**
     * Compares this movie to another movie for equality based on title and duration.
     * @param m The movie object to compare against.
     * @return true if titles and durations are identical, false otherwise.
     * @precondition m should not be null for an accurate comparison.
     */
    public boolean equals(Movie m) {
        if (m != null) {
            return this.title.equals(m.getTitle()) && this.duration == m.getDuration();
        }
        else {
            return false;
        }
    }
}
