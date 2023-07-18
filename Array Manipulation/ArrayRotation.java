import java.util.Arrays;

public class ArrayRotation {
    public static int[] arrayRotation1(int[] a, int k) {
        k = k % a.length;

        reverseArray(a, 0, a.length - 1);
        reverseArray(a, 0, k - 1);
        reverseArray(a, k, a.length - 1);

        return a;
    }

    public static int[] arrayRotation2(int[] a, int k) {
        int n = a.length;
        k = k % n;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n - k; i++) {
            rotatedArray[i + k] = a[i];
        }
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = a[n - k + i];
        }

        return rotatedArray;

    }

    public static int[] reverseArray(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arrayRotation1(a, 2)));
    }

}
