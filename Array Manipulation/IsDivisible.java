public class IsDivisible {

    public static int isDivisible(int[] a, int divisor) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 3, 6, 12, 9 };
        int[] b = { 3, 6, 12, 10 };

        System.out.println(isDivisible(a, 3)); // outpput 1
        System.out.println(isDivisible(b, 3)); // output 0

    }

}
