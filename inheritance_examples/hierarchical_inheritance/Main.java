public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("SAV001", 10000, 3.5);
        CheckingAccount c = new CheckingAccount("CHK001", 2000, 5000);
        FixedDepositAccount f = new FixedDepositAccount("FD001", 50000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
