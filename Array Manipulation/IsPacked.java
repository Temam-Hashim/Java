public class IsPacked {
    private static boolean countNum(int[] a, int n) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                counter++;
            }
        }
        return counter == n;
    }

    private static boolean checkOverlap(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1] && (i + 2 < a.length && a[i] == a[i + 2])) {
                return false;
            }
        }
        return true;
    }

    public static int isPacked(int[] a) {
        boolean rule1 = true;
        boolean rule2 = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                rule1 = false;
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (!countNum(a, a[i])) {
                rule2 = false;
                break;
            }
        }

        if (rule1 && rule2 && checkOverlap(a)) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPacked(new int[] { 2, 2, 3, 3, 3 })); // 1
        System.out.println(isPacked(new int[] { 2, 3, 2, 3, 3 })); // 0
        System.out.println(isPacked(new int[] { 2, 2, 2, 3, 3, 3 })); // 0
        System.out.println(isPacked(new int[] { 2, 2, 1, 2, 2 })); // 0
        System.out.println(isPacked(new int[] { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 })); // 1
        System.out.println(isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7 })); // 1
        System.out.println(isPacked(new int[] { 1, 2, 2, 3, 3, 3, -1, -2, -2 })); // 0
    }
}
