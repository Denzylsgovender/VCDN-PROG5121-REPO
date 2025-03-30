
package shapeareacalculatorpromptinguser;

import javax.swing.JOptionPane;
public class ShapeAreaCalculatorPromptingUser 
{
public static void RectangleArea(int length, int width)
{
    int area= length * width;
    System.out.println("The area of a Rectangle is:" + area );
}
  
    public static void main(String[] args) 
    {//Prompting the user for values
  String InputLength = JOptionPane.showInputDialog(null, "Enter the Length");
  int length = Integer.parseInt(InputLength);
      
  String InputWidth = JOptionPane.showInputDialog(null, "Enter the Width");
  int width = Integer.parseInt(InputWidth);

 RectangleArea(length,width);
     }
    
}
