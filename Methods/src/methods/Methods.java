
package methods;


public class Methods 
{
//Create a method without parameters
public static void greetings()
{
System.out.println("Hello/Sawubona/Hola/Bonjour");
} 

//Create a method with parameters
public static void Addition(int num1, int num2)
{
int sum= num1 + num2;
System.out.println("Sum: " + sum);
}

//Create a method that returns a value
public static  int methodWithReturnValue(int num1,int num2)
{
    return num1 + num2;
  }

    public static void main(String[] args) //This is your main method
    {
       //Call/invoke your methods by their name
        greetings();
        
        // Calling the method with arguments
        Addition(5, 10); 
        
        //calling the method which returns a value
        int result = methodWithReturnValue(5,5);
        System.out.println("Result: " + result);
    }
    
}
