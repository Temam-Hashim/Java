public class NupCount {
    public static int nUpCount(int[] a, int n) {
        int counter = 0;
        int sum = 0;
        int currentSum = a[0];
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > n && currentSum <= n) {
                counter++;
            }
            currentSum = sum;
        }

        return counter;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, -1, 5,3,2,-3};
        System.out.println(nUpCount(a, 6));
    }
}
