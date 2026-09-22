import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class T10Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {3, 8, 12, 34, 54, 85, 61, 110};
        Arrays.sort(arr);
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Enter the key value: ");
        int key = input.nextInt();

        System.out.println("Linear Search: ");
        int indexL = linearSearch(arr, key);
        display(indexL);


        System.out.println("Binary Search: ");
        // int indexB = binarySearch(arr, key);
        int indexB = Arrays.binarySearch(arr, key);
        display(indexB);

    }

    public static void display(int index) {
        // if (index == -1) {
        //     System.out.println("Not found");
        if (index < 0) {
            System.out.println("Not found");
        } else {
            System.out.println("Index: " + index);
        }
    }

    public static int linearSearch(int[] arr, int key) { // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // public static int binarySearch(int[] arr, int key) { // O(log n)
    //     int left = 0, right = arr.length - 1;
    //
    //     while (left <= right) {
    //         int mid = (left + right) / 2;
    //
    //         if (key == arr[mid]) {
    //             return mid;
    //         } else if (key < arr[mid]) {
    //             right = mid - 1;
    //         } else if (key > arr[mid]) {
    //             left = mid + 1;
    //         }
    //     }
    //     return -1;
    // }
}