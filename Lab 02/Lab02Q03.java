class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>> {
    private T first, second;

    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public String toString() {
        return "first = " + first + " second = " + second;
    }

    public boolean equals(Object obj) {
        // Check if comparing with itself
        if (this == obj) {
            return true;
        }

        // Check if obj is null
        if (obj == null) {
            return false;
        }

        // Check if obj is of the same class
        if (getClass() != obj.getClass()) {
            return false;
        }

        // Cast to StorePairGeneric and compare first values
        StorePairGeneric<?> other = (StorePairGeneric<?>) obj;

        // Handle null first values
        if (first == null) {
            return other.first == null;
        }

        // Compare first values using equals()
        return first.equals(other.first);
    }

    // Compares this object with the specified object based on the first value
    public int compareTo(StorePairGeneric<T> other) {
        return this.first.compareTo(other.first);
    }
}

public class Lab02Q03 {
        public static void main(String[] args) {

            StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
            StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
            StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);

            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);

            System.out.println("\nComparisons using compareTo():");
            System.out.println("a vs b: " + a.compareTo(b));
            System.out.println("a vs c: " + a.compareTo(c));
            System.out.println("b vs c: " + b.compareTo(c));

            System.out.println("\nEquality checks using equals():");
            System.out.println("a equals b: " + a.equals(b));
            System.out.println("a equals c: " + a.equals(c));
            System.out.println("b equals c: " + b.equals(c)); 
        }
}