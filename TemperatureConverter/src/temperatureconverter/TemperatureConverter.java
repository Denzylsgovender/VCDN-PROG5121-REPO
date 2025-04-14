
package temperatureconverter;
import java.util.Scanner;
public class TemperatureConverter {

   // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        double temperature;
        
        switch(choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
               
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
               
                double celsius = fahrenheitToCelsius(temperature);
                System.out.println("Temperature in Celsius: " + celsius);
               
                break;
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }
        
        scanner.close();
    }
      
   
}
