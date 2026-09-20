import java.util.Scanner;

public class T09Q01 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base Case
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Factorial of the number: " + factorial(num));
    }
}