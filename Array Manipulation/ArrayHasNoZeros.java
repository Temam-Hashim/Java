public class ArrayHasNoZeros {
    public static int arrayHasNoZeros(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 0, -1, 2 };
        int[] b = { 33, -5, 12, 45, 1 };
        int[] c = { 5, 2, 9, 0, 5, -20 };

        System.out.println(arrayHasNoZeros(a)); // 0
        System.out.println(arrayHasNoZeros(b)); // 1
        System.out.println(arrayHasNoZeros(c)); // 0

    }

}
