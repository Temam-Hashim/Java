import java.util.*;

class Program5 {
    // using one set with time complexity O(n*2)
    public void CommonElement(int[] a, int[] b) {
        int i, j;
        Set<Integer> common = new HashSet<>();

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    common.add(a[i]);
                }
            }
        }

        for (int c : common) {
            System.out.print(c + " ");
        }
    }

    // using two sets with time complexit O(n)
    public void CommonElement2(int[] a, int[] b) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int x : a) {
            set1.add(x);
        }
        for (int y : b) {
            set2.add(y);
        }

        set1.retainAll(set2);
        System.out.print(set1 + "");

    }

    // with out using any list or set
    public void CommonElement3(int[] a, int[] b) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}

public class CommonArrayElement {
    public static void main(String[] arg) {
        Program5 home = new Program5();
        Scanner scanner = new Scanner(System.in);
        // int[] a = new int[] { 1, 4, 8, 7, 9 };
        // int[] b = new int[] { 2, 1, 8, 3, 5, 1 };
        int[] arr1 = { 1, 4, 9, 16, 25 };
        int[] arr2 = { 2, 4, 8, 12, 16, 20, 16 };
        home.CommonElement3(arr1, arr2);
    }
}
