import java.util.Scanner;

public class T09Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        reverse(str, 0);
    }

/*    public static void reverse(String str, int index) {
        if (index == str.length()) {
            return;
        }
        System.out.print(str.charAt(index));
        reverse(str, index + 1);
    }*/

    public static void reverse(String str, int index) {
        if (index == str.length()) {
            return;
        }
        reverse(str, index + 1);
        System.out.print(str.charAt(index));
    }
}