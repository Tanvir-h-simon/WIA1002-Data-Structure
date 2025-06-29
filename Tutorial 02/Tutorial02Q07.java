import java.util.ArrayList;

public class Tutorial02Q07 {
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();

        // Optional Code

        vehicle.add("Tesla");
        vehicle.add("BYD");
        vehicle.add("Toyota");

        transportation.add("Car ");
        transportation.add(1234);

        System.out.println("Transportation Type and number:");
        allTransportation(transportation);

        System.out.println("Vehicle list:");
        allTransportation(vehicle);
    }

    public static void allTransportation(ArrayList<?> value) {
        for (Object e : value) {
            System.out.println(e);
        }
        System.out.println();
    }
}