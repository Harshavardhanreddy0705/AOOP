package packagee;

class User extends Thread {
    private BankAccount account;
    private boolean isDeposit;
    private double amount;

    // Constructor
    public User(BankAccount account, boolean isDeposit, double amount, String userName) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
        this.setName(userName);  // Set thread name
    }

    // Simulate deposit or withdrawal
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
