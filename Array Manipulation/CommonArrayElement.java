import java.util.*;

public class CommonArrayElement {
    // using one set with time complexity O(n*2)
    public int[] commonElement1(int[] a, int[] b) {
        int i, j;
        Set<Integer> common = new HashSet<>();

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    common.add(a[i]);
                }
            }
        }
        int[] c = new int[common.size()];
        int index = 0;
        for (int num : common) {
            c[index++] = num;
        }

        return c;

    }

    // using two sets with time complexit O(n)
    public int[] commonElement2(int[] a, int[] b) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int x : a) {
            set1.add(x);
        }
        for (int y : b) {
            set2.add(y);
        }

        set1.retainAll(set2);
        int[] c = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            c[index++] = num;
        }

        return c;

    }

    // with out using any list or set
    // public int[] commonElement3(int[] a, int[] b) {
    // int i, j, k = 0;
    // int[] c = new int[0];
    // for (i = 0; i < a.length; i++) {
    // for (j = 0; j < b.length; j++) {
    // if (a[i] == b[j]) {
    // c = new int[a.length];
    // c[k] = a[i];
    // k++;
    // }
    // }
    // }
    // return c;

    // }

    public static void main(String[] arg) {
        CommonArrayElement home = new CommonArrayElement();
        Scanner scanner = new Scanner(System.in);
        // int[] a = new int[] { 1, 4, 8, 7, 9 };
        // int[] b = new int[] { 2, 1, 8, 3, 5, 1 };
        int[] arr1 = { 1, 4, 9, 16, 25 };
        int[] arr2 = { 2, 4, 8, 12, 16, 20, 16 };
        for (int data : home.commonElement2(arr1, arr2)) {
            System.out.print(data + " ");
        }

    }
}
