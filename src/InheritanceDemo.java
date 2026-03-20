// Demo Inheritance
class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be positive");
        balance = balance + amount;
    }

    public void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Transaction cannot be done");
        }
    }

    public void displayBalance() {
        System.out.println(balance);
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withDraw(double amount) {
        if (balance > 1000 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("withdrawal is not allowed");
        }
    }
}

class CheckingAccount extends Account {

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withDraw(double amount) {
        balance = balance - amount;
        if (balance < (-500)) {
            System.out.println("overdraft is used");
        }
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("ABC", 2000);
        CheckingAccount checkingAccount = new CheckingAccount("ABC", 2000);
        savingsAccount.displayBalance();
        checkingAccount.displayBalance();
        savingsAccount.withDraw(1500);
        savingsAccount.displayBalance();
        checkingAccount.withDraw(3000);
        checkingAccount.displayBalance();
    }
}