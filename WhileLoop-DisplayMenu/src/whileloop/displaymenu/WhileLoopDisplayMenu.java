
package whileloop.displaymenu;
import java.util.Scanner;
public class WhileLoopDisplayMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Display the menu repeatedly until the user chooses to exit
        while (true) {
            // Display the menu options
            System.out.println("*****-Main Menu-*****:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0); // Terminate the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
            System.out.println(); // Add a blank line for readability
        }
    }
    
}
