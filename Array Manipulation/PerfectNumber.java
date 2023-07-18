import java.util.*;

public class PerfectNumber {
    private static boolean perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    private static long interval(int r) {
        int counter = 0;
        int num = r;
        while (r > 0) {
            if (perfectNumber(num)) {
                counter++;
            }
            if (counter == r) {
                return num;
            }
            num++;
        }
        return 0;
    }

    public static long henry(int x, int y) {
        return interval(x) + interval(y);

    }

    public static void main(String[] args) {
        System.out.println(henry(1, 3));
    }

}
