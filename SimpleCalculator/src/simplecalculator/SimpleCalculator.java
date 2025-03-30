
package simplecalculator;

import javax.swing.JOptionPane;
public class SimpleCalculator {

   
    public static void main(String[] args) {
        // Example: Basic calculator

        // Step 1: Get user input for the first number
        String firstNumberInput = JOptionPane.showInputDialog(null, "Enter the first number:");
        double firstNumber = Double.parseDouble(firstNumberInput);

        // Step 2: Get user input for the second number
        String secondNumberInput = JOptionPane.showInputDialog(null, "Enter the second number:");
        double secondNumber = Double.parseDouble(secondNumberInput);

        // Step 3: Perform basic arithmetic operation (e.g., addition)
        double sum = firstNumber + secondNumber;

        // Step 4: Display the result to the user
        JOptionPane.showMessageDialog(null, "The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
    }
    
}
