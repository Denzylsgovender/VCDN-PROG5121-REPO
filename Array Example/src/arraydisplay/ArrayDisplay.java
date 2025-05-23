
package arraydisplay;

public class ArrayDisplay {
    public static void main(String[] args) {
        // Define an array to store 12 integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        // Display the integers from first to last
        System.out.println("Integers from first to last:");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display a new line for better readability
        System.out.println();

        // Display the integers from last to first
        System.out.println("Integers from last to first:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

