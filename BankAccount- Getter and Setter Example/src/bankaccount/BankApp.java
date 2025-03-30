
package bankaccount;


public class BankApp {
     public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(2000); // Should not allow this
    }
}
