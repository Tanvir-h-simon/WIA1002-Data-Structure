import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Account client1 = new Account(1122, 20000);
        // client1.setId(1122);
        // client1.setBalance(20000);
        Account.setAnnualInterestRate(4.5); // Percentage // Static variable belongs to class
        // client1.setDateCreated(LocalDate.parse("2025-04-20"));
        client1.withdraw(2500);
        client1.deposit(3000);

        double balance = client1.getBalance();
        System.out.println("Balance: "+ balance + " RM");
        double monthlyInterest = client1.getMonthlyInterest();
        System.out.println("Monthly Interest: " + monthlyInterest + " RM");
        System.out.println("This account was created: " + client1.getDateCreated());
    }
}