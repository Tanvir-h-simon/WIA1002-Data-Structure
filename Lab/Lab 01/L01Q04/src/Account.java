import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    String name;
    int id;
    private double balance;
    private static double annualInterestRate; // All accounts have same interest rate
    LocalDate dateCreated;
    private ArrayList<Transaction> transactions;

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = LocalDate.now(); // Current date
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public double getMonthlyInterestRate() {
        return (getAnnualInterestRate() / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdraw"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}