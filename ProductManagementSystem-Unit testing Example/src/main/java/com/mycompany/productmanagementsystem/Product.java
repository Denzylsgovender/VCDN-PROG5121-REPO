
package com.mycompany.productmanagementsystem;


public class Product {
     private String productId;
    private String productName;
    private int quantity;

    public Product(String productId, String productName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }
//Code Attributions
//OpenAI. 2024. Chat-GPT (Version 3.5). [Large language model]. Available at: https://chatgpt.com/share/67e98306-a324-8007-901d-34a392ef55f2 [Accessed: 31 March 2025].
   
    // Validate product ID format (P- followed by 4 digits)
    public boolean checkProductIdFormat() {
        return productId.matches("P-\\d{4}");
    }
//  P- → The productId must start with "P-" (a fixed prefix).
//  \\d → Represents a digit (0-9).
//  {4} → Ensures exactly 4 digits after "P-".
//  \\d{4} → Ensures the 4-digit requirement.
    
    // Register product
    public String registerProduct() {
        if (!checkProductIdFormat()) {
            return "Product ID is incorrectly formatted (must be 'P-XXXX' where X is a digit).";
        }
        if (quantity < 0) {
            return "Quantity cannot be negative.";
        }
        return "Product registered successfully.";
    }

    // Check product availability
    public boolean checkProductAvailability(int requestedQuantity) {
        return quantity >= requestedQuantity;
    }

    // Return product status message
    public String returnProductStatus(boolean isAvailable) {
        if (isAvailable) {
            return "Product " + productName + " is available.";
        } else {
            return "Insufficient stock for " + productName + ".";
        }
    }
}
