public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /**
   * Creates a new Book with a title and author.
   * @param t The title of the book.
   * @param a The author of the book.
   */
  public Book(String t, String a){
    title = t;
    author = a;
    rating = 0;
  }
  
  /**
   * Gets the title of the book.
   * @return The title string.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Gets the author of the book.
   * @return The author string.
   */
  public String getAuthor() {
    return author;
  }
  
  /**
   * Gets the current rating of the book.
   * @return The integer rating.
   */
  public int getRating() {
    return rating;
  }
  
  /**
   * Returns a description of the book including title, author, and rating.
   * @return A formatted string of book details.
   */
  @Override
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0)
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /**
   * Updates the title of the book.
   * @param t The new title.
   */
  public void setTitle(String t) {
    title = t;
  }

  /**
   * Updates the author of the book.
   * @param a The new author.
   */
  public void setAuthor(String a) {
    author = a;
  }

  /**
   * Sets the rating for the book.
   * @param r The rating value (typically 1-10).
   * @precondition r should be an integer; 0 indicates no rating.
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
   * Compares this book to another book object for equality.
   * @param b The other book to compare.
   * @return true if both books have the same title and author, false otherwise.
   * @precondition b must not be null for a successful comparison.
   */
  public boolean equals(Book b){
    if (b != null){
      return this.title.equals(b.getTitle()) && this.author.equals(b.getAuthor());
    }
    else{
      return false;
    }
  }
}
