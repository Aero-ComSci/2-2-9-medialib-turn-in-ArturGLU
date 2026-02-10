public class MediaLib
{

  public static String owner = "Artur";
  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;

  public static String getOwner(){
    return owner;
  }

  public static int getNumEntries(){
    return numEntries;
  }

  public static int getNumBooks(){
    return numBooks;
  }

  public static int getNumMovies(){
    return numMovies;
  }

  public static int getNumSongs(){
      return numSongs;
  }


  private Book book;

  public void addBook(Book b)
  {
    if (b.getRating() > 0 && b.getRating() <= 10){
      if (book == null){
        book = b;
        numEntries++; 
        numBooks ++;
      }
      else{
        System.out.println("A book entry already got put into this library.");
    }}
    else{
      System.out.println("Rating is not in range to be added");
  }
  }


  private Movie movie;
  
  public void addMovie(Movie m){
    if (m.getRating() > 0 && m.getRating() <= 10){
      if (movie == null){
        movie = m;
        numEntries++; 
        numMovies++;
      }
      else{
        System.out.println("A movie entry already got put into this library.");
    }}
    else{
      System.out.println("Rating is not in range to be added");
  }
  }

  private Song song;
  
  public void addSong(Song s){
    if (s.getRating() > 0 && s.getRating() <= 10){
      if (song == null){
        song = s;
        numEntries++; 
        numSongs++;
      }
      else{
        System.out.println("A song entry already got put into this library.");
    }}
    else{
      System.out.println("Rating is not in range to be added");
  }
  }


  @Override
  public String toString() 
  {
    String info = "";

    if (movie != null)
      info += "Book Added: " + book.toString();

    if (movie != null)
      info += "Movie Added: " + movie.toString();

    if (song != null)
      info += "Song Added:" + song.toString();

    return info;
  }

}
