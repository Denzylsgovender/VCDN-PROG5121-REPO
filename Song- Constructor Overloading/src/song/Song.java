
package song;
public class Song {
// Instance variables
    public String title;
    public String artist;
    public double duration;  // Duration in minutes

    // Default constructor
    public Song() {
        this.title = "Unknown";
        this.artist = "Unknown";
        this.duration = 0.0;
    }
    // Constructor with title
    public Song(String title) {
        this.title = title;
        this.artist = "Unknown";
        this.duration = 0.0;
    }

    // Constructor with title and artist
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.duration = 0.0;
    }

    // Full constructor with all properties
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    // Method to display song information
    public void displayInfo() {
        System.out.println("My Play List:");
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " minutes");
         System.out.println("--------------------");
           }
  
   
    
}
