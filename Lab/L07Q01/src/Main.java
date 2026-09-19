public class Main {
    public static void main(String[] args) {
        String[] fruitQ = {"Durian","Blueberry"};
        MyQueue<String> queue = new MyQueue<>(fruitQ);
        queue.enqueue("Apple");
        queue.enqueue("Orange");
        queue.enqueue("Grapes");
        queue.enqueue("Cherry");

        // System.out.println(queue.toString());
        System.out.println(queue);

        System.out.println("Top item: " + queue.peek());
        System.out.println("Size: " + queue.getSize());
        queue.dequeue();
        System.out.println(queue);
        System.out.println("Index 2: " + queue.getElement(2));
        System.out.println("Contains Cherry? " + queue.contains("Cherry"));
        System.out.println("Contains Durian? " + queue.contains("Durian"));
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue);
        }
    }
}