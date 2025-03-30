
package simpleloginsystem;

import java.util.Scanner;
public class SimpleLoginSystem {

    public static void main(String[] args) 
    {
        String username = "Admin";
        String password = "A1234";
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

       if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful. Welcome, " + username );
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
        scanner.close();
    }
    
}
