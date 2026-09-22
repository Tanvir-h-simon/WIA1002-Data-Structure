import java.util.Arrays;
import java.util.Collections;

public class T10Q02 {
    public static void main(String[] args) {
        int[] arr = {90, 8, 7, 56, 125, 237, 9, 1, 653};

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // selectionSort(arr);

        // insertionSort(arr);

        // bubbleSort(arr);

        // Arrays.sort(arr); // O(n log n)
        // Arrays.sort(arr, 0, 3);
        // Integer[] arr = {90, 8, 7, 56, 125, 237, 9, 1, 653};
        // Arrays.sort(arr, Collections.reverseOrder());

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }

    }

    public static void selectionSort(int[] arr) { // O(n^2)
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) { // O(n^2)
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1; // prev
            int temp = arr[i]; // curr

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void bubbleSort(int[] arr) { // O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid); // Sort left part
        mergeSort(arr, mid + 1, right); // Sort right part
        merge(arr, left, mid, right); // Merge the two sorted halves
    }

    public static void merge(int[] arr, int left, int mid, int right) { // Time = O (n log n), Space = O (n)
        int n1 = mid - left + 1; // Size of left half
        int n2 = right - mid; // Size of right half

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Pick the smaller front element from each half
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy whatever is left over
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}