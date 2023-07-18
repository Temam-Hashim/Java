public class Centered15 {
    public static int isCentered15(int[] a) {
        int n = a.length;

        // int left = 0;
        // int right = n - 1;

        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            for (int j = i; j < n - 1; j++) {
                sum += a[j];
                if (sum == 15 && (n - i - j == 1)) {
                    return 1;
                }
            }

        }

        return 0;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 10, 4, 1, 6, 9 };
        int[] arr2 = { 2, 2, 10, 5, 6, 9 };
        int[] arr3 = { 3, 2, 4, 10, 5, 6, 9 };
        int[] arr4 = { 9, 15, 2 };
        int[] arr5 = { 1, 1, 14, 1, -1, -1 };
        int[] arr6 = { 1, 1, 14, 1, -1, -1, 2 };
        System.out.println(isCentered15(arr1)); // Output: 1
        System.out.println(isCentered15(arr2)); // Output: 1
        System.out.println(isCentered15(arr3)); // Output: 0
        System.out.println(isCentered15(arr4)); // Output: 1
        System.out.println(isCentered15(arr5)); // Output: 1
        System.out.println(isCentered15(arr6)); // Output: 0
    }
}
