public class LinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode; // Update head
        }

        size++;
    }

    public void addLast(E value) {
        Node<E> newNode = new Node<>(value);
        if (tail == null) {
            tail = head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode; // Update tail
        }

        size++;
    }

    public void add(int index, E value) {
        if (index < 0 || index > size) { // [0, size]
            System.out.println("Invalid index!");
            return;
        }

        Node<E> newNode = new Node<>(value);

        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next; // Traverse to the index-1'th node
            }
            newNode.next = current.next;
            current.next = newNode;

            size++;
        }
    }

    public void removeFirst() {
        if (head == null) { // Empty list
            System.out.println("The LinkedList is empty!");
            return;
        }

        if (head == tail) { // The list has only one element
            head = tail = null; // Update head and tail to null
        } else {
            head = head.next; // Update head
        }

        size--;
    }

    public void removeLast() {
        if (head == null) { // Empty list
            System.out.println("The LinkedList is empty!");
            return;
        }

        if (head == tail) { // The list has only one element
            head = tail = null; // Update head and tail to null
        } else {
            Node<E> current = head;
            while (current.next != tail) { // Traverse to second last node
                current = current.next;
            }
            current.next = null;
            tail = current; // Update tail
        }

        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) { // [0, size - 1]
            System.out.println("Invalid index!");
            return;
        }

        if (head == null) {
            System.out.println("The LinkedList is empty!");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) { // O-based index
            removeLast();
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next; // Traverse to the index-1'th node
            }
            current.next = current.next.next;


            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("NULL");

        System.out.println();
    }
}