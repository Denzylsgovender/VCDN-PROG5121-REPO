
package parallelarrays;


public class ParallelArrays {

 
    public static void main(String[] args) {
        // Initialize the names array with 3 elements
        String[] names = {"Denzyl", "David", "Felicia"};

        // Initialize the ages array with corresponding ages
        int[] ages = {21, 32, 43};

        // Initialize the uniqueIDs array to store the generated unique IDs
        // The size is the same as the names and ages arrays
        String[] uniqueIDs = new String[3];

        // Populate the uniqueIDs array
        // Iterate through each element in the names and ages arrays
        for (int i = 0; i < names.length; i++) {
            // Generate the unique ID for each element using the generateUniqueID method
            uniqueIDs[i] = generateUniqueID(names[i], ages[i]);
        }

        // Print the contents of the arrays
        // Iterate through each element in the arrays and print them
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", Unique ID: " + uniqueIDs[i]);
        }
    }

    
    public static String generateUniqueID(String name, int age) {
        // Extract the first letter of the name
        char firstLetterOfName = name.charAt(0);

        // Convert the age to a string and extract the last character
        char lastDigitOfAge = Integer.toString(age).charAt(Integer.toString(age).length() - 1);

        // Concatenate the first letter of the name and the last digit of the age to form the unique ID
        return "" + firstLetterOfName + " : "  + lastDigitOfAge;
    }
    
}
