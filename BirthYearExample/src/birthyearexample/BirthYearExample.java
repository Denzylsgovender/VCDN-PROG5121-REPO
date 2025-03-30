
package birthyearexample;

import javax.swing.JOptionPane;//Packages installed
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;

public class BirthYearExample 
{
public static void main(String[] args) 
{
// Ask the user for their birth year 
String inputYear = JOptionPane.showInputDialog("Enter your year of birth:"); 

// Convert the input to an integer
int birthYear = Integer.parseInt(inputYear);

// Calculate the current age
int currentYear = Year.now().getValue();

int age = currentYear - birthYear; 
// Display the result to the user 
JOptionPane.showMessageDialog(null, "Your age is: " + age);
    }
}
// Get the current year using java.time.Year
//int currentYear = Year.now().getValue();

// Get the current year using java.util.Calendar
//int currentYear = Calendar.getInstance().get(Calendar.YEAR);