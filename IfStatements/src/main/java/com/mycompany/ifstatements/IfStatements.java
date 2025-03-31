//Code attributions
//  OpenAI. 2024. Chat-GPT (Version 3.5). [Large Language Model]. Available at:Insert your link here [Accessed: 31 March 2025]. 
   
//Title: Classes and Objects in Java*    
//Author: geeksforgeeks*    
//Date: 2024
//Code version: 2.0*    
//Availability: https://www.geeksforgeeks.org/classes-objects-java/ 

package com.mycompany.ifstatements;

import java.util.Scanner;
public class IfStatements {

    //Method to check if the input number is equyal to 7
    public static void checkNumber(int InputNumber)
    {
        if ( InputNumber ==7)//if condition is true
        {
            System.out.println("This is my lucky number 7");  
        }
        else//if condition is false
        {
         System.out.println("This number is unknown to me...");     
        }     
    }
    
    public static void checkAge(int InputAge)
    {
        if ( InputAge >=18)//if condition is true
        {
            System.out.println("You are eligible");
            System.out.println("You may enter the club");   
        }
        else//if condition is false
        {
          System.out.println("You are not eligible");
            System.out.println("Go to funtubbles");      
        }     
    }
    //Method to check eligibility based on gender and age
      public static void checkEligibility(String gender, Scanner scanner)
    {
        if ( gender.equals("male"))//if condition is true
        {
            System.out.println("Enter your age: ");
            int age= scanner.nextInt();
            
            if (age >=18)//Nested if
            {
               System.out.println("You are eligible for access");  
            }
            else
            {
              System.out.println("You are not eligible for access");    
            }//end of nested if
        }
        else//if condition is false
        {
         
            System.out.println("You are not eligible for access");      
        }     
    }
    
    public static void main(String[] args) {
       Scanner scanner= new Scanner( System.in);
       //Activity 1
        System.out.println("Please enter a whole number....");
        int inputnumber= scanner.nextInt();
        scanner.nextLine();//Consume newline character- do this if your system acts up
        checkNumber(inputnumber);
        
        System.out.println("--------------------------------------------");
        //Activity 2
            System.out.println("Please enter your age....");
        int inputage= scanner.nextInt();
        scanner.nextLine();//Consume newline character- do this if your system acts up
        checkAge(inputage);
        System.out.println("--------------------------------------------");
          //Activity 3
        System.out.println("Are you male or female? (Type 'male' or 'female') ");
        String gender= scanner.nextLine();
       checkEligibility(gender,scanner);
    }
    
}






