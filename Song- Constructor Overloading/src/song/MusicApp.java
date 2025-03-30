
    package song;


        public class MusicApp 
         {
         public static void main(String[] args) {
        // Create instances using different constructors
        Song unknownSong = new Song();  // Default constructor
        Song instrumentalSong = new Song("Frankenstien");  // Constructor with title
        Song popSong = new Song("Water", "Tyla");  // Constructor with title and artist
        Song fullSong = new Song("Lovin On Me", "Jack Harlow", 2.19);  // Full constructor

        // Display information for each song
        unknownSong.displayInfo();
        instrumentalSong.displayInfo();
        popSong.displayInfo();
        fullSong.displayInfo();
    }
}
