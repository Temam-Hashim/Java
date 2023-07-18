import java.util.*;

public class ArrayPairSum {

    public static int[] method(int[] a, int targetSum) {
        int n = a.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int currentSum = a[left] + a[right];
            if (currentSum == targetSum) {
                return new int[] { a[left], a[right] };
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int targetSum = 10;
        int[] c = method(a, targetSum);
        System.out.println(Arrays.toString(c));

    }

}
