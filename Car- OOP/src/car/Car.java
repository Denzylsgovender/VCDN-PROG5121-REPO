
package car;


public class Car 
{  
    // Fields or attributes
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Method to start the car
    public void start() {
        System.out.println("The car is starting.");
    }

    // Method to stop the car
    public void stop() {
        System.out.println("The car is stopping.");
        
    //Add any additional Methods...
    }
    
}
