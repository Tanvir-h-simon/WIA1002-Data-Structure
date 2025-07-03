import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        E top = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        return top;
    }

    public int getSize() {
        return list.size();
    }

    public E peek() {
        if (list.isEmpty()) {
            System.out.println("The stack is empty.");
            return null;
        }

        E top = list.get(list.size() - 1);

        return top;
    }


    public boolean search(E o) {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.contains(o);
    }

    public String toString() {
        return "Stack: " + list.toString();
    }
}