
package com.mycompany.productmanagementsystem;

import javax.swing.JOptionPane;


public class ProductManagementSystem {

    public static void main(String[] args) {
        // Product Registration
        String productId = JOptionPane.showInputDialog("Enter Product ID (format: P-XXXX where X is a digit):");
        String productName = JOptionPane.showInputDialog("Enter Product Name:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Product Quantity:"));

        Product product = new Product(productId, productName, quantity);

        String registrationMessage = product.registerProduct();
        JOptionPane.showMessageDialog(null, registrationMessage);

        if (!registrationMessage.equals("Product registered successfully.")) {
            System.exit(0);
        }

        // Product Availability Check
        int requestedQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity to purchase:"));
        boolean isAvailable = product.checkProductAvailability(requestedQuantity);
        String productStatus = product.returnProductStatus(isAvailable);
        JOptionPane.showMessageDialog(null, productStatus);
    }
    
}
