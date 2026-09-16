import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Telephone phone1 = new Telephone("03", "79676300");
        // Telephone phone2 = new Telephone("03", "79676301");
        // Telephone phone3 = new Telephone("03", "79676302");
        // Telephone phone4 = new Telephone("03", "79676303");
        // Telephone phone5 = new Telephone("03", "79676304");

        // System.out.println(phone1.makeFullNumber());
        // System.out.println(phone2.makeFullNumber());
        // System.out.println(phone3.makeFullNumber());
        // System.out.println(phone4.makeFullNumber());
        // System.out.println(phone5.makeFullNumber());

        // Telephone[] telephones = new Telephone[5];
        //
        // telephones[0] = new Telephone("03", "79676300");
        // telephones[1] = new Telephone("03", "79676301");
        // telephones[2] = new Telephone("03", "79676302");
        // telephones[3] = new Telephone("03", "79676303");
        // telephones[4] = new Telephone("03", "79676304");
        //
        // for (int i = 0; i < telephones.length; i++) {
        //     System.out.println(telephones[i].makeFullNumber());
        // }

        ArrayList<Telephone> telephones =  new ArrayList<>();

        // telephones.add(phone1);
        // telephones.add(phone2);
        // telephones.add(phone3);
        // telephones.add(phone4);
        // telephones.add(phone5);


        telephones.add(new Telephone("03", "79676300"));
        telephones.add(new Telephone("03", "79676301"));
        telephones.add(new Telephone("03", "79676302"));
        telephones.add(new Telephone("03", "79676303"));
        telephones.add(new Telephone("03", "79676304"));

        for (Telephone telephone : telephones) {
            System.out.println(telephone.makeFullNumber());
        }

        System.out.println("Number of telephones object: " + Telephone.numberOfTelephoneObject); // Static variable belongs to class, not object
    }
}