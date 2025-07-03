import java.util.Stack;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 3;

        Stack<Integer> source = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        for (int i = numberOfDisks; i > 0; i--) {
            source.push(i);
        }

        System.out.println("Initial State: ");
        printTowers(source, helper, destination);

        moveDisks(numberOfDisks, source, helper, destination, "Source", "Helper", "Destination");

        System.out.println("Final State: ");
        printTowers(source, helper, destination);
    }

    public static void moveDisks(int numOfDisks, Stack<Integer> source, Stack<Integer> helper, Stack<Integer> destination, String sourceName, String helperName, String destinationName) {
        if (numOfDisks == 1) {
            int disk = source.pop();
            destination.push(disk);
            System.out.println("Move disk " + disk + " from " + sourceName + " to " + destinationName);
            return;
        }

        // Move n-1 disks from source to helper
        moveDisks(numOfDisks - 1, source, destination, helper, sourceName, destinationName, helperName);

        // Move the nth disk from source to destination
        int disk = source.pop();
        destination.push(disk);
        System.out.println("Move disk " + disk + " from " + sourceName + " to " + destinationName);

        // Move n-1 disks from helper to destination
        moveDisks(numOfDisks - 1, helper, source, destination, helperName, sourceName, destinationName);
    }

    public static void printTowers(Stack<Integer> source, Stack<Integer> helper, Stack<Integer> destination) {
        System.out.println("Source: " + source);
        System.out.println("Helper: " + helper);
        System.out.println("Destination: " + destination);
    }
}