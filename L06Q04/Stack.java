/* import java.util.ArrayList;

public class Stack<E> {
    private ArrayList<E> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public void push(E value) {
        list.add(value);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void pop() {
        if (!isEmpty()) {
            list.remove(list.size() - 1);
        }
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

//    public void reverse() {
//        Stack<E> temp = new Stack<>();
//
//        // Move all the elements from this stack to temp stack
//        while(!this.isEmpty()) {
//            temp.push(this.peek());
//            this.pop();
//        }
//
//        // Replace this stack's list with temp's list
//        this.list = temp.list;
//    }

    public String toString() {
        return list.toString();
    }
} */ 