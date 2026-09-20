import java.util.Scanner;

public class L09Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // if (!str.contains("a")) {
        //     System.out.println(str);
        //     return;
        // }
        //
        // String replacedStr = "";
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == 'a') {
        //         replacedStr = str.replace('a', 'i');
        //     }
        // }
        //
        // System.out.println(replacedStr);

        System.out.println(substituteAI(str));
    }

    public static String substituteAI(String str) {
        if (str.isEmpty()) { // Base case
            return "";
        }

        char first = str.charAt(0);
        String rest = substituteAI(str.substring(1));

        if (first == 'a') {
            return "i" + rest;
        }
        return first + rest;
    }
}