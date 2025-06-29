package Slist;

public class SNode<E> {
    SNode<E> next;
    E value;

    public SNode () {
        this.next = null;
        this.value = null;
    }

    public SNode (E value) {
        this.next = null;
        this.value = value;
    }
}