import java.util.*;

public class SubArraySum {

    public static int subArraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            for (int j = i + 1; j < a.length; j++) {
                sum += getSum(a, i, j);
            }
        }

        return sum;
    }

    private static int getSum(int[] a, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int maxSubArraySum = subArraySum(a);
        System.out.println("sum of sub array:" + maxSubArraySum);
    }

}
