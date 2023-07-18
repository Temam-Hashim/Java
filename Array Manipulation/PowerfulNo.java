public class PowerfulNo {

    public static boolean isPowerfulNo(int n) {
        if (n == 1) {
            return true; // 1 is considered a powerful number (1^1 = 1)
        }

        for (int base = 2; base <= n / 2; base++) {
            int temp = n;
            while (temp % base == 0) {
                temp /= base;
            }
            if (temp == 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerfulNo(8)); // Output: true (8 can be expressed as 2^3)
        System.out.println(isPowerfulNo(16)); // Output: true (16 can be expressed as 2^4)
        System.out.println(isPowerfulNo(9)); // Output: true (9 can be expressed as 3^3)
        System.out.println(isPowerfulNo(10)); // Output: false (10 cannot be expressed as the power of another number)
    }
}
