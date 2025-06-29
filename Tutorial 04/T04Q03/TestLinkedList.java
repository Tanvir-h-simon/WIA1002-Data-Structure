public class TestLinkedList {
    public static void main(String[] args) {

        /* MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);

        list.add(1, 20);
        list.add(2, 30);
        list.add(3, 40);
        list.add(4, 50);
        list.add(5, 60);

        list.addLast(70);

        list.printList();

        Integer removeFirstElement = list.removeFirst();
        System.out.println("Removed: " + removeFirstElement);

        Integer removeLastElement = list.removeLast();
        System.out.println("Removed: " + removeLastElement);


        Integer removeIndexElement = list.remove(1);
        System.out.println("Removed: " + removeIndexElement);

        list.printList();*/

        MyLinkedList<Character> list = new MyLinkedList<>();

        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');

        System.out.print("List: ");
        list.printList();

        System.out.print("Reversed: ");
        list.reverse();

        System.out.println("Size: " + list.getSize());

        System.out.println("First value: " + list.getFirst());
        System.out.println("Last value: " + list.getLast());

        list.remove(2);
        list.printList();

        System.out.println("Index of second value(b): " + list.indexOf('b'));
        System.out.println("Index of second value(d): " + list.indexOf('d'));

        System.out.println("Contains 'c'? " + list.contains('c'));

        list.set(0, 'j');
        list.set(1, 'a');
        list.set(2, 'v');
        list.set(3, 'a');

        list.printList();
    }
}