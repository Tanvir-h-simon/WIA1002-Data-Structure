import java.util.Scanner;

public class L09Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter m: ");
        int m = input.nextInt();

        System.out.println(exponent(x, m));
    }

    public static long exponent(int x, int m) {
        // Base case: anything to the power 0 is 1
        if (m == 0) {
            return 1;
        }
        return x * exponent(x, m - 1);
    }
}