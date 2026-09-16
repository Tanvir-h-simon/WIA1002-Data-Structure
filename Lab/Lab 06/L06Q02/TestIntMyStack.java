import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value (Enter 0 to end): ");
        int num = 0;
        while(true) {
            num = input.nextInt();
            if (num == 0) {
                break;
            }
            stack.push(num);
        }

        System.out.println(stack);

        System.out.println("Size: " + stack.getSize());

        System.out.println("Stack: ");
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}