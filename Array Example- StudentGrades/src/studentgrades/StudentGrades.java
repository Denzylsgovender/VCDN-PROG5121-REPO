package studentgrades;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize arrays to store student names and grades
        String[] studentNames = new String[5];
        int[] grades = new int[5];
        
        // Prompt the user to input data for student names and grades
        System.out.println("Enter the names of 5 students and their corresponding grades:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i+1) + " name: ");
            studentNames[i] = scanner.nextLine();
            System.out.print("Student " + (i+1) + " grade: ");
            grades[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        }
        
        // Calculate the average grade
        double totalGrade = 0;
        for (int grade : grades) {
            totalGrade += grade;
        }
        
        double averageGrade = totalGrade / grades.length;
        
        // Display students' names and grades
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student Name: " + studentNames[i] + ", Grade: " + grades[i]);
        }
        System.out.println("Class Average Grade: " + averageGrade);
    }
}

