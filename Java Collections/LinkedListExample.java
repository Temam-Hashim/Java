import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");

        // Accessing elements in the linked list
        System.out.println(linkedList.get(0)); // Output: Alice
        System.out.println(linkedList.get(1)); // Output: Bob
        System.out.println(linkedList.get(2)); // Output: Charlie

        // Modifying elements in the linked list
        linkedList.set(1, "Brian");
        System.out.println(linkedList.get(1)); // Output: Brian

        // Removing elements from the linked list
        linkedList.remove();
        System.out.println(linkedList.size()); // Output: 2
        System.out.println(linkedList.get(0)); // Output: Brian
        System.out.println(linkedList.get(1)); // Output: Charlie
    }
}
