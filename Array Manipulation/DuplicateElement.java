import java.util.ArrayList;
import java.util.*;

public class DuplicateElement {
    public int[] checkDuplicateElements(int[] a) {
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicates.add(a[i]);

                }
            }
        }

        int[] c = new int[duplicates.size()];
        int index = 0;
        for (int num : duplicates) {
            c[index++] = num;
        }

        return c;
    }

    public int[] checkDuplicateElements2(int[] a) {
        // first sort the array to bring duplicates togather;
        arraySort(a);
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
                i++; // skip the rest of the duplicate for the next

            }
        }

        int[] c = new int[count];
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                c[k] = a[i];
                k++;
                i++; // skip the rest of the duplicate for the next
            }
        }

        return c;
    }

    private static int[] arraySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        DuplicateElement d = new DuplicateElement();
        int[] a = { 4, 2, 3, 5, 2, 2, 6, 3, 4, 4, 1, 1 };
        int[] duplicates = d.checkDuplicateElements2(a);

        System.out.println("Duplicate elements:");
        for (int ele : duplicates) {
            System.out.print(ele + " ");
        }
    }
}
