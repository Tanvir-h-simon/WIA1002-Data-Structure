class Container<T> {
    private T t;
    public Container() {
    }

    public T retrieve() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}

public class Tutorial02Q01 {
    public static void main(String[] args) {
        Container<Integer> intValue = new Container<>();
        intValue.set(50);

        Container<String> strValue = new Container<>();
        strValue.set("Java");

        System.out.println(intValue.retrieve());
        System.out.println(strValue.retrieve());
    }
}