package BST;

import java.util.ArrayList;

public class TestBST {
    public static void main(String[] args) {
        int[] data = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};

        BST<Integer> tree = new BST<Integer>();
        for (int value : data) {
            tree.insert(value);
        }

        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder();
        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder();
        System.out.println();

        System.out.println("Height of BST: " + tree.height());
        System.out.println("Root for BST is: " + tree.getRoot());
        System.out.println("Check whether 10 is in the tree? " + tree.search(10));

        System.out.println("Delete 53");
        tree.delete(53);

        System.out.print("Updated Inorder data (sorted): ");
        tree.inorder();
        System.out.println();

        System.out.println("Min Value: " + tree.minValue());
        System.out.println("Max Value: " + tree.maxValue());

        System.out.print("A path from the root to 6 is: ");
        ArrayList<Integer> path = tree.path(6);
        for (int value : path) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}