public class MandavArray {
    public static int isMandavArray(int[] a) {
        int length = a.length;
        int n = 1;
        int index = 1;

        while (index < length) {
            int subArrayLength = n + 1;

            // Check if the remaining elements are enough to form the next sub-array
            if (index + subArrayLength > length) {
                return 0;
            }

            // Calculate the expected sum for the next sub-array
            int expectedSum = 0;
            for (int i = index; i < index + subArrayLength; i++) {
                expectedSum += a[i];
            }

            // Compare the expected sum with the sum calculated so far
            if (expectedSum != a[0]) {
                return 0;
            }

            // Update variables for the next iteration
            n++;
            index += subArrayLength;
        }

        // Check if all elements have been processed
        if (index == length) {
            return 1;
        }

        return 0;
    }

    public static int isMandavArray1(int[] a) {
        int n = a.length;
        int index = 1;
        int sum = a[0];

        while (index < n - 1) {
            int subArrayLength = index + 1;

            if (index + subArrayLength > n) {
                return 0;
            }

            int expectedSum = 0;
            for (int i = index; i < index + subArrayLength; i++) {
                expectedSum += a[i];
            }
            if (sum == expectedSum) {
                return 1;
            }
            sum += a[index];
            index++;
        }

        return 0;

    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 1 };
        System.out.println(isMandavArray1(arr1)); // Output: 1

        int[] arr2 = { 2, 1, 1, 4, -1, -1 };
        System.out.println(isMandavArray1(arr2)); // Output: 1

        int[] arr3 = { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 };
        System.out.println(isMandavArray1(arr3)); // Output: 1

        int[] arr4 = { 18, 9, 10, 6, 6, 6 };
        System.out.println(isMandavArray1(arr4)); // Output: 0
    }
}
