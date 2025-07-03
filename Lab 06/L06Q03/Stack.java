import java.util.ArrayList;

public class Stack<E> {
    private ArrayList<E> list;

    public Stack() {
      list = new ArrayList<>();
    }

    public void push(E value) {
        list.add(value);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public E pop() {
        return list.isEmpty() ? null : list.remove(list.size() - 1);
    }

    public E peek() {
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    public int getSize() {
        return list.size();
    }

    public String toString() {
        return "Stack: " + list;
    }
}