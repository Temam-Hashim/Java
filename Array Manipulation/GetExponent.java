public class GetExponent {

    public static int getExponent(int n, int p) {
        if (p <= 1) {
            return -1;
        }

        int exponent = 0;
        while (n > 0) {
            if (n % p != 0) {
                break;
            }
            n /= p;
            exponent++;
        }

        return exponent;
    }

    public static void main(String[] args) {
        System.out.println(getExponent(162, 3)); // 4
        System.out.println(getExponent(27, 3)); // 3
        System.out.println(getExponent(81, 4)); // 0
        System.out.println(getExponent(100, 2)); // 2
        System.out.println(getExponent(18, -1)); // -1
    }
}
