public class Lab04Q02 {
    static class LinkedList<E> {
        private Node<E> head;
        private Node<E> tail;

        static class Node<E> {
            E element;
            Node<E> next;

            public Node () {  // Default Constructor
                this.element = null;
                this.next = null;
            }

            public Node(E element) {
                this.element = element;
                this.next = null;
            }
        }

        public E getMiddleValue() {
            if (head == null) {
                System.out.println("List is empty!");
                return null;
            }

            // Floyd's cycle detection algorithm
            Node<E> hare = head;
            Node<E> tortoise = head;

            // Move hare two steps and tortoise one step at a time;
            while (hare != null && hare.next != null) {
                tortoise = tortoise.next;
                hare = hare.next.next;
            }
            return tortoise.element;
        }

        public void addLast(E e) {
            Node<E> newNode = new Node<>(e);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");

        System.out.println("Middle value: " + list.getMiddleValue());
    }
}