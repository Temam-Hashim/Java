import java.util.*;

public class FullnessQuotient {

    private static boolean containZeros(int n) {
        while (n != 0) {
            int r = n % 10;
            if (r == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    private static int convertToBase(int n, int base) {
        int result = 0;
        int multiplier = 1;

        while (n > 0) {
            int digit = n % base;
            result += digit * multiplier;
            multiplier *= 10;
            n /= base;
        }

        return result;
    }

    public static int fullnessQuotient(int n) {
        if (n < 0) {
            return -1;
        }
        int counter = 0;
        for (int base = 2; base <= 9; base++) {
            int res = convertToBase(n, base);
            if (!containZeros(res)) {
                counter++;
            }

        }

        return counter;

    }

    public static void main(String[] args) {

        System.out.println(fullnessQuotient(94)); // 6
        System.out.println(fullnessQuotient(1)); // 8
        System.out.println(fullnessQuotient(9)); // 5
        System.out.println(fullnessQuotient(360)); // 0
        System.out.println(fullnessQuotient(-4)); // -1

    }

}
