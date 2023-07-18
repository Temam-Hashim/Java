public class SequencedArray {

    public static int isSequencedArray(int[] a, int m, int n) {
        int len = a.length - 1;
        if (a[len] < m || a[len] > n) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if (a[i] < m || a[i] > n || a[i] >= a[i + 1]) {
                return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        int a = isSequencedArray(new int[] { 1, 2, 3, 4, 5 }, 1, 5);
        int b = isSequencedArray(new int[] { 1, 2, 3, 4, 5 }, 1, 5);
        int c = isSequencedArray(new int[] { 1, 3, 4, 2, 5 }, 1, 5);
        System.out.println(a); // 1
        System.out.println(b); // 1
        System.out.println(c); // 0
    }
}
