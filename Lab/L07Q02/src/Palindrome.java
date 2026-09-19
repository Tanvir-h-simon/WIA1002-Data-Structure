import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*public class Palindrome {
    public static boolean isPalindrome(String str) {
        MyQueue<Character> queue = new MyQueue<>();

        for (int i = 0; i < str.length(); i++) {
            queue.enqueue(str.charAt(i));
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (queue.dequeue() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}*/


public class Palindrome {
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            queue.offer(str.charAt(i));
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (queue.poll() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        input.close();
    }
}