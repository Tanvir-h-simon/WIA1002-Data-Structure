public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stackA = new MyStack<>();

        stackA.push('a');
        stackA.push('b');
        stackA.push('c');

        System.out.println(stackA);

        System.out.println("Search for b:" + (stackA.search('b') ? " Found " : " Not found "));
        System.out.println("Search for k:" + (stackA.search('k') ? " Found " : " Not found "));

        MyStack<Integer> stackB = new MyStack<>();

        stackB.push(1);
        stackB.push(2);
        stackB.push(3);

        System.out.println(stackB);
        System.out.println("Search for 6:" + (stackB.search(6) ? " Found " : " Not found "));


/*        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println("Size: " + stack.getSize());
        System.out.println("Is empty?: " + stack.isEmpty());

        System.out.println("Search for 30: " + stack.search(30));

        System.out.println("Peek: " + stack.peek());

        // Pop all elements
        System.out.println("\nPopping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
//        while(!stack.isEmpty()) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }

        System.out.println("Size after popping all: " + stack.getSize());
        System.out.println("Is empty: " + stack.isEmpty());*/
    }
}