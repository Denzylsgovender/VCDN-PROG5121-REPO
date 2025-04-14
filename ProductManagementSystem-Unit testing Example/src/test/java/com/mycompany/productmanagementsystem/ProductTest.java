
package com.mycompany.productmanagementsystem;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductTest {
     @Test
    void testCheckProductIdFormat_Correct() {
        Product product = new Product("P-1234", "Laptop", 10);
        assertTrue(product.checkProductIdFormat());
    }

    @Test
    void testCheckProductIdFormat_Incorrect() {
        Product product = new Product("1234-P", "Laptop", 10);
        assertFalse(product.checkProductIdFormat());
    }

    @Test
    void testRegisterProduct_Success() {
        Product product = new Product("P-5678", "Mouse", 5);
        assertEquals("Product registered successfully.", product.registerProduct());
    }

    @Test
    void testRegisterProduct_Fail_InvalidId() {
        Product product = new Product("5678", "Mouse", 5);
        assertEquals("Product ID is incorrectly formatted (must be 'P-XXXX' where X is a digit).", product.registerProduct());
    }

    @Test
    void testRegisterProduct_Fail_NegativeQuantity() {
        Product product = new Product("P-5678", "Mouse", -1);
        assertEquals("Quantity cannot be negative.", product.registerProduct());
    }

    @Test
    void testCheckProductAvailability_Available() {
        Product product = new Product("P-5678", "Keyboard", 10);
        assertTrue(product.checkProductAvailability(5));
    }

    @Test
    void testCheckProductAvailability_NotAvailable() {
        Product product = new Product("P-5678", "Keyboard", 2);
        assertFalse(product.checkProductAvailability(5));
    }

    @Test
    void testReturnProductStatus_Available() {
        Product product = new Product("P-5678", "Monitor", 3);
        assertEquals("Product Monitor is available.", product.returnProductStatus(true));
    }

    @Test
    void testReturnProductStatus_NotAvailable() {
        Product product = new Product("P-5678", "Monitor", 3);
        assertEquals("Insufficient stock for Monitor.", product.returnProductStatus(false));
    }
    
    
}
