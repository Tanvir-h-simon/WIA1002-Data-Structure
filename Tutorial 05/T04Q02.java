public class T04Q02<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public static class Node<E> {
        Node<E> next;
        Node<E> prev;
        E element;

        Node(E element) {
            this.next = null;
            this.prev = null;
            this.element = element;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public E removeAtIndex (int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return null;
        } else {
            Node<E> temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next; // Traverse to the index-th (3rd) node
            }
            E deletedElement = temp.element;

            temp.prev.next = temp.next;  // Re-link previous node - Bypasses temp in the forward direction
            temp.next.prev = temp.prev; // Re-link next node - bypasses temp in the backward direction.

            temp.next = null;
            temp.prev = null;

            size--;

            return deletedElement;
        }
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        T04Q02<Integer> list = new T04Q02<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.print("Original List: ");
        list.printList();
        System.out.println("Size: " + list.getSize());

        Integer deletedValue = list.removeAtIndex(3);
        System.out.println("Deleted value: " + deletedValue);
        System.out.print("List after removal: ");
        list.printList();
        System.out.println("Size: " + list.getSize());
    }
}