public class PowerSum {
    public static boolean powerSum(int[] a) {
        if (a.length == 0) {
            return false;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int exactSum = sum;
        int r = 0;
        while (sum > 0) {
            r = sum % 2;
            if (r == 0) {
                count++;
            }
            sum /= 2;
        }

        System.out.println(exactSum + "," + count);

        int temp = (int) Math.pow(2, count);

        return exactSum == temp ? true : false;

    }

    public static void main(String[] args) {
        System.out.println(powerSum(new int[] { 8, 8, 8, 8 }));
    }

}
