
package person;


import java.util.Scanner;
public class PersonApp {
public static void main(String[] args) {
Person person1 = new Person("Chucky", 5);
    
 person1.displayInfo();
 person1.greeting();
 
 Scanner scanner = new Scanner(System.in);

 // Get user input for person2
 System.out.print("Enter the name for person 2: ");
 String InputName = scanner.nextLine();

 System.out.print("Enter the age for person 2: ");
 int InputAge = scanner.nextInt();
 scanner.nextLine(); // Consume the newline character

 Person person2 = new Person(InputName, InputAge); 

 person2.displayInfo();
 person2.greeting();
 
 // Close the scanner to free up system resources
 scanner.close();
    }
}

