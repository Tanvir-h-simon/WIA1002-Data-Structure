import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class T07Q03 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Scanner keyIn = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            if (keyIn.nextBoolean()) {
                System.out.print(i + " ");
            } else {
                q.add(i); // enqueue
            }
        }

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " "); // dequeue
        }
        System.out.println();
    }
}