import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterArray {

    public static int[] getExponents(int n) {
        List<Integer> exponents = new ArrayList<>();
        int count = 0;
        int index = 0;

        while (n > 0) {
            int bit = n % 2;
            if (bit == 1) {
                exponents.add(index);
                count++;
            }
            n = n / 2;
            index++;
        }

        if (count == 0) {
            return new int[0]; // No selected elements
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = exponents.get(i);
        }

        return result;
    }

    public static int[] filterArray(int[] a, int n) {
        int[] exponents = getExponents(n);
        if (exponents == null || exponents.length > a.length) {
            return null; // Not enough elements in the array
        }

        int[] filteredArray = new int[exponents.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < exponents.length; j++) {
                if (exponents[j] == i) {
                    filteredArray[k++] = a[i];
                }
            }
        }

        return filteredArray;
    }

    public static void main(String[] args) {
        int[] a = filterArray(new int[] { 8, 4, 9, 0, 3, 1, 2 }, 88);
        int[] b = filterArray(new int[] { 9, -9 }, 0);
        int[] c = filterArray(new int[] { 9, -9 }, 1);
        int[] d = filterArray(new int[] { 9, -9 }, 2);
        int[] e = filterArray(new int[] { 9, -9 }, 3);
        int[] f = filterArray(new int[] { 9, -9 }, 4);
        int[] g = filterArray(new int[] { 9, -9, 5 }, 3);
        int[] h = filterArray(new int[] { 0, 9, 12, 18, -6 }, 11);

        System.out.println(Arrays.toString(a)); // [0,3,2]
        System.out.println(Arrays.toString(b)); // []
        System.out.println(Arrays.toString(c)); // [9]
        System.out.println(Arrays.toString(d)); // [-9]
        System.out.println(Arrays.toString(e)); // [9,-9]
        System.out.println(Arrays.toString(f)); // []
        System.out.println(Arrays.toString(g)); // [9,-9]
        System.out.println(Arrays.toString(h)); // [0,9,18]
    }
}
