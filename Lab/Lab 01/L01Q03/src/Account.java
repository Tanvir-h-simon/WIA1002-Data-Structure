import java.time.LocalDate;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate; // All accounts have same interest rate
    private LocalDate dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = LocalDate.now(); // Current date
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    // public void setDateCreated(LocalDate dateCreated) {
    //     this.dateCreated = dateCreated;
    // }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (getAnnualInterestRate() / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        // balance = balance - amount;
        balance -= amount;
    }

    public void deposit(double amount) {
        // balance =  balance + amount;
        balance += amount;
    }

    // public String toString() {
    //     return "ID: " + getId() +
    //             "\nBalance: " + getBalance() +
    //             "\nMonthly Interest: " + getMonthlyInterest() +
    //             "\nDate Created: " + getDateCreated();
    // }
}