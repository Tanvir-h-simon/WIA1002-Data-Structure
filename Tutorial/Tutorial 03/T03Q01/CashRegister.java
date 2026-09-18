class CashRegister {
    private double cashOnHand;

    public CashRegister() {
        cashOnHand = 500.0;
    }

    public CashRegister(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public double getCurrentBalance() {
        return cashOnHand;
    }

    public void acceptAmount(double amount) {
        cashOnHand += amount;
    }

    public double calculateChange(double amountPaid, double cost) {
        return amountPaid - cost;
    }
}