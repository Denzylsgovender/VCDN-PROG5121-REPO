
package car;
public class CarApp 
{
    public static void main(String[] args) {
        // Declare and instantiate a Car object
        Car myCar = new Car("Toyota", "RXI", 2001);

        // Access and modify object attributes
        myCar.year = 2024;

        // Call methods on the Car object
        myCar.displayInfo();
        myCar.start();
        myCar.stop();
        
        }
    
}
