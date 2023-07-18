import java.util.Arrays;

public class TargetSumIndex {

    public static int[] targetSumIndex(int[] a, int target) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    return new int[] { i, j };
                }

            }

        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] a = targetSumIndex(new int[] { 5, 1, 1, 2 }, 3); // [1,3]
        System.out.println(Arrays.toString(a));
        int[] b = targetSumIndex(new int[] { 1, 1, 1, 2, -2 }, 0); // [3,4]
        System.out.println(Arrays.toString(b));

        int[] c = targetSumIndex(new int[] { 1, 1, 1, 2, -2 }, 20); // []
        System.out.println(Arrays.toString(c));
    }

}
