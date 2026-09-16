public class Main {
    public static void main(String[] args) {
        // Vehicle car = new Vehicle(100); // Vehicle class is abstract

        Vehicle car = new Car(100);
        car.pedalToTheMetal();
        System.out.println(car.getCurrentSpeed());
    }
}