public class IsLegalNumber {

    public static boolean IsLegalNumber(int[] a, int base) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > base) {
                return false;
            }
        }

        return true;

    }

    private static int convertToBase10(int[] a, int base) {
        // check legality first

        int result = 0;
        int power = 1;
        if (IsLegalNumber(a, base)) {
            for (int i = a.length - 1; i >= 0; i--) {
                result += a[i] * power;
                power *= base;
            }

        }

        return result;
    }

    // public static int[] convertDigitToArray(int n) {
    // String str = Integer.toString(n);
    // int len = str.length();

    // int[] c = new int[len];
    // for (int i = 0; i < len; i++) {
    // c[i] = Character.getNumericValue(str.charAt(i));
    // }

    // return c;

    // }

    // public static int legalDigit(int n, int base) {
    // int base10 = 0, count = 0;
    // int[] c = convertDigitToArray(n);
    // for (int i = c.length - 1; i >= 0; i--) {
    // base10 += c[i] * Math.pow(base, count++);
    // }

    // return base10;
    // }

    public static void main(String[] args) {

        int[] a = { 1, 0, 1, 1 };
        int[] b = { 1, 1, 2 };
        int[] c = { 3, 2, 5 };
        int[] d = { 3, 7, 1 };

        System.out.println(convertToBase10(a, 2));
        System.out.println(convertToBase10(b, 3));
        System.out.println(convertToBase10(c, 8));
        System.out.println(convertToBase10(d, 6));

        // check if the number is digit
        // System.out.println(legalDigit(1011, 2));
    }

}
