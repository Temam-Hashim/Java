public class LargestPrimeFactor {

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        }
        int maxPrimeFactor = 0;
        int factor = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0 && isPrime(i)) {
                factor = i;
            }

            if (factor > maxPrimeFactor) {
                {
                    maxPrimeFactor = factor;
                }
            }
        }
        return maxPrimeFactor;
    }

    public static void main(String[] args) {

        System.out.println(largestPrimeFactor(10)); // 5
        System.out.println(largestPrimeFactor(6936)); // 17
        System.out.println(largestPrimeFactor(1)); // 0
        System.out.println(largestPrimeFactor(21)); // 7
    }

}
