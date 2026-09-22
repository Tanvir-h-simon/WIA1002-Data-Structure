public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 34, 2, 56, 7, 67, 88, 42};

        System.out.print("Before: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("After: ");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}