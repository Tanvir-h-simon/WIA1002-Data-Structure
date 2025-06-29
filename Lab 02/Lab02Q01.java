class MyGeneric<T> {
    private T e;

    // No-argument constructor
    public MyGeneric() {
    }

    public MyGeneric(T e) {
        this.e = e;
    }

    public void set(T e) {
        this.e = e;
    }

    public T get() {
        return e;
    }
}

public class Lab02Q01 {  // class MyArray
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("Tanvir");
        MyGeneric<Integer> intObj = new MyGeneric<>(25);

        System.out.println("String value: " + strObj.get());
        System.out.println("Integer value: " + intObj.get());
    }
}