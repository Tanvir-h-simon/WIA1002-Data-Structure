import java.util.ArrayList;
import java.util.Scanner;

public class L09Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        ArrayList<String> result = permuteString(word);
        for (String p : result) {
            System.out.println(p);
        }
        System.out.println();
    }

    public static ArrayList<String> permuteString(String str) {
        ArrayList<String> result = new ArrayList<>();

        // Base case: 0 or 1 characters has only one arrangement
        if (str.length() <= 1) {
            result.add(str);
            return result;
        }

        char first = str.charAt(0);
        ArrayList<String> smaller = permuteString(str.substring(1));

        for (String perm : smaller) {
            insertChar(first, perm, result);
        }
        return result;
    }

    public static void insertChar(char ch, String perm, ArrayList<String> result) {
        for (int i = 0; i <= perm.length(); i++) {
            result.add(perm.substring(0, i) + ch + perm.substring(i));
        }
    }
}