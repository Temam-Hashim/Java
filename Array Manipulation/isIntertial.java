public class isIntertial {

    private static boolean evenMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max % 2 == 0;
    }

    private static boolean oddOverEven(int[] a) {
        int maxEven = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > maxEven) {
                maxEven = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] != maxEven && a[i] <= a[j]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static boolean containsOdd(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static int isIntertial(int[] a) {
        if (containsOdd(a) && evenMax(a) && oddOverEven(a)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = { 11, 4, 20, 9, 2, 8 };
        System.out.println(isIntertial(arr1)); // Output: 1

        int[] arr2 = { 12, 11, 4, 9, 2, 3, 10 };
        System.out.println(isIntertial(arr2)); // Output: 0

        int[] arr3 = { 1, 1, 1, 1, 1, 1, 2 };
        System.out.println(isIntertial(arr3)); // Output: 1

        int[] arr4 = { 2, 12, 4, 6, 8, 11 };
        System.out.println(isIntertial(arr4)); // Output: 1

        int[] arr5 = { -2, -4, -6, -8, -11 };
        System.out.println(isIntertial(arr5)); // Output: 0
    }
}
