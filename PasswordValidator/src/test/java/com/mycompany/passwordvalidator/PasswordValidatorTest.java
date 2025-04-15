
package com.mycompany.passwordvalidator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PasswordValidatorTest {
    
   @Test
    void testValidPassword() {
        assertEquals("Password is valid.", PasswordValidator.validatePassword("GoodPass1!"));
    }
      @Test
    void testInValidPassword() {
        assertEquals("Password is invalid. Must include uppercase, lowercase, number, special char, and be 8+ chars.", PasswordValidator.validatePassword("Good"));
    }
}
