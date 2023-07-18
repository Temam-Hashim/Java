import java.util.Arrays;

public class IsIsolated {

    private static int[] convertNumToArray(int n) {
        String str = Integer.toString(n);
        int len = str.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            // arr[i] = Character.getNumericValue(str.charAt(i));
            arr[i] = str.charAt(i) - '0';
        }

        return arr;
    }

    private static boolean containsDigit(int[] a, int n) {
        for (int num : a) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    public static int isIsolated(int n) {
        int[] original = convertNumToArray(n);
        int[] square = convertNumToArray(n * n);
        int[] cube = convertNumToArray(n * n * n);

        for (int i = 0; i < original.length; i++) {
            if (containsDigit(square, original[i]) || containsDigit(cube, original[i])) {
                return 0;
            }
        }

        // for (int i = 0; i < original.length; i++) {
        // for (int j = 0; j < square.length; j++) {
        // if (original[i] == square[j]) {
        // return 0;
        // }
        // }
        // }
        // for (int i = 0; i < original.length; i++) {
        // for (int j = 0; j < cube.length; j++) {
        // if (original[i] == cube[j]) {
        // return 0;
        // }
        // }
        // }

        return 1;

    }

    public static void main(String[] args) {

        // System.out.println(Arrays.toString(convertNumToArray(2)));

        System.out.println(isIsolated(2)); // 1
        System.out.println(isIsolated(3)); // 1
        System.out.println(isIsolated(8)); // 1
        System.out.println(isIsolated(14)); // 0
        System.out.println(isIsolated(24)); // 0
        System.out.println(isIsolated(28)); // 0
        System.out.println(isIsolated(162)); // 0

    }

}
