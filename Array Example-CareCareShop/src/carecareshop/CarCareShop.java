package carecareshop;
import java.util.Scanner;
public class CarCareShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store available services and their prices
        String[] services = {"Oil Change", "Tire Rotation", "Battery Check", "Brake Inspection"};
        
        double[] prices = {25.0, 22.0, 15.0, 5.0};

        // Display available services
        System.out.println("Welcome to Cody's Car Care Shop!");
        System.out.println("Available Services:");
        for (int i = 0; i < services.length; i++) {
            System.out.println((i + 1) + ". " + services[i] + " - R" + prices[i]);
        }

        // Prompt user for their choice
        System.out.print("Enter the service you would like (e.g., 'Oil Change'): ");
        String serviceChoice = scanner.nextLine().trim().toLowerCase();

        // Search for the chosen service in the array
        int index = -1;//or you can use Integer index=null;;
        
        for (int i = 0; i < services.length; i++) {
            if (services[i].toLowerCase().equals(serviceChoice)) {
//or           
//if (services[i].toLowerCase().startsWith(serviceChoice))
                index = i;
                break;
            }
        }

        // Display the chosen service and its price, or display an error message if the service is not found
        if (index != -1) {
            System.out.println("You have chosen: " + services[index]);
            System.out.println("Price: R" + prices[index]);
        } else {
            System.out.println("Invalid service entered. Please choose from the provided options.");
        }

        // Close the scanner
        scanner.close();
    }
}

