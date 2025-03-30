
package temperatureconversion;
import javax.swing.JOptionPane;
public class TemperatureConversion 
{    public static void main(String[] args) 
    {
        //Prompt user
        String userinput=JOptionPane.showInputDialog(null,"Enter Temp in Celsius");
        double Temp = Double.parseDouble(userinput);
//Convert temperature
        double Celsius= (Temp * 9/5) +32;
       
        //Display
        JOptionPane.showMessageDialog(null, "your Temp is: " + Celsius);
    }
}
