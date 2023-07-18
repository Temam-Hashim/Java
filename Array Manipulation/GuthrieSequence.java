public class GuthrieSequence {
    public static int isGuthrieSequence(int[] a) {
        if (a[a.length - 1] != 1) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i + 1] != a[i] / 2) {
                    return 0;
                }
            } else {
                if (a[i + 1] != (a[i] * 3) + 1) {
                    return 0;
                }
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 8, 4, 2, 1 };
        System.out.println(isGuthrieSequence(arr1)); // Output: 1

        int[] arr2 = { 8, 17, 4, 1 };
        System.out.println(isGuthrieSequence(arr2)); // Output: 0

        int[] arr3 = { 8, 4, 1 };
        System.out.println(isGuthrieSequence(arr3)); // Output: 0

        int[] arr4 = { 8, 4, 2 };
        System.out.println(isGuthrieSequence(arr4)); // Output: 0

        int[] arr5 = { 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 };
        System.out.println(isGuthrieSequence(arr5)); // Output: 1

        int[] arr6 = { 1 };
        System.out.println(isGuthrieSequence(arr6)); // Output: 1

    }
}
