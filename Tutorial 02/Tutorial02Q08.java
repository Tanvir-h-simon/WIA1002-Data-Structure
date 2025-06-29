import java.util.ArrayList;

public class Tutorial02Q08 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();

        // Optional Code
        numOfCars.add(5);
        milesPerHour.add(57.6);

        method(numOfCars);
        method(milesPerHour);
    }

    public static void method(ArrayList<?> value) {
        for (Object e : value) {
            System.out.println(e);
        }
    }
}
