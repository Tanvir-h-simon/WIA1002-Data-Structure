public class Lab02Q04 {
    public static <T extends Comparable<T>> String minmax(T[] array) {
        if (array == null || array.length == 0) {
            return "Array is empty.";
        }

        T min = array[0];
        T max = array[0];

        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return "Min = " + min + ", " + "Max = " + max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 7, 1, 4, 9, 8, 2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}