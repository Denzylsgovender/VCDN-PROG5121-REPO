
package movienightdecision;

import java.util.Scanner;
public class MovieNightDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Input parental permission
        System.out.print("Do you have parental permission? (yes/no): ");
        String permission = scanner.next().toLowerCase();

        // Determine which movies the user can watch
        System.out.println("Movies you can watch:");
        if (age >= 18 || (age >= 13 && permission.equals("yes"))) {
            System.out.println("- R-rated movies");
        }
        if (age >= 13 || (age >= 9 && permission.equals("yes"))) {
            System.out.println("- PG-13 movies");
        }
        if (age >= 9 || (age >= 6 && permission.equals("yes"))) {
            System.out.println("- PG movies");
        }
        System.out.println("- G-rated movies");

        scanner.close();
    }
}
