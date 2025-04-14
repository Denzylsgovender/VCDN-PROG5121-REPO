
package switchstatement;

import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a day of the week
        System.out.print("Enter a day of the week (1-7): ");
        
        // Read the user's input
        int day = scanner.nextInt();
        String dayString;
        
        // Use a switch statement to determine the day string
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                System.out.println("It's Wacky Wednesday!");
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }

        // Output the day of the week to the user
        System.out.println("Day of the week: " + dayString);
        
        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
    
}
