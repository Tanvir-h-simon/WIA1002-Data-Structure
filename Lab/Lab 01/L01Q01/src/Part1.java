import java.io.BufferedReader;
import java.io.FileReader;

public class Part1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/TanvirHossain_23121478.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}