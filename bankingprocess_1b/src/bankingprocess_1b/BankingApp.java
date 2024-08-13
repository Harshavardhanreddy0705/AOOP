package bankingprocess_1b;

public class BankingApp {
    public static void main(String[] args) {
        // Get the single instance of the UserSession
        UserSession session = UserSession.getInstance();

        // Attempt to perform operations without logging in
        BankOperations operations = new BankOperations();
        operations.viewBalance();
        operations.deposit(200);
        operations.withdraw(100);

        // Log in and perform operations
        session.login("JohnDoe");
        operations.viewBalance();
        operations.deposit(200);
        operations.withdraw(100);

        // Attempt to log in again with the same user
        session.login("JohnDoe");

        // Log out and attempt to perform operations
        session.logout();
        operations.viewBalance();
        operations.deposit(200);
    }
}
