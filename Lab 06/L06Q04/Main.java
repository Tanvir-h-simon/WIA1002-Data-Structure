import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        System.out.println("Enter a string in 15 characters: ");
        String sentence = input.nextLine().toLowerCase();

        if (sentence.length() > 15) {
            System.out.println("The string is too long.");
            return;
        }

        for (int i = 0; i < sentence.length(); i++) {
            stack.push(sentence.charAt(i));
        }

        System.out.println("Stack: " + stack);

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()) {
            reversed.append(stack.peek()); // Get the top element
            stack.pop(); // Remove it
        }

        if (sentence.equals(reversed.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}