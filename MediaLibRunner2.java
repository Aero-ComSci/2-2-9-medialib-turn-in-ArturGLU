public class MediaLibRunner2 {
    
    public static void main(String[] args) {
        System.out.println("Total Entries: " + MediaLib.getNumEntries());
        System.out.println("Book Entries: " + MediaLib.getNumBooks()); 
        System.out.println("Movie Entries: " + MediaLib.getNumMovies()); 
        System.out.println("Song Entries: " + MediaLib.getNumSongs()); 
      
        MediaLib m1 = new MediaLib(); 
        Book b1 = new Book("1984", "George Orwell");
        b1.setRating(8);
        b1.adjustRating(1);
        System.out.println(b1.getRating()); // test that the adjustRating method works
        Movie mv1 = new Movie("Batman", 175.5, 9);
        Song s1 = new Song("Die With a Smile", 8);
        m1.addBook(b1); 
     //   m1.addBook(b1); add to test as an example that you can't add more than 1 book to the library */
        m1.addMovie(mv1);
        m1.addSong(s1);
        System.out.println("Total Entries: " + MediaLib.getNumEntries());
        System.out.println("Book Entries: " + MediaLib.getNumBooks()); 
        System.out.println("Movie Entries: " + MediaLib.getNumMovies()); 
        System.out.println("Song Entries: " + MediaLib.getNumSongs()); 


        MediaLib m2 = new MediaLib();  
        Book b2 = new Book("Spiderman Comic", "Laura Ziskin");
        b2.setRating(5);
        Movie mv2 = new Movie("Superman", 125.5, 8);
        Song s2 = new Song("Riptide", 10);
        m2.addBook(b2);
        m2.addSong(s2);    
        m2.addMovie(mv2);

        System.out.println("Total Entries: " + MediaLib.getNumEntries());
        System.out.println("Book Entries: " + MediaLib.getNumBooks()); 
        System.out.println("Movie Entries: " + MediaLib.getNumMovies()); 
        System.out.println("Song Entries: " + MediaLib.getNumSongs()); 
    }
}

