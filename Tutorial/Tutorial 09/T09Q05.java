import java.util.Scanner;

public class T09Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // printDigitHelper(num);

        printDigit(num);
    }

/*    public static void printDigitHelper(int num) {
        String number = String.valueOf(num);

        printDigit(number, 0);
    }

    public static void printDigit(String number, int index) {
        if (index == number.length()) {
            return; // Base case
        }

        System.out.print(number.charAt(index) + " ");
        printDigit(number, index + 1);
    }*/

    public static void printDigit(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            printDigit(n / 10);
            System.out.print(" " + (n % 10));
        }
    }
}