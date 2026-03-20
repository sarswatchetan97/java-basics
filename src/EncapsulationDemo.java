//Example of bank account scenario

public class EncapsulationDemo {
    private double balance;
    private final String accountNumber;

    public EncapsulationDemo(double initialBalance, String accountNumber) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance = balance + amount;
    }

    public boolean withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo(1000,"ABC");
        encapsulationDemo.deposit(1000);
        System.out.println(encapsulationDemo.getBalance());
        encapsulationDemo.withDraw(1500);
        System.out.println(encapsulationDemo.getBalance());
    }
}
