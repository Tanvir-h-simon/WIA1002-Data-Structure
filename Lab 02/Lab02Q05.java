class Circle implements Comparable<Circle> {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius;
    }
}

public class Lab02Q05 {
    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null;
        }

        E max = list[0];
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        System.out.println("Max Integer: " + max(intArray));

        String[] strArray = {"red", "green", "blue"};
        System.out.println("Max String: " + max(strArray));

        Circle[] circleArray = {
                new Circle(3),
                new Circle(2.9),
                new Circle(5.9)
        };

        System.out.println("Max Circle: \n" + max(circleArray));
    }
}