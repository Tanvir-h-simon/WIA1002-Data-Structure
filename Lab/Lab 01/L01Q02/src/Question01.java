import java.io.BufferedReader;
import java.io.FileReader;

public class Question01 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/text1.txt"));
            // String line;
            // int totalLength = 0;
            // while ((line = br.readLine()) != null) {
            //     totalLength += line.length();
            // }
            // System.out.println(totalLength);

            // String cleanedText = br.readLine().replaceAll("[^a-zA-Z0-9]", "");
            // System.out.println("Clearned text: " + cleanedText);
            // System.out.println("Length without special chars: " + cleanedText.length());
            //
            // System.out.println("Individual characters:");
            // for (int i = 0; i < cleanedText.length(); i++) {
            //     System.out.print(cleanedText.charAt(i) + " ");
            // }
            // br.close();

            String line, totalCleanedText = "";
            int totalLength = 0;
            System.out.println("Clearned text:");
            while ((line = br.readLine()) != null) {
                String cleanedText = line.replaceAll("[^a-zA-Z0-9]", ""); // ^: Start of line.
                totalCleanedText += cleanedText;
                totalLength += cleanedText.length();
                System.out.println(cleanedText);
            }
            System.out.println("\nLength without special chars: " + totalCleanedText.length());

            System.out.println("\nIndividual characters:");
            for (int i = 0; i < totalCleanedText.length(); i++) {
                System.out.print(totalCleanedText.charAt(i) + " ");
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}