import java.util.Arrays;

public class Fill {

    public static int[] fill(int[] a, int k, int n) {
        if (a.length < n || k < 0 || n < 0) {
            return null;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i % k];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, -1, 2, 3 };
        System.out.println(Arrays.toString(fill(a, 4, 9)));
    }

}
