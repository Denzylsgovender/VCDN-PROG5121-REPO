
package parallelarraydemo;
import javax.swing.JOptionPane;

public class ParallelArrayDemo {
    public static void main(String[] args) {
        // Initialize the arrays
        String[] names = {"Denzyl", "Cathy", "EB", "Yusra"};
        
        int[] ages = {35, 50, 34, 25};

        
        
        
        // Main loop to keep the program running
        while (true) {
            // Show options to the user( Menu)
            String[] options = {"a. Search Age by Name", "b.Delete a Record", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            // Perform action based on user choice
            switch (choice) {
                case 0:
                    // Search age by name
                      String searchTaskName = JOptionPane.showInputDialog("Enter the name to delete:");
                   
                    boolean found = false;
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].equalsIgnoreCase(searchTaskName)) {//Checks for a match
                            JOptionPane.showMessageDialog(null, searchTaskName + " is " + ages[i] + " years old.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(null, "Name not found.");
                    }
                    break;

                case 1:
                    // Delete a record by Name entered
                    String deleteName = JOptionPane.showInputDialog("Enter the name to delete:");
                    int indexToDelete = -1;
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].equalsIgnoreCase(deleteName)) {
                            indexToDelete = i;
                            break;
                        }
                    }
                    if (indexToDelete != -1) {
                        names = removeElement(names, indexToDelete);
                        ages = removeElement(ages, indexToDelete);
                        
                        
                        JOptionPane.showMessageDialog(null, deleteName + " has been deleted.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Name not found.");
                    }
                    break;

                case 2:
                    // Exit the program
                    System.exit(0);
                    break;
            }
        }
    }

    // Method to remove an element from a String array
    public static String[] removeElement(String[] array, int index) {
        // Check if the input array is null, or if the index is out of bounds
        if (array == null || index < 0 || index >= array.length) {
            // If any of the above conditions are true, return the original array unchanged
            return array;
        }
        // Create a new array that is one element shorter than the original array
        String[] newArray = new String[array.length - 1];
         // Loop through the original array
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
               // Otherwise, copy the element to the new array
            newArray[k++] = array[i];
        }
        // Return the new array with the specified element removed
        return newArray;
    }

    // Method to remove an element from an int array
    public static int[] removeElement(int[] array, int index) {
       // Check if the input array is null, or if the index is out of bounds
        if (array == null || index < 0 || index >= array.length) {
           // If any of the above conditions are true, return the original array unchanged
            return array;
        }
        // Loop through the original array
        int[] newArray = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
               // Otherwise, copy the element to the new array
            newArray[k++] = array[i];
        }
        // Return the new array with the specified element removed
        return newArray;
    }
}

