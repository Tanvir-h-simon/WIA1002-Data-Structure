public class T04Q01<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;


    public static class Node<E> {
        Node<E> next;
        E element;

        public Node (E element) {
            this.next = null;
            this.element = element;
        }
    }

    public void addLast (E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public E replace(int index, E e) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return null;
        }

        E oldElement;

        if (index == 0) {
            oldElement = head.element;
            head.element = e;
        } /*else if (index == size - 1) {
            oldElement = tail.element;
            tail.element = e;
            return tail.element;
        } */else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            oldElement = current.next.element;
            current.next.element = e;

        }
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

    public static void main(String[] args) {
        T04Q01<Integer> list = new T04Q01<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.printList();

        Integer old = list.replace(1,15);

        list.printList();
        System.out.println("Previous value: " + old);
    }
}