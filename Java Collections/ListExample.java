
import java.util.*;

public class ListExample {

    public static void arrayList() {
        List<String> names = new ArrayList<>(); // LinkedList
        // Adding elements to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Bob");

        // Accessing elements by index
        String firstElement = names.get(0); // Alice

        // Modifying elements at a specific index
        names.set(2, "Dave"); // ["Alice", "Bob", "Dave", "Bob"]

        // Removing elements
        names.remove("Bob"); // ["Alice", "Dave", "Bob"]

        // Iterating over the list
        for (String name : names) {
            System.out.println(name);
        }

    }

    public static void LinkedList() {
        List<String> names = new LinkedList<>();
        // Adding elements to the list
        names.add("Alice");
        names.add("temam");
        names.add("Charlie");
        names.add("Bob");

        // Accessing elements by index
        String firstElement = names.get(0); // Alice

        // Modifying elements at a specific index
        names.set(2, "Dave"); // ["Alice", "Bob", "Dave", "Bob"]

        // Removing elements
        names.remove("Bob"); // ["Alice", "Dave", "Bob"]

        // Iterating over the list
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        // arrayList();
        LinkedList();

    }
}
