
package uniqueidgenerator;

import java.util.Scanner;

public class UniqueIDGenerator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Input ID, part of the name, and part of the surname
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter part of the first name: ");
        String firstNamePart = scanner.nextLine();

        System.out.print("Enter part of the surname: ");
        String surnamePart = scanner.nextLine();

        // Generate modified unique ID by combining inputs
        String modifiedUniqueID = generateModifiedUniqueID(id, firstNamePart, surnamePart);

        // Output the modified unique ID
        System.out.println("Modified Unique ID: " + modifiedUniqueID);

        scanner.close();
    }
      
    
    // Method to generate modified unique ID
    private static String generateModifiedUniqueID(String id, String firstNamePart, String surnamePart) {
        // Extract first four numbers of the ID
        String idNumbers = id.substring(0, 4);

        // Extract last two characters of the first name
        String firstNameInitials = "";
        if (firstNamePart.length() >= 2) {
            firstNameInitials = firstNamePart.substring(firstNamePart.length() - 2);
        } else {
            firstNameInitials = firstNamePart;
        }

        // Extract first three characters of the surname
        String surnameInitials = "";
        if (surnamePart.length() >= 3) {
            surnameInitials = surnamePart.substring(0, 3);
        } else {
            surnameInitials = surnamePart;
        }

        // Combine all parts to create modified unique ID
        String modifiedUniqueID = idNumbers + ":" +firstNameInitials + surnameInitials;
        return modifiedUniqueID;
    }
}
