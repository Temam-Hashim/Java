import java.util.*;

public class SetExample {

    public static void hashSet() {
        Set<Integer> numbers = new HashSet<>(); // HashSet, TreeSet

        // Adding elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate value, ignored

        // Checking the presence of an element
        numbers.contains(2); // true
        numbers.size(); // 4
        // Removing an element
        numbers.remove(3);
        // add an other collections
        Set<Integer> num = new HashSet<>(Set.of(4, 5, 6));

        num.addAll(numbers);

        // Iterating over the set
        // for (int number : numbers) {
        // System.out.println(number);
        // }
        // Using forEach method on the Set

        // num.forEach(name -> System.out.println(name));

        num.forEach(System.out::println);

    }

    public static void main(String[] args) {
        hashSet();

    }
}
