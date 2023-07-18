import java.util.*;

public class ConcateSum {

    public static int checkConcatenatedSum(int n, int catlen) {
        // first convert the number to an array
        List<Integer> digits = new ArrayList<>();
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int r = n % 10;
            digits.add(r);
            n /= 10;
        }

        for (int digit : digits) {
            int concatenatedDigit = 0;
            for (int i = 0; i < catlen; i++) {
                concatenatedDigit = concatenatedDigit * 10 + digit;
            }
            sum += concatenatedDigit;
        }

        if (sum == temp) {
            return 1;
        }
        return 0;
    }

    public static int[] concatDigit(int[] a, int n) {
        // int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int concat = 0;
            for (int j = 0; j < n; j++) {
                concat = concat * 10 + a[i];
            }
            a[i] = concat;
        }
        return a;

    }

    public static void main(String[] args) {

        System.out.println(checkConcatenatedSum(198, 2)); // 1
        System.out.println(checkConcatenatedSum(198, 3)); // 0
        System.out.println(checkConcatenatedSum(2997, 3)); // 1
        System.out.println(checkConcatenatedSum(2997, 2)); // 0
        System.out.println(checkConcatenatedSum(13332, 4)); // 1
        System.out.println(checkConcatenatedSum(9, 1)); // 1

        // System.out.println(Arrays.toString(concatDigit(new int[] { 1, 2, 3 }, 4)));
    }

}
