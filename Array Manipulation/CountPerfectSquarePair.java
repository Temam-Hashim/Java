public class CountPerfectSquarePair {

    private static boolean perfectSquare(int x) {
        double temp = Math.sqrt(x);
        int newOne = (int) temp;

        return temp == newOne;
    }

    public static int isPerfectSquare(int[] a) {
        int counter = 0;
        if (a.length <= 1) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > 0 && a[j] > 0) {
                    if (perfectSquare(a[i] + a[j])) {
                        counter++;
                    }

                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr1 = { 9, 0, 2, -5, 7 };
        System.out.println(isPerfectSquare(arr1)); // Output: 2
        int[] arr2 = { 1, 2, 7, 9, 7, 3, 6, 23, 5, 4 };
        System.out.println(isPerfectSquare(arr2)); // Output: 1

    }

}