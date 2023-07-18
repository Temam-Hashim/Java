
import java.util.*;

public class QueueExample {

    public static void linkedQueue() {
        Queue<String> queue = new ArrayDeque<>(); // ArrayDeque,LinkedList,LinkedBlockingDeque

        // Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Accessing and removing the head of the queue
        String firstPerson = queue.poll(); // "Alice"

        // Checking the size of the queue
        int size = queue.size(); // 2
        System.out.println("Queue size: " + size);

        // Iterating over the queue
        for (String person : queue) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        linkedQueue();
    }
}
