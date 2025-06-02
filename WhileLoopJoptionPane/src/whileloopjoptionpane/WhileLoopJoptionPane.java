
package whileloopjoptionpane;

import javax.swing.*;
public class WhileLoopJoptionPane {

    public static void main(String[] args) {
     
        
        
        while (true) {
            // Display the menu options
            String[] options = {"1. Add tasks", "2. Show Reports", "Exit"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "*****-Main Menu-*****\nChoose an option:",
                    "Main Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );
    
    switch (choice) {
                case 0:
                    JOptionPane.showMessageDialog(null, "You selected Option 1");
                   
                    
                    
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Where is my reports?");
                   
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Exiting the program. Goodbye!");
                    System.exit(0); // Terminate the program
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a number between 1 and 3.");
            }
}
}
}
