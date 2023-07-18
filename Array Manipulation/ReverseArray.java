import java.util.Arrays;

public class ReverseArray {

    public int[] reverseArrayElement1(int[] a) {

        int[] c = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            c[j] = a[i];
            j++;
        }

        return c;
    }

    public int[] reverseArrayElement2(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        return a;
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        int[] a = { 1, 2, 3, 4, 5 };
        // for (int num : r.reverseArrayElement1(a)) {
        // System.out.print(num + " ");
        // }

        System.out.print(Arrays.toString(r.reverseArrayElement2(a)));
    }

}
