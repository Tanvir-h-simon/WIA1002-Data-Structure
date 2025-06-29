// Tutorial02

public class Tutorial02Q02 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] alphabet = {'a', 'b', 'c'};

        printArray(numbers);
        printArray(names);
        printArray(alphabet);
    }

    public static <E> void printArray(E[] arr) {
        for (E item : arr) {
            System.out.println(item + " ");
        }
        System.out.println();
    }
}