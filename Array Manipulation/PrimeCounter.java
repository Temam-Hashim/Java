import java.util.*;

public class PrimeCounter {

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeCount(int start, int end) {
        int counter = 0;
        if (start > end) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] primeRange(int start, int end) {
        Set<Integer> set = new HashSet<>();

        if (start > end) {
            return new int[0];
        }

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                set.add(i);
            }
        }

        int[] c = new int[set.size()];
        int j = 0;
        for (int num : set) {
            c[j++] = num;
        }
        return c;
    }

    public static void main(String[] args) {
        // int[] a = { 1, 2, -1, 5, 3, 2, -3, 13 };
        System.out.println(primeCount(-10, 6));
        System.out.println(Arrays.toString(primeRange(-10, 6)));
    }

}
