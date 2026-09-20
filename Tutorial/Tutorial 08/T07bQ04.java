import java.util.Comparator;
import java.util.PriorityQueue;

public class T07bQ04 {
    public static void main(String... args ){
        PriorityQueueComparator pqc = new PriorityQueueComparator();
        PriorityQueue<String> pq = new PriorityQueue<String>(5, pqc);

        pq.add("Jason");
        pq.add("Yan");
        pq.add("Muhammad");
        pq.add("Abdullah");

        // for(String s:pq){
        //     System.out.println(s); // String length order
        // }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // String length order
        }
    }

    public static class PriorityQueueComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if (s1.length() < s2.length()) {
                return -1;
            }
            if (s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        }
    }
}