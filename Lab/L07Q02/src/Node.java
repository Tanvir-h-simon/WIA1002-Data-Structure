class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public E dequeue() {
        if (front == null) {
            return null;
        }

        E data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}