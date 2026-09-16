import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/TanvirHossain_23121478.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("data/TanvirHossain_23121478_final.txt"));

            String line;
            // Copy the first 9 lines to the new file
            for (int i = 1; i <= 9; i++) {
                line = br.readLine(); // Read the line
                if (line != null) {
                    bw.write(line); // Store(write) the line
                    bw.newLine(); // Consume a space line
                }
            }

            bw.newLine();
            bw.append("Tuesday, 1 July 2025.");
            bw.newLine();
            bw.newLine();
            bw.append("It's me again. Finally, it's the end of the term and the DS class has finished! I think I did worst in this course.");
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        //
        // try {
        //     BufferedReader br = new BufferedReader(new FileReader("data/TanvirHossain_23121478_final.txt"));
        //     String line;
        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }
        //     br.close();
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

        try {
            Scanner sc = new Scanner(new FileReader("data/TanvirHossain_23121478_final.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}