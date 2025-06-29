class Duo <A, B> {
    private A first;
    private B second;

    public Duo(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}

public class Tutorial02Q0506 {
    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("Square", 5);

        Duo<Double, Double> points = new Duo<>(2.50, 5.60);

        System.out.println("Shape: " + sideShape.getFirst());
        System.out.println("Side size: " + sideShape.getSecond());

        System.out.println("Point(x, y) = (" + points.getFirst() + " ," + points.getSecond() + ")");
    }
}