// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        list.addFirst('a');
        list.addLast('e');

        list.printList();

        // System.out.print("Enter an index to insert the value: "); // 0-based index
        // int addIndex = input.nextInt();
        // input.nextLine();

        //        list.add(addIndex, 'd');
        list.add(1, 'b');
        list.add(2, 'c');
        list.add(3, 'd');
        list.printList();

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();

        // System.out.print("Enter an index to delete the value: "); // 0-based index
        // int removeIndex = input.nextInt();
        // input.nextLine();

        // list.remove(removeIndex);
        list.remove(0);
        list.printList();

        System.out.println("Size: " + list.getSize());
    }
}