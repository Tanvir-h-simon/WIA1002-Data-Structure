import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Character> stack = new Stack<>(); // Store reversed String
        Queue<Character> queue = new LinkedList<>(); // Store forward String

        System.out.println("Enter a string in 15 characters: ");
        String sentence = input.nextLine().toLowerCase();

        if (sentence.length() > 15) {
            System.out.println("The string is too long.");
            return;
        }

        for (int i = 0; i < sentence.length(); i++) {
            stack.push(sentence.charAt(i)); // Adds at first of the stack - store backward String
            queue.add(sentence.charAt(i)); // queue.add() == queue.offer() == queue.enqueue() // Adds at last of the queue - store forward String.
        }

        boolean isPalindrome = true;

        while(!queue.isEmpty()) {
            if (queue.remove().equals(stack.pop())) { // queue.remove() == queue.poll() == queue.dequeue()
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }


//        System.out.println("Stack: " + stack);

//        StringBuilder reversed = new StringBuilder();
//        while(!stack.isEmpty()) {
//            reversed.append(stack.peek()); // Get the top element
//            stack.pop(); // Remove it
//        }
//
//        if (sentence.equals(reversed.toString())) {
//            System.out.println("The string is a palindrome.");
//        } else {
//            System.out.println("The string is not a palindrome.");
//        }

    }
}