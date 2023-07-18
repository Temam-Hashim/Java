public class SumFactor {
    public static int sumFactor(int[] a) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] a1 = { 3, 0, 2, -5, 0 };
        int[] a2 = { 0, 0, 0 };
        System.out.println(sumFactor(a1)); // 2
        System.out.println(sumFactor(a2)); // 3

    }

}
