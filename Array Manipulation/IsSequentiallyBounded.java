public class IsSequentiallyBounded {

    private static boolean isAscending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private static boolean occurrenceSuccess(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count >= n) {
            return false;
        }
        return true;
    }

    public static int isSequentiallyBounded(int[] a) {

        if (!isAscending(a)) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            if (!occurrenceSuccess(a, a[i])) {
                return 0;
            }

        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[] { 2, 3, 3, 99, 99, 99, 99, 99 })); // 1
        System.out.println(isSequentiallyBounded(new int[] { 1, 2, 3 })); // 0
        System.out.println(isSequentiallyBounded(new int[] { 2, 5, 5, 6, 6, 6, 6, 6 })); // 1
        System.out.println(isSequentiallyBounded(new int[] {})); // 1
    }

}
