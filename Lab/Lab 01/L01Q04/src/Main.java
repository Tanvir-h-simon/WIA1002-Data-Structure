public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Tanvir Hossain",1122, 1000);
        Account.setAnnualInterestRate(1.5); // Percentage

        account1.withdraw(5);
        account1.withdraw(4);
        account1.withdraw(2);

        account1.deposit(30);
        account1.deposit(40);
        account1.deposit(50);

        System.out.println("Account name: " + account1.name);
        System.out.println("Account ID: " + account1.id);
        double balance = account1.getBalance();
        System.out.println("Balance: $"+ balance);
        double monthlyInterest = account1.getMonthlyInterest();
        System.out.println("Monthly interest: $" + monthlyInterest);
        System.out.println("This account was created: " + account1.dateCreated);

        System.out.println("Transaction history: ");
        for (Transaction t : account1.getTransactions()) {
            System.out.println(t);
        }
    }
}