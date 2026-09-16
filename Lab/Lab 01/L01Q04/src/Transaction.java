import java.util.Date;

public class Transaction {
    Date date;
    char type;
    double amount;
    double balance;
    String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date(); // Current date
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return date + " " + type + " " + amount + " " + balance + " " + description;
    }
}