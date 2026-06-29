// Abstraction
abstract class BankAccount {

    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    // Abstract Method
    abstract void calculateInterest();

    public void showDetails() {
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Inheritance
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Savings Interest = " + (balance * 0.04));
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Interest = " + (balance * 0.02));
    }
}

// Compile Time Polymorphism
class Calculator {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class oops {

    public static void main(String[] args) {

        // Runtime Polymorphism
        BankAccount acc1 = new SavingsAccount("Arun", 50000);
        BankAccount acc2 = new CurrentAccount("Rahul", 50000);

        acc1.showDetails();
        acc1.calculateInterest();

        System.out.println();

        acc2.showDetails();
        acc2.calculateInterest();

        System.out.println();

        acc1.deposit(10000);
        System.out.println("Updated Balance: " + acc1.getBalance());

        System.out.println();

        // Compile Time Polymorphism
        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(10, 20, 30);
    }
}