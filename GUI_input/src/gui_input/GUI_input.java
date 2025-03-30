
package gui_input;

import javax.swing.JOptionPane;
public class GUI_input 
{
     public static void main(String[] args) 
    {
   
 String userInputString = JOptionPane.showInputDialog(null, "Enter your name:");
   JOptionPane.showMessageDialog(null, "Hello, " + userInputString + "!");   

 String ageInput = JOptionPane.showInputDialog(null, "Enter your age:");
 
 int age = Integer.parseInt(ageInput);
 
  int futureAge = age + 5;

JOptionPane.showMessageDialog(null, 
        "In 5 years, you will be " + futureAge + " years old!");


 String InputBirthYear = JOptionPane.showInputDialog(null, "Enter your year of birth");
 int BirthYear = Integer.parseInt(InputBirthYear);
 
 int CurrentYear= 2024;
 
 int NewAge= CurrentYear - BirthYear;
JOptionPane.showMessageDialog(null, "You are  " + NewAge + " years old!");


    }
}


