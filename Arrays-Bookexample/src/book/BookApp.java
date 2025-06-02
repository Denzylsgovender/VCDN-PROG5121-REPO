
package book;


public class BookApp {
     public static void main(String[] args) {
     // Declare and initialize an array of Book objects to hold 3 books
        Book[] books = new Book[3];

        // Create 3 Book objects and assign them to the array
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        books[1] = new Book("1984", "George Orwell", 1949);
        books[2] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

      // Iterate over the array and call the displayDetails() method for each Book object
        for (Book book : books) {
            if (book.isTitleValid()) {
                book.displayDetails();
            } else {
                System.out.println("Title of the book '" + book.title + "' is too long!");
                System.out.println();
            }
    
        }
}

}