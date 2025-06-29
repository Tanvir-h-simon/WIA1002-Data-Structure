public class DoublyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public static class Node <E> {
        Node<E> next;
        Node<E> prev;
        E value;

        public Node (E value) {
            this.next = null;
            this.prev = null;
            this.value = value;
        }
    }

    public void addLast(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }

        size++;
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.value + " <-> ");
            current = current.next;
        }
        System.out.println("NULL\n");
    }
}