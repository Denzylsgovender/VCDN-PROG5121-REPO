package methodoverload;
public class MethodOverload 
{
 // Method to add two integers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two doubles
    public static double addNumbers(double a, double b) {
        return a + b;
    }
  
    public static void main(String[] args)
    {
       // Calling the first addNumbers method with two integers
        System.out.println("Sum two integers: " + addNumbers(5, 5));
        
        // Calling the second addNumbers method with three integers
        System.out.println("Sum three integers:: " + addNumbers(5, 5, 5));
        
        // Calling the third addNumbers method with two doubles
        System.out.println("Sum two double: " + addNumbers(2.5, 3.5));
        
    }
    
}
