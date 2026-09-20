import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class L07bQ01 {
    public static void main(String[] args) {
        int[] num = {4, 8, 1, 2, 9, 6, 3, 7};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : num) {
            pq.offer(x);
        }
        // pq.offer(4);
        // pq.offer(8);
        // pq.offer(1);
        // pq.offer(2);
        // pq.offer(9);
        // pq.offer(6);
        // pq.offer(3);
        // pq.offer(7);

        // System.out.println(pq.toString());
        System.out.println(pq); // By default, increasing order

        pq.poll();
        System.out.println(pq);

        pq.add(5);
        System.out.println(pq);

        // System.out.println(pq.toArray());
        Object[] arr = pq.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(pq.peek());
        System.out.println(pq);

        System.out.println(pq.contains(1));
        System.out.println(pq.size());

        // // Collections.reverseOrder(pq);
        // ArrayList<Integer> list = new ArrayList<>(pq);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.print(list + "\n");

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println("\n" + pq.isEmpty());

        PriorityQueue<Integer> reversePQ = new PriorityQueue<>(Collections.reverseOrder());
        reversePQ.add(4);
        reversePQ.add(8);
        reversePQ.add(1);
        reversePQ.add(2);
        reversePQ.add(9);
        reversePQ.add(6);
        reversePQ.add(3);
        reversePQ.add(7);
        reversePQ.add(5);
        System.out.println(reversePQ);
    }
}