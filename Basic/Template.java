import java.util.*;

public class Template<T> {

    private T item;

    public Template(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        // T as String
        Template<String> t1 = new Template<>("Temam");
        System.out.println(t1.getItem());
        // T as Integer
        Template<Integer> t2 = new Template<>(1);
        System.out.println(t2.getItem());
        // T as array
        Template<int[]> t3 = new Template<>(new int[] { 1, 2, 3, 4 });
        System.out.println(Arrays.toString(t3.getItem()));

        // T as collection
        Template<List<Integer>> t4 = new Template<>(new ArrayList<>(List.of(20, 30, 40, 50)));
        System.out.println(t4.getItem());

    }
}
