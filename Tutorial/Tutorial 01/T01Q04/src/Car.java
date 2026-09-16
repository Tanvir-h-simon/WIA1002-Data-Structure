public class Car extends Vehicle {
    public Car(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void accelerate() {
        currentSpeed += 10;
        if (currentSpeed > getMaxSpeed()) {
            currentSpeed = getMaxSpeed();
        }
    }
}