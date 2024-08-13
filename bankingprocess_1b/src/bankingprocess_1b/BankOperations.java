package bankingprocess_1b;

//BankOperations.java
public class BankOperations {
 private double balance = 1000.0;

 // Method to view the balance
 public void viewBalance() {
     if (UserSession.getInstance().isLoggedIn()) {
         System.out.println("Current balance: $" + balance);
     } else {
         System.out.println("Please log in to view your balance.");
     }
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (UserSession.getInstance().isLoggedIn()) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
         System.out.println("New balance: $" + balance);
     } else {
         System.out.println("Please log in to deposit money.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (UserSession.getInstance().isLoggedIn()) {
         if (amount <= balance) {
             balance -= amount;
             System.out.println("Withdrew: $" + amount);
             System.out.println("New balance: $" + balance);
         } else {
             System.out.println("Insufficient balance.");
         }
     } else {
         System.out.println("Please log in to withdraw money.");
     }
 }
}
