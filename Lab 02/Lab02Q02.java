public class Lab02Q02 { // class CompareMax
    public static void main(String[] args) {
        System.out.println("Maximum number: " + maximum(3, 4, 5));
    }

    public static <T extends Comparable <T>> T maximum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}