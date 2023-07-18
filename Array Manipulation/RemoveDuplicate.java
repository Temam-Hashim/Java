import java.util.*;

public class RemoveDuplicate {

    public int[] removeDuplicateArrayElement(int[] a) {
        Set<Integer> noneDuplicate = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] != a[j]) {
                    noneDuplicate.add(a[i]);
                }
            }
        }

        int[] c = new int[noneDuplicate.size()];
        int index = 0;
        for (int ele : noneDuplicate) {
            c[index++] = ele;
        }

        return c;
    }

    public static void main(String[] args) {
        RemoveDuplicate r = new RemoveDuplicate();
        int[] a = { 4, 2, 3, 5, 2, 2, 6, 3, 4, 4 };
        for (int num : r.removeDuplicateArrayElement(a)) {
            System.out.println(num);
        }
    }
}
