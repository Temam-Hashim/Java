import java.util.*;

public class MergeTwoArray {

    public static int[] mergeTwoArray1(int[] a, int[] b) {

        int k = 0;
        List<Integer> set = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);

        }
        for (int j = 0; j < b.length; j++) {

            set.add(b[j]);

        }

        int[] c = new int[set.size()];
        for (int num : set) {
            c[k++] = num;
        }

        return c;
    }

    public static int[] mergeTwoArray2(int[] a, int[] b) {

        int k = 0;
        int[] c = new int[a.length + b.length];
        for (int num : a) {
            c[k++] = num;

        }
        for (int num : b) {
            c[k++] = num;

        }

        return c;
    }

    // with out using the third variable
    public static int[] mergeTwoArray3(int[] a, int[] b) {

        int i = a.length - 1;
        int j = b.length - 1;
        int k = a.length + b.length - 1;
        while (i > 0 && j > 0) {
            if (a[i] > b[j]) {
                a[k] = a[i--];
            } else {
                a[k] = b[j--];
            }
            k--;
        }

        while (j >= 0) {
            a[k--] = b[j--];
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8 };
        int[] c = mergeTwoArray3(a, b);
        System.out.println(Arrays.toString(c));
    }

}
