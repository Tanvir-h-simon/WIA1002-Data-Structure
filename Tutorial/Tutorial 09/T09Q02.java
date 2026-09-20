import java.util.Scanner;

public class T09Q02 {
    public static int f(int n) {
        // if (n == 0)
        //     return n;
        // else
        //     return f(n+1) + n; // java.lang.StackOverflowError

        if (n == 0) return n; // Base case
        else return f(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Summation of 0 to " + num + ": " + f(num));
    }
}