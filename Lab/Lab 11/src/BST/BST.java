package BST;

import java.util.ArrayList;

public class BST<E extends Comparable<E>> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
        root = null;
    }

    public boolean search(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            int cmp = e.compareTo(current.value);
            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
            size++;
            return true;
        }

        TreeNode<E> current = root;
        while (true) {
            int cmp = e.compareTo(current.value);
            if (cmp == 0) {
                return false; // already exists
            } else if (cmp < 0) {
                if (current.left == null) {
                    current.left = new TreeNode<>(e);
                    size++;
                    return true;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new TreeNode<>(e);
                    size++;
                    return true;
                }
                current = current.right;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode<E> node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public E getRoot() {
        if (root == null) {
            return null;
        }
        return root.value;
    }

    public E minValue() {
        if (root == null) {
            return null;
        }
        TreeNode<E> current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    public E maxValue() {
        if (root == null) {
            return null;
        }
        TreeNode<E> current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    public ArrayList<E> path(E e) {
        ArrayList<E> list = new ArrayList<>();
        TreeNode<E> current = root;
        while (current != null) {
            list.add(current.value);
            int cmp = e.compareTo(current.value);
            if (cmp == 0) {
                break;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return list;
    }

    public boolean delete(E e) {
        if (!search(e)) {
            return false;
        }
        root = deleteHelper(root, e);
        size--;
        return true;
    }

    private TreeNode<E> deleteHelper(TreeNode<E> node, E e) {
        if (node == null) {
            return null;
        }

        int cmp = e.compareTo(node.value);
        if (cmp < 0) {
            node.left = deleteHelper(node.left, e);
        } else if (cmp > 0) {
            node.right = deleteHelper(node.right, e);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }

            TreeNode<E> successor = node.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            node.value = successor.value;
            node.right = deleteHelper(node.right, successor.value);
        }
        return node;
    }

    public boolean clear() {
        root = null;
        size = 0;
        return true;
    }

    protected void inorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public void inorder() {
        inorder(root);
    }

    protected void postorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public void postorder() {
        postorder(root);
    }

    protected void preorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void preorder() {
        preorder(root);
    }
}