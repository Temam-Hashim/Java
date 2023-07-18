public class Is121Array {

    public static int is121Array(int[] a) {
        // int i = 0;
        // int j = a.length - 1;
        int left = 0;
        int right = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1 && a[i] != 2) {
                return 0;
            }
            if (a[i] == 1) {
                left++;
            }
            if (a[i] != 1) {
                break;
            }
        }
        for (int j = a.length - 1; j >= 0; j--) {
            if (a[j] == 1) {
                right++;
            }
            if (a[j] != 1) {
                break;
            }
        }

        if (left == right) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 1 };
        int[] b = { 1, 1, 2, 2, 2, 1, 1 };
        int[] c = { 1, 1, 2, 2, 2, 1, 1, 1 };
        int[] d = { 1, 1, 2, 1, 2, 1, 1 };
        // int[] e = { 1, 1, 1, 2, 1, 1, 2, 1, 1, 1 };
        System.out.println(is121Array(a)); // 1
        System.out.println(is121Array(b)); // 1
        System.out.println(is121Array(c)); // 0
        System.out.println(is121Array(d)); // 0
        // System.out.println(is121Array(e)); // 0

    }
}
