
package book;


public class Book {
 String title;
    String author;
    int year;

    // Constructor to initialize the attributes
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display the book's details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println();
    }
   
      // Method to check if the title is not more than 20 characters in length
    public boolean isTitleValid() {
        return title.length() <= 20;
    }
    
}
