
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class MaxBinaryOne {

    public static int findMaxBinaryOne(int[] a) {
        int count = 0;
        int current = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            }
            if (current < count) {
                current = count;
            }

            if (a[i] != 1) {
                count = 0;
            }
        }
        return current;
    }

    public static int findMaxConsecutiveCount(int[] a) {
        int count = 0;
        int current = 0;
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length && a[i] == a[i + 1]) {
                count++;
            }
            if (current < count) {
                current = count;
            }
            if (i + 1 < a.length && a[i] != a[i + 1]) {
                count = 0;
            }
        }
        return current + 1;
    }

    public static void main(String[] args) {

        System.out.println(findMaxBinaryOne(new int[] { 1, 1, 0, 0, 1, 1, 1 })); // 3
        System.out.println(findMaxConsecutiveCount(new int[] { 1, 0, 0, 1, 0, 1, 1, 1 })); // 4
    }

}
