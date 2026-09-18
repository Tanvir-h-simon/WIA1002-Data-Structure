class Dispenser {
    private int numberOfItems;
    private double cost;

    public Dispenser() {
        numberOfItems = 50;
        cost = 0.0;
    }

    public Dispenser(int numberOfItems, double cost) {
        this.numberOfItems = numberOfItems;
        this.cost = cost;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public double getCost() {
        return cost;
    }

    public void makeSale() {
        if (numberOfItems > 0) {
            numberOfItems--;
        }
    }
}
