
package mealordersystem;


import java.util.Scanner;

public class MealorderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Greet the user
        System.out.println("Welcome, " + userName + "!");

        // Prompt the user to order a meal
        System.out.print("What meal would you like to order? ");
        String meal = scanner.nextLine();

        // Prompt the user for the amount of the meal
        System.out.print("Enter the price of the meal: ");
        double mealPrice = scanner.nextDouble();

        // Prompt the user to pay for the meal
        System.out.print("Please enter the amount you are paying: ");
        double amountPaid = scanner.nextDouble();

         // Check if the amount paid is sufficient
        if (amountPaid >= mealPrice) {
            
          // Calculate change
        double change = amountPaid - mealPrice;  
        
        System.out.println("Thank you for your payment");
        System.out.println("Thank you for your order, " + userName + "!");
        System.out.println("You ordered: " + meal);
        System.out.println("Your meal costs: R" + mealPrice);
        System.out.println("You paid: R" + amountPaid);
        System.out.println("Your change: R" + change);
        scanner.close();
        } 
        else 
        {
        System.out.println("Insufficient payment. Please provide additional payment.");
        scanner.close();
        }
             
        
       

        
    }
}
