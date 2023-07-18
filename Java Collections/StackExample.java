import java.util.*;

public class StackExample {
    public static void stack() {
        Stack<String> stack = new Stack<>(); //

        // Pushing elements onto the stack
        stack.push("Temam");
        stack.push("Bini");
        stack.push("Sara");

        // Accessing and removing the top of the stack
        System.out.println(stack.pop()); // "Sara"
        System.out.println(stack.pop()); // "Bini"
        // System.out.println(stack.pop()); // "Temam"
        stack.add(0, "Kemal");

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Iterating over the stack
        for (String person : stack) {
            System.out.print(person + " ");
        }
    }

    public static void main(String[] args) {
        stack();
    }
}
