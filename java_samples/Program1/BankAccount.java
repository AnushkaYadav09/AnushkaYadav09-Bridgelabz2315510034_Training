public class BankAccount {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    public final int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName; // using 'this' to resolve ambiguity
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }
}
