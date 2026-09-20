import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class L07bQ02 {
    public static void main(String[] args) {
        String[] arr1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] arr2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};

        PriorityQueue<String> pq1 = new PriorityQueue<>();
        for (String name : arr1) {
            pq1.offer(name);
        }

        System.out.println(pq1);

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        for (String name : arr2) {
            pq2.offer(name);
        }

        System.out.println(pq2);

        PriorityQueue<String> union = new PriorityQueue<>(pq1);
        union.addAll(pq2);
        // System.out.println(union);
        Set<String> unionSet = new HashSet<>(union);
        System.out.println(unionSet);

        // Set<String> union = new HashSet<>(pq1);
        // union.addAll(pq2);
        // System.out.println(union);

        PriorityQueue<String> intersection = new PriorityQueue<>(pq1);
        intersection.retainAll(pq2);
        System.out.println(intersection);

        PriorityQueue<String> difference = new PriorityQueue<>(pq1);
        difference.removeAll(pq2);
        System.out.println(difference);
    }
}