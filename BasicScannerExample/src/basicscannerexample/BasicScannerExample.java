
package basicscannerexample;

import java.util.Scanner;
public class BasicScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input as a String
        String userName = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");

        // Read the user's input as an integer
        int userAge = scanner.nextInt();
        
        //double userAge=scanner.nextDouble();
       // Display a greeting message with the user's name and age
       
        System.out.println("Hello, " + userName + "! You are " + userAge + " years old.");

        // Close the Scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
