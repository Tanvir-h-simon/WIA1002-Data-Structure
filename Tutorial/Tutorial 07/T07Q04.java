import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> queue;
            
    public Queue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(int value) {
        queue.addLast(value);
    }

    public int dequeue() {
        return queue.removeFirst();
    }

    public int front() {
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class T07Q04 {
    public static void main(String[] args) {
        Queue X = new Queue();

        X.enqueue(14);
        X.enqueue(3);
        X.enqueue(5);

        int Y = X.dequeue();

        X.enqueue(7);
        X.enqueue(9);

        Y = X.dequeue();

        X.enqueue(2);
        X.enqueue(4);

        // (a)
        System.out.println("(a) X.front() = " + X.front());

        // (b)
        Y = X.dequeue();
        X.enqueue(10);
        System.out.println("(b) X.front() = " + X.front());

        // (c)
        Y = X.dequeue();
        System.out.println("(c) Y = " + Y);

        // (d)
        System.out.println("(d) X.front() = " + X.front());
    }
}