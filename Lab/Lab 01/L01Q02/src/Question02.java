import java.io.BufferedReader;
import java.io.FileReader;

public class Question02 {
    public static void processFile(String filename, String removePattern) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/" + filename));
            String line;
            String allCleanedText = "";
            int totalCount = 0;

            System.out.println("Reading from: " + filename);
            System.out.println("Cleaned text: ");
            while ((line = br.readLine()) != null) {
                String cleaned = line.replaceAll(removePattern, "");
                allCleanedText += cleaned;
                totalCount += cleaned.length();
                System.out.println(cleaned);
            }
            br.close();

            System.out.println("Total characters (without special chars): " + totalCount);

            System.out.println("All characters: " + allCleanedText);
            System.out.println("Individual characters:");
            for (int i = 0; i < allCleanedText.length(); i++) {
                System.out.print(allCleanedText.charAt(i) + " ");
            }
            System.out.println("\n");

        } catch (Exception e) {
            System.out.println("Error reading " + filename + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        processFile("text1.txt", "[,]");
        processFile("text2.txt", "[, ]");
        processFile("text3.txt", "[; ]");
        processFile("text4.txt", "[0-9]");
    }
}