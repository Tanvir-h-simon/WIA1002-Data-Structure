import java.util.Scanner;

public class T09Q04 {
    public static int sum(int n) {
        if (n == 1) return 1; // Base case
        else return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num == 0) {
            System.out.println("Enter a valid number.");
            return;
        }

        System.out.println("Summation of " + num + " to 1 = " + sum(num));
    }
}