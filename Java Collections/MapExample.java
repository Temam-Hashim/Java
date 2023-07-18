import java.util.*;

public class MapExample {
    public static void hashMap() {
        Map<String, Integer> ages = new HashMap<>(); // TreeMap, LinkedHashMap

        // Adding key-value pairs to the map
        ages.put("Temam", 25);
        ages.put("Kemal", 30);
        ages.put("Sara", 35);
        ages.put("Caara", 25);
        // Accessing values by key
        System.out.println("Caara age:" + ages.get("Caara")); // 25

        // Modifying values
        ages.put("Kemal", 36);

        // Removing key-value pairs
        ages.remove("Caara");

        // Iterating over the map
        // for (Map.Entry<String, Integer> entry : ages.entrySet()) {
        // String name = entry.getKey();
        // int age = entry.getValue();
        // System.out.println(name + ": " + age);
        // }

        // Using keySet and get method
        // for (String key : ages.keySet()) {
        // Integer value = ages.get(key);
        // System.out.println(key + ": " + value);
        // }

        // using forEach
        ages.forEach((key, value) -> System.out.println(key + ": " + value));

        // assign map to array
        int[] a = new int[ages.size()];
        int k = 0;
        // using value
        for (int value : ages.values()) {
            a[k++] = value;
        }
        // using key
        // int k = 0;
        // for (String key : ages.keySet()) {
        // a[k++] = ages.get(key);
        // }

        // print array
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        hashMap();
    }
}
