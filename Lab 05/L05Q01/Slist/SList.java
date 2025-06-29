package Slist;

public class SList<E> {
    private SNode<E> head = null;
    private SNode<E> tail = null;

    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public E removeInitial () {
        if (head == null) {
            System.out.println("The list is empty!");
            return null;
        }

        E removed = head.value;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }

        return removed;
    }

    public boolean contains(E e) {
        if (head == null) {
            System.out.println("The list is empty!");
            return false;
        }

        SNode<E> current = head;
        while (current != null) { // Traverse to the last node of the list
            if (current.value.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear () {
        // head = null;
        // tail = null;
        if (head == null) {
            System.out.println("The list is already empty!");
        } else {
            while (head != null) {
                SNode<E> current = head;
                head = head.next; // Traverse to the last node of the list
                current.next = null;
            }
        }

        System.out.println("The list is empty now!");
    }

    public void display () {
        SNode<E> current = head;
        while (current != null) {
            System.out.print(current.value);

            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println(".");
    }
}