import java.util.ArrayList;
import java.util.Arrays;

public class Solve10 {

    private static long factorial(int n) {
        long fact = 1;
        if (n <= 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int[] solve10_1() {
        // X! + Y! = 10!
        long target = factorial(10);
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                long sum = factorial(x) + factorial(y);
                if (sum == target) {
                    return new int[] { x, y };
                }
            }
        }
        return new int[0];
    }

    public static int[] solve10_2() {
        // int[] result = { -1, -1 };
        long target = factorial(10);
        int x = 0;
        while (true) {
            long Xfactorial = factorial(x);
            long Yfactorial = target - Xfactorial;

            int y = 0;
            while (factorial(y) <= Yfactorial) {
                if (factorial(y) == Yfactorial) {
                    return new int[] { x, y };
                }
                y++;
            }

            x++;

        }
    }

    public static void main(String[] args) {
        int[] a = solve10_1();
        int[] b = solve10_2();

        System.out.println(Arrays.toString(a)); // Output: []
        System.out.println(Arrays.toString(b)); // Output: [66,10]

        System.out.println(factorial(10));
        System.out.println(factorial(66) + factorial(10));
    }

}
