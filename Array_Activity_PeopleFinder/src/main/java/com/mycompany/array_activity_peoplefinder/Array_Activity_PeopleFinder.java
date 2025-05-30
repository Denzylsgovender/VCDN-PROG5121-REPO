
package com.mycompany.array_activity_peoplefinder;

import java.util.Scanner;


 public class Array_Activity_PeopleFinder {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        String[] names = {"Denzyl", "Felicia", "Yusuf", "Batista", "Brock"};
        String[] locations = {"Cape Town", "Durban North", "Pretoria", "Westville", "Ballito"};
        String[] occupations = {"IT Lecturer", "Business Lecturer", "Software Engineer", "Wrestler", "Chef"};
        int size = 5;
        
        int choice;

        do {
            System.out.println("\n====== People Menu ======");
            System.out.println("1. Search by name");
            System.out.println("2. Find longest name");
            System.out.println("3. Delete a person");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1: // Search by name
                   
                    System.out.print("Enter a name to search: ");
                    String searchName = input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {
                            System.out.println("Name: " + names[i]);
                            System.out.println("Location: " + locations[i]);
                            System.out.println("Occupation: " + occupations[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Person not found.");
                    }
                    break;

                case 2:// Find longest name
                    
                    if (size == 0) {
                        System.out.println("List is empty.");
                        break;
                    }
                    String longestName = names[0];
                    for (int i = 1; i < size; i++) {
                        if (names[i].length() > longestName.length()) {
                            longestName = names[i];
                        }
                    }
                    System.out.println("Longest name: " + longestName);
                    break;

                case 3:// Delete a person
                    //Code attribution
                    //Title:How to Remove Array Elements in Java
                    //Author:Jayant Verma and Anish Singh Walia
                    //Date:02 May 2025
                    //Version:1
                    //Availability: https://www.digitalocean.com/community/tutorials/java-remove-array-elements
                   
                    System.out.print("Enter a name to delete: ");
                    String deleteName = input.nextLine();
                    int deleteIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (names[i].equalsIgnoreCase(deleteName)) {
                            deleteIndex = i;
                            break;
                        }
                    }

                    if (deleteIndex != -1) {
                        // Shift left
                        for (int i = deleteIndex; i < size - 1; i++) {
                            names[i] = names[i + 1];
                            locations[i] = locations[i + 1];
                            occupations[i] = occupations[i + 1];
                        }
                        size--; // reduce size
                        System.out.println("Person deleted. Updated list:");
                        for (int i = 0; i < size; i++) {
                            System.out.println("Name: " + names[i] + ", Location: " + locations[i] + ", Occupation: " + occupations[i]);
                        }
                    } else {
                        System.out.println("Person not found. Nothing deleted.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }

        } while (choice != 4);   
        
    }
}
