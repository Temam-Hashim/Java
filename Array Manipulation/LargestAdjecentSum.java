public class LargestAdjecentSum {

    public static int largestAdjacentSum(int[] a) {
        int maxSum = a[0] + a[1];
        if (a.length < 2) {
            return -1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            int sum = a[i] + a[i + 1];
            if (maxSum < sum) {
                maxSum = sum;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {

        System.out.println(largestAdjacentSum(new int[] { 1, 2, 3, 4, 5 })); // 9
        System.out.println(largestAdjacentSum(new int[] { 1, 2, 3, 4 })); // 7
        System.out.println(largestAdjacentSum(new int[] { 18, -12, 9, -10 })); // 6
        System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 })); // 2
        System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1 }));// 3
        System.out.println(largestAdjacentSum(new int[] { -1, -1, -2, -4, 0,- 1  }));// 0
    }

}
