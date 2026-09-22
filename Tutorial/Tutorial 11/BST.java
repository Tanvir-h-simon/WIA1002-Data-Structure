import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    Node (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Node root = new Node(50);
        // Node a = new Node(30);
        // Node b = new Node(25);
        // Node c = new Node(71);
        // Node d = new Node(80);
        // Node e = new Node(99);
        // Node f = new Node(40);
        // Node g = new Node(1);
        // Node h = new Node(7);
        // Node i = new Node(5);
        //
        // root.left = a;
        // root.right = c;
        //
        // a.left = b;
        // a.right = f;
        //
        // c.right = d;
        //
        // d.right = e;
        //
        // b.left = g;
        //
        // g.right = h;
        //
        // h.left = i;

        int[] arr = {50, 30, 25, 71, 80, 99, 40, 1, 7, 5};

        Node root = null;
        for (int value : arr) {
            root = insert(root, value);
        }

        System.out.print("Preorder traversal: ");
        preorder(root);

        System.out.print("\nInorder traversal: ");
        inorder(root);

        System.out.print("\nPostorder traversal: ");
        postorder(root);

        int treeHeight = height(root);
        System.out.println("\nHeight of the tree: " + treeHeight);

        System.out.print("Enter the node to delete: ");
        int key = input.nextInt();
        root = deleteNode(root, key);

        System.out.print("Preorder traversal: ");
        preorder(root);
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else { // value > root.value
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Root -> Left -> Right
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Left -> Root -> Right (Sorted order)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    // Left -> Right -> Root
    public static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public static int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1; // 1 -> Height of root
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null) return null;

        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else { // Found the node to delete
            // Leaf Node
            if (root.left == null && root.right == null) return null;

            // One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Two children
            Node successor = root.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            root.value = successor.value;
            root.right = deleteNode(root.right, successor.value);
        }
        return root;
    }
}