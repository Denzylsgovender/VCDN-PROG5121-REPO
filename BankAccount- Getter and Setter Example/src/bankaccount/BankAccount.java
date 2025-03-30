
package bankaccount;


public class BankAccount {
 private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Ensures no negative balance at start
        }
    }

    // Getter - Read balance, but cannot modify directly
    public double getBalance() {
        return balance;
    }

    // Setter - Add validation before modifying balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
   
    
}
