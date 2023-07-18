public class IsVanilla {

    private static boolean hasDifferentDigits(int n) {
        String str = Integer.toString(Math.abs(n));
        char firstDigit = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != firstDigit) {
                return true;
            }
        }
        return false;
    }

    public static int isVanilla(int[] a) {
        for (int num : a) {
            if (hasDifferentDigits(num)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[] { 1, 11, 111 })); // 1
        System.out.println(isVanilla(new int[] { 1, 11, 102 })); // 0
        System.out.println(isVanilla(new int[] { 9, 999, 99999, -9999 })); // 1
        System.out.println(isVanilla(new int[] {})); // 1
        System.out.println(isVanilla(new int[] { 11, 22, 13, 34, 125 })); // 0
    }
}
