public class MyLinkedList<E> {
    // private Node head = null;
    // private Node tail = null;
    private Node<E> head;
    private Node<E> tail;
    private int size;


    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(E e) {
        Node<E> newNode  = new Node<>(e);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void add(int index, E e) { // [0, size]
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            addFirst(e);
        } else if(index == size) {
            addLast(e);
        } else {
            Node<E> newNode  = new Node<>(e);
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;

            size++;
        }
    }

    public E removeFirst() {
        if (head == null) {
            System.out.println("The LinkedList is empty!");
            return null;
        }

        E removeElement = head.element; // Store the removed node

        if (head == tail) {
            head = tail = null; // Update head and tail when the list consists of only one element
        } else {
            head = head.next;
        }

        size--;

        return removeElement; // Return the removed node
    }

    public E removeLast() {
        if (head == null) {
            System.out.println("The LinkedList is empty!");
            return null;
        }

        E removeElement = tail.element;

        if (head == tail) {
            head = tail = null; // Update head and tail when the list consists of only one element
        } else {
            Node<E> current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }

        size--;

        return removeElement;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) { // [0, size - 1]
            System.out.println("Invalid index!");
            return null;
        }


        if (head == null) {
            System.out.println("The LinkedList is empty!");
            return null;
        }

        E removeElement;

        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1){
            return removeLast();
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            removeElement = current.next.element; // Store the removed element

            current.next = current.next.next;

            size--;
        }

        return removeElement;
    }


    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) { // Traverse to the last node
            if(current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public E get(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        return tail.element;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        int index = 0;
        while (current != null) { // Traverse to the last node
            if (current.element.equals(e)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        Node<E> current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.element.equals(e)) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }

    public E set (int index, E e) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E oldElement = current.element;
        current.element = e;

        return oldElement;
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + " -> ");
            current = current.next;
        }

        System.out.print("NULL\n");
    }

    public void reverse() {
        reversePrint(head);
        System.out.print("NULL\n");
        /*if (head == null) { // Base case
            return;
        }

        reverse(head.next); // Recursive call first
        System.out.print(head.element + " -> ");*/
    }

    private void reversePrint(Node<E> node) {
        if (node == null) {
            return;
        }

        reversePrint(node.next);
        System.out.print(node.element + " -> ");
    }


    public int getSize() {
        return size;
    }
    public void clear() {
        head = tail = null;
        size = 0;
    }
}