//Code Attributions

//Title: Regex for Passwords
//Author:Temitope Ayodele
//Date:03 September 2020
//Version:1
//Availability:https://dev.to/temmietope/regex-for-passwords-3c1f


package com.mycompany.passwordvalidator;

import javax.swing.JOptionPane;


public class PasswordValidator {

    
    public static String validatePassword(String password) 
    {
        if (password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")) 
        {
            return "Password is valid.";
        } 
        else 
        {
            return "Password is invalid. Must include uppercase, lowercase, number, special char, and be 8+ chars.";
        }
    }
    
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Enter your password:");
        String result = PasswordValidator.validatePassword(password);
        JOptionPane.showMessageDialog(null, result);
    }
}
