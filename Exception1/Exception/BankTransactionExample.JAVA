public class BankTransactionExample {
    static double balance = 5000;

    static void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0)
            throw new IllegalArgumentException("Invalid amount!");
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {
        try {
            withdraw(2000);
            withdraw(4000); // Will trigger InsufficientBalanceException
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }}