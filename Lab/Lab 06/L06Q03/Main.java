import java.util.ArrayList;

public class Main {
    static Stack<Integer> S = new Stack<>();

    public static void main(String[] args) {

        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        S.push(50);

        System.out.println("Sum = " + sumAlgorithms());

    }

    public static int sumAlgorithms() {
        Stack<Integer> temp = new Stack<>();

        int sum = 0;
        while(!S.isEmpty()) {
            int element = S.pop(); // Pop all elements from S stack
            sum += element; // Calculate sum
            temp.push(element); // Store in auxiliary stack
        }

        // Restore original stack
        while (!temp.isEmpty()) {
            S.push(temp.pop());
        }

        return sum;
    }

/*    public static int sumAlgorithms() {
        ArrayList<Integer> temp = new ArrayList<>();

        int sum = 0;
        // Pop all elements, store in the array, calculate sum
        while (!S.isEmpty()) {
            int element = S.pop();
            sum += element;
            temp.add(element);
        }

        // Restore stack in reverse order
        for (int i = temp.size() - 1; i >= 0; i--) {
            S.push(temp.get(i));
        }

        return sum;
    }*/

/*    public static int sumAlgorithms() {
        if (S.isEmpty()) { // Base case
            return 0;
        }

        int top = S.pop(); // Pop the top element
        int sumWithoutTopElement = sumAlgorithms(S); // Recursively find the sum of remaining elements
        S.push(top); // Restore the element we popped
        return top + sumWithoutTopElement; // Return sum including the current element
    }*/

}