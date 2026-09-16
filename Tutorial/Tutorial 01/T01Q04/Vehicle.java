public abstract class Vehicle {
    private final double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    // Abstract method
    public abstract void accelerate();

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void pedalToTheMetal() {
        while (currentSpeed < maxSpeed) {
            accelerate();\
        }
    }
}