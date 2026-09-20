import java.util.Iterator;
import java.util.PriorityQueue;

public class T07bQ03 {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.offer("Python");
        pQueue.offer("C++");
        pQueue.offer("Java");
        pQueue.offer("Fortran");

        System.out.println("peek() gives us: " + pQueue.peek()); //(a)

        System.out.println("\nThe queue elements:"); //(b) // For String by default, lexicographical order (alphabetical order)
        Iterator itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); //(b)
        }
        pQueue.poll();
        System.out.println("\nAfter poll():"); //(c)

        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next()); //(c)
        }
        pQueue.remove("Java");
        System.out.println("\nAfter remove():"); //(d)

        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next()); //(d)
        }
        boolean b = pQueue.contains("Ruby");
        System.out.println("\nPriority queue contains Ruby or not?: " + b); //(e)

        Object[] arr = pQueue.toArray();
        System.out.println("\nValue in array: "); //(f)
        for (int i = 0; i < arr.length; i++)
            System.out.println("Value: " + arr[i].toString()); //(f)
    }
}