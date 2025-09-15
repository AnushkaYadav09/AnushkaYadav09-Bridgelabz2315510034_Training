public class MainDemo1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001, 5000);
        BankAccount acc2 = new BankAccount("Bob", 1002, 3000);

        acc1.displayDetails();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
