import java.util.PriorityQueue;
import java.util.Queue;

public class L07bQ03 {
    public static void main(String[] args) {
        PriorityQueue<ComparableBook> BookQueue = new PriorityQueue<>();
        BookQueue.add(new ComparableBook(1999, "Effective Java: Third Edition"));
        BookQueue.add(new ComparableBook(2012, "A Beginner Guide to Java Seventh Edition"));
        BookQueue.add(new ComparableBook(1997, "Learn Java in One Day and Learn It Well"));
        BookQueue.add(new ComparableBook(1995, "Beginning Programming with Java (Dummies)"));
        BookQueue.add(new ComparableBook(2012, "Programming Basic for Absolute Beginner in Java"));


        // System.out.println(BookQueue);
        System.out.println("Priority Queue (Sorting by publication year): ");
        PriorityQueue<ComparableBook> temp = new PriorityQueue<>(BookQueue);
        while (!temp.isEmpty()) {
            System.out.println(temp.poll());
        }
        System.out.println();

        // while (BookQueue.peek() != null) {
        //     System.out.println("Head Element: " + BookQueue.peek());
        //     BookQueue.remove();
        //     System.out.println("Priority queue: " + BookQueue);
        // }
    }
}

class ComparableBook implements Comparable<ComparableBook> {
    private int publicationYear;
    private String title;

    public ComparableBook(int publicationYear, String title) {
        this.publicationYear = publicationYear;
        this.title = title;
    }

    @Override
    public int compareTo(ComparableBook other) {

        // First compare publication year (oldest -> newest)
        int yearCompare = Integer.compare(this.publicationYear, other.publicationYear);

        /*
        this.publicationYear = 1995;
        other.publicationYear = 1999;
        int yearCompare = Integer.compare(1995, 1999);
        output: -1 ( 1995 < 1999)

        this.publicationYear = 1999;
        other.publicationYear = 1995;
        int yearCompare = Integer.compare(1999, 1995);
        output: 1 (1999 > 1995)

        this.publicationYear = 2012;
        other.publicationYear = 2012;
        int yearCompare = Integer.compare(2012, 2012);
        output: 0 (2012 == 2012)
         */
        // If the years are different, stop here and use the year comparison.
        if (yearCompare != 0) {
            return yearCompare;
        }

        // If same year, compare title alphabetically
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return title + ", " + publicationYear;
    }
}