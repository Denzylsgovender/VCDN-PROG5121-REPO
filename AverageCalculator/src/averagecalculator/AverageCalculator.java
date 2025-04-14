package averagecalculator;


public class AverageCalculator 
{
    public static void main(String[] args) 
    {
        // Declare variables
        int number1 = 5;
        int number2 = 10;
        int number3 = 15;
        double result;

        // Calculate average
        result = calculateAverage(number1, number2, number3);

        
        
        // Print the result
        System.out.println("The average is " + result);
    }

    // Method to calculate average
    public static double calculateAverage(int x, int y, int z) {
        double average;
        average = (x + y + z) / 3.0;
        return average;
    }
}

