/*public class ArrayBagDemo {
    public static void main(String[] args) {

        ArrayBag<String> bag1 = new ArrayBag<>(0);

        bag1.add("a");
        bag1.add("b");
        bag1.add("c");

        ArrayBag<String> bag2 = new ArrayBag<>(0);

        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");

        System.out.println("Bag 1:");
        displayBag(bag1);

        System.out.println("Bag 2:");
        displayBag(bag2);

        // Union
        BagInterface<String> everything = bag1.union(bag2);

        // Intersection
        BagInterface<String> commonItems = bag1.intersection(bag2);

        System.out.println("\nUnion of Bag 1 and Bag 2:");
        displayBag(everything);

        System.out.println("\nIntersection of Bag 1 and Bag 2:");
        displayBag(commonItems);

        BagInterface<String> leftOver1 = bag1.difference(bag2);

        System.out.println("\nBag 1 difference Bag 2:");
        displayBag(leftOver1);

        BagInterface<String> leftOver2 = bag2.difference(bag1);

        System.out.println("\nBag 2 difference Bag 1:");
        displayBag(leftOver2);

        System.out.println("\nBag 1 after union:");
        displayBag(bag1);

        System.out.println("Bag 2 after union:");
        displayBag(bag2);

*//*        // Test duplicate
        ArrayBag<String> bag3 = new ArrayBag<>(0);

        bag3.add("b");
        bag3.add("b");
        bag3.add("b");
        bag3.add("c");

        ArrayBag<String> bag4 = new ArrayBag<>(0);

        bag4.add("b");
        bag4.add("b");
        bag4.add("c");
        bag4.add("c");

        BagInterface<String> commonItems2 = bag3.intersection(bag4);

        System.out.println("\nBag 3:");
        displayBag(bag3);

        System.out.println("Bag 4:");
        displayBag(bag4);

        System.out.println("\nIntersection of Bag 3 and Bag 4:");
        displayBag(commonItems2);*//*
    }

    public static void displayBag(BagInterface<String> bag) {

        Object[] entries = bag.toArray();

        System.out.print("{ ");

        for (Object entry : entries) {
            System.out.print(entry + " ");
        }

        System.out.println("}");
    }
}*/

public class ArrayBagDemo {
    public static void main(String[] args) {

        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();

        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};

        System.out.println("bag1:");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);

        System.out.println("\nbag2:");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);

        // union
        System.out.println("\nbag3, test the method union of bag1 and bag2:");
        BagInterface<String> bag3 = bag1.union(bag2);
        displayBag(bag3);

        // intersection
        System.out.println("\nbag4, test the method intersection of bag1 and bag2:");
        BagInterface<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);

        // difference
        System.out.println("\nbag5, test the method difference of bag1 and bag2:");
        BagInterface<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);
    }


    private static void testAdd(BagInterface<String> aBag, String[] content) {

        System.out.print("Adding ");

        for (String entry : content) {

            if (aBag.add(entry)) {
                System.out.print(entry + " ");
            }
            else {
                System.out.println();
                System.out.println("Unable to add " + entry);
            }
        }

        System.out.println();
    }


    private static void displayBag(BagInterface<String> aBag) {

        System.out.println(
                "The bag contains " +
                        aBag.getCurrentSize() +
                        " string(s), as follows:"
        );

        Object[] bagArray = aBag.toArray();

        for (Object entry : bagArray) {
            System.out.print(entry + " ");
        }

        System.out.println();
    }
}