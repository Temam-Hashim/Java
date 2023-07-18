public class FindPorcupineNumber {

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isLastDigitNine(int n) {
        return n % 10 == 9;
    }

    private static int nextPrime(int n) {
        int next = n + 1;
        while (n >= 0) {
            if (isPrime(next)) {
                return next;
            }
            next++;
        }
        return 0;

    }

    public static boolean satisfied(int n) {
        if (isPrime(n) && isLastDigitNine(n)) {
            return true;
        }
        return false;
    }

    public static int findPorcupineNumber(int n) {
        int next = n + 1;
        while (next > 0) {
            int nextPrime = nextPrime(next);
            if (satisfied(next) && satisfied(nextPrime)) {
                return next;
            }
            next++;
        }
        return 0;

    }

    // public static int findPorcupineNumber(int n) {
    // int num = n + 1;
    // while (n >= 0) {
    // if (isPrime(num) && isLastDigitNine(num)) {
    // int nextPrime = nextPrime(num);
    // if (isLastDigitNine(nextPrime)) {
    // return num;
    // }
    // }
    // num++;
    // }
    // return 0;

    // }

    public static void main(String[] args) {

        System.out.println(findPorcupineNumber(0)); // Output: 139
        System.out.println(findPorcupineNumber(19)); // Output: 139
        System.out.println(findPorcupineNumber(139)); // Output: 139
        System.out.println(findPorcupineNumber(149)); // Output: 409
        System.out.println(findPorcupineNumber(409)); // Output: 409

    }

}
