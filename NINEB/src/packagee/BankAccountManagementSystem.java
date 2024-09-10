package packagee;

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        // Create a shared bank account with an initial balance
        BankAccount account = new BankAccount(1000);

        // Create multiple user threads performing deposits and withdrawals
        User user1 = new User(account, true, 200, "User1");
        User user2 = new User(account, false, 500, "User2");
        User user3 = new User(account, true, 300, "User3");
        User user4 = new User(account, false, 800, "User4");
        User user5 = new User(account, true, 600, "User5");

        // Start the threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();

        // Wait for all threads to finish
        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
