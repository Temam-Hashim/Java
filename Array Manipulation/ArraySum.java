public class ArraySum {

    public int arraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;

    }

    public static void main(String[] args) {
        ArraySum as = new ArraySum();
        int[] a = { 4, 2, 3, 5, 2, 2, 6, 3, 4, 4 };
        System.out.println("Sum: " + as.arraySum(a));

    }
}
