import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kindergarten Student Management System ===");
        System.out.println("Enter your student names (Enter 'n' to finish): ");
        /* while (!name.equals("n")) {
            String name = input.nextLine();
            list.add(name); // Consider "n" as an input
        }*/
        while (true) {
            String name = input.nextLine().trim();
            if (name.equalsIgnoreCase("n")) {
                break;
            }
            if (!name.isEmpty()) {
                list.add(name);
            }
        }

        System.out.println("You have entered the following students' name: ");
        list.printList();
        System.out.print("The number of students: " + list.getSize());

        System.out.println();

        System.out.println("Do you want to rename any student? (Enter 'r' to rename the student name, 'n' to proceed)");
        String rename = input.nextLine().trim();
        if (rename.equalsIgnoreCase("r")) {
            System.out.println("Enter the existing student name that you want to change: ");
            String previousName = input.nextLine().trim();

            if (list.contains(previousName)) {
                System.out.println("Enter the new name: ");
                String newName = input.nextLine().trim();
                list.replace(previousName, newName);
                System.out.println("\nUpdated student list: ");
                list.printList();
            } else {
                System.out.println("Student \"" + previousName + "\" not found in the list.");
            }
        }

        System.out.println("Do you want to remove student name? (Enter 'y' for yes, 'n' to proceed)");
        String delete = input.nextLine().trim();
        if (delete.equalsIgnoreCase("y")) {
            System.out.println("Enter a student name to remove: ");
            String deleteName = input.nextLine().trim();

            if (list.contains(deleteName)) {
                list.removeElement(deleteName);
                System.out.println("\nUpdated student list: ");
                list.printList();
                System.out.println("Total number of students: " + list.getSize());
            } else {
                System.out.println("Student \"" + deleteName + "\" not found in the list.");
            }
        }
        System.out.println("\n=== Student data management completed successfully! ===");
    }
}