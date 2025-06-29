import org.w3c.dom.Node;

public class DoublyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public static class Node<E> {
        Node<E> next;
        Node<E> prev;
        E value;

        Node(E value) {
            this.next = null;
            this.prev = null;
            this.value = value;
        }
    }

    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void add(int index, E value) {
        if (index < 0 || index > size) {  // [0, size]
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0){
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node<E> newNode = new Node<>(value);
            Node<E> current = head;
            for (int i = 1; i < index; i++) { // Traverse to (index - 1)-th node
                current = current.next;
            }
            newNode.next = current.next; // newNode points forward to current's next
            current.next.prev = newNode; // The next node points back to newNode

            current.next = newNode; // current now points forward to newNode
            newNode.prev = current; // newNode points back to current

            /* for (int i = 0; i < index; i++) { // Traverse to index-th node
                current = current.next;
            }

            newNode.next = current; // Point newNode forward to current
            newNode.prev = current.prev; // Point newNode backward to current's previous
            current.prev.next = newNode; // Make previous node point to newNode
            current.prev = newNode; // Make current point back to newNode */

            size++;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.next == null) { // If there's only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.next == null) { // If there's only one node
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {  // [0, size - 1]
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node<E> current = head;

            /* for (int i = 1; i < index; i++) { // Traverse to (index- 1)-th node
                current = current.next;
            }

            Node<E> nodeToRemove = current.next;
            current.next = nodeToRemove.next; // Skip over the target node
            if (nodeToRemove.next != null) { // Update prev pointer safely
                nodeToRemove.next.prev = current;
            } */

            for (int i = 0; i < index; i++) { // Traverse to index-th node
                current = current.next;
            }

            current.prev.next = current.next; // Link previous to next
            current.next.prev = current.prev; // Link next to previous

            size--;
        }
    }

    public void forwardTraverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node<E> current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void backwardTraverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node<E> current = tail;
        while (current != null) {
            System.out.print(current.value);
            if (current.prev != null) {
                System.out.print(" -> ");
            }
            current = current.prev;
        }
        System.out.println();
    }

    public void printList () {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" <-> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public void clear() {
        /* head = null;
        size = 0; */

        System.out.println("Successfully clear " + size + (size > 1 ? " nodes." : " node."));

        while (head != null) {
            Node<E> current = head;
            head = head.next;
            current = null; // Delete current node
            size--;
        }
        tail = null;
    }

    public int getSize() {
        return size;
    }
}