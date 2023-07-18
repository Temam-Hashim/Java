public class ComputeDepth {
    public static int computeDepth(int n) {
        boolean[] digits = new boolean[10]; // Track the appearance of digits
        int depth = 0;
        int multiple = 0;

        while (!allDigitsAppeared(digits)) {
            multiple += n;
            updateDigitsAppearance(digits, multiple);
            depth++;
        }

        return depth;
    }

    private static boolean allDigitsAppeared(boolean[] digits) {
        for (boolean digit : digits) {
            if (!digit) {
                return false;
            }
        }
        return true;
    }

    private static void updateDigitsAppearance(boolean[] digits, int number) {
        while (number > 0) {
            int digit = number % 10;
            digits[digit] = true;
            number /= 10;
        }
    }

    public static void main(String[] args) {

        System.out.println("Depth of " + 42 + ": " + computeDepth(42)); // Output: Depth of 42: 9

        System.out.println("Depth of " + 7 + ": " + computeDepth(7)); // Output: 10
        System.out.println("Depth of " + 13 + ": " + computeDepth(13)); // Output: 8
        System.out.println("Depth of " + 25 + ": " + computeDepth(25)); // Output: 36
    }
}
