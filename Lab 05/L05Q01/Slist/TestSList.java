package Slist;

public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        list.display();

        String removed = list.removeInitial();
        System.out.println("Removed Element: " + removed);
        list.display();

        boolean found = list.contains("difficult");
        System.out.println(found? "Found" : "Not Found");

        list.clear();
    }
}