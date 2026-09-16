public class Faculty extends Employee {
    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }

    public static void main(String[] args) {
        new Faculty();
    }
}

// Constructor chain goes from parent -> child.

// this() -> same class constructor
// super() -> parent class (super class) constructor

/*
1. this() (if present)
2. super() (always happens)
3. Parent constructor body
4. Child constructor body
*/