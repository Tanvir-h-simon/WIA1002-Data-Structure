public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(10);
        list.addLast(100);
        list.add(2, 2);
        System.out.print("List: ");
        list.printList();

        list.remove(2);

        System.out.print("Updated List: ");
        list.printList();

        System.out.print("Traverse Forward: ");
        list.forwardTraverse();
        System.out.print("Traverse Backward: ");
        list.backwardTraverse();

        System.out.print("Size of the list: " + list.getSize());
        System.out.println();

        list.clear();

        System.out.print("Updated size of the list: " + list.getSize());
    }
}