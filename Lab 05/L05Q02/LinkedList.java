public class LinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public static class Node<E> {
        Node<E> next;
        E value;

        public Node () {
            this.next = null;
            this.value = null;
        }

        public Node (E value) {
            this.next = null;
            this.value = value;
        }
    }

    public void add(E e) { // addLast()
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void removeElement(E e) {
        if (!contains(e)) {
            System.out.println("The entered name \"" + e + "\" is not found in the list.");
            return;
        }

        if (head.value.equals(e)) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        } else {
            Node<E> current = head;
            while (current.next != null && !current.next.value.equals(e)) { // Traverse until found the input value
                current = current.next;
            }

            if (current.next == tail) {
                tail = current;
                current.next = null;
            } else {
                current.next = current.next.next;
            }
        }

        size--;
    }


    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
           if (current.value.equals(e)) {
               return true;
           }
           current = current.next;
        }

       return false;
    }

    public void replace(E e, E newE) {
        if (!contains(e)) {
            System.out.println("The name \"" + e + "\" is not found in the list.");
            return;
        }

        Node<E> current = head;
        while (current != null) {
            if (current.value.equals(e)) {
                current.value = newE;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        if (size > 0) {
            System.out.println(".");
        } else {
            System.out.print("The list is empty.");
        }
    }
}