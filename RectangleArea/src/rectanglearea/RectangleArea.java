
package rectanglearea;

import javax.swing.JOptionPane;
public class RectangleArea 
{

public static void main(String[] args) 
    {
        // Declare variables
        double length, width;

        // Prompt user for length using JOptionPane
        String lengthInput = JOptionPane.showInputDialog("Enter the length of the rectangle:");
        length = Double.parseDouble(lengthInput);

        // Prompt user for width using JOptionPane
        String widthInput = JOptionPane.showInputDialog("Enter the width of the rectangle:");
        width = Double.parseDouble(widthInput);

        // Calculate the area using the method
        double area = length * width;

        // Display the result using JOptionPane
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
    }
    
}
