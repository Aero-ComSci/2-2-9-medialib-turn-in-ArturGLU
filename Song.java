public class Song
{
  private String title;
  private int rating;
  
  /**
   * Creates a new Song with a title and rating.
   * @param t The title of the song.
   * @param s The rating of the song.
   */
  public Song(String t, int s){
    title = t;
    rating = s;
  }
  
  /**
   * Gets the title of the song.
   * @return The title string.
   */
  public String getTitle() {
    return title;
  }
  
  /**
   * Gets the current rating of the song.
   * @return The integer rating.
   */
  public int getRating() {
    return rating;
  }
  
  /**
   * Returns a description of the song including title and rating.
   * @return A formatted string of song details.
   */
  @Override
  public String toString() 
  {
    String info = "\"" + title + "\"";
    if (rating != 0)
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /**
   * Updates the title of the song.
   * @param t The new title.
   */
  public void setTitle(String t) {
    title = t;
  }

  /**
   * Sets the rating for the song.
   * @param r The rating value (1-10).
   * @precondition r should be an integer between 1 and 10
   * @postcondition The rating attribute is updated to r.
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
   * Compares this song to another song object for equality.
   * @param s The other song to compare.
   * @return true if both songs have the same title, false otherwise.
   * @precondition b must not be null for a successful comparison.
   */
  public boolean equals(Song s){
    if (s != null){
      return this.title.equals(s.getTitle());
    }
    else{
      return false;
    }
  }
}
