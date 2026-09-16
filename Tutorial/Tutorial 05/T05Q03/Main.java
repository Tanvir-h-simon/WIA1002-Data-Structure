public class Main{
    public static void main(String[] args) {
        DoublyLinkedList<Character> list = new DoublyLinkedList<>();
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('z');

        list.printList();
    }
}