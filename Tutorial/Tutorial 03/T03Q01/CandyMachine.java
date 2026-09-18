class CandyMachine {
    private Dispenser candy;
    private Dispenser chips;
    private Dispenser gum;
    private Dispenser cookies;

    private CashRegister cashRegister;

    public CandyMachine() {
        candy = new Dispenser(100, 1.50);
        chips = new Dispenser(100, 1.00);
        gum = new Dispenser(100, 0.75);
        cookies = new Dispenser(100, 2.00);

        cashRegister = new CashRegister();
    }

    public void displayProducts() {
        System.out.println("1. Candy   - RM 1.50");
        System.out.println("2. Chips   - RM 1.00");
        System.out.println("3. Gum     - RM 0.75");
        System.out.println("4. Cookies - RM 2.00");
    }

    public void makeSelection(int choice) {
        // Select product
    }

    public void acceptMoney(double amount) {
        cashRegister.acceptAmount(amount);
    }

    public void returnChange(double amount) {
        System.out.println("Change: RM " + amount);
    }

    public void releaseItem() {
        // Release selected item
    }
}