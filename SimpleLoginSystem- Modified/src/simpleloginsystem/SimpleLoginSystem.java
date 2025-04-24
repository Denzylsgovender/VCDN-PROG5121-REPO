
package simpleloginsystem;

import java.util.Scanner;
public class SimpleLoginSystem {

    public static void main(String[] args) 
    {
        String username = "Admin";
        String password = "A1234";
        
        Scanner scanner = new Scanner(System.in);
  int attempts = 0; // Initialize the attempts counter
  
  while (attempts < 3)
  {
   System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

       if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful. Welcome, " + username );
            break;// Exit the loop if login is successful
            
        } else 
       {
            System.out.println("Invalid username or password. Please try again.");
            
            attempts ++;// Increment the attempts counter
            System.out.println("Login Attempt: " +attempts);
            
            if (attempts == 2) {
            System.out.println("Warning! You have one last attempt");
        }  
        }
  }
    

// Check if the user exceeded the maximum number of attempts
        if (attempts == 3) {
            System.out.println("Maximum number of login attempts exceeded. Please contact support.");
        }     
  
        scanner.close();
    }
  
    
}
