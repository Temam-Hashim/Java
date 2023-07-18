import java.util.*;

public class OddHeavy {

    private static int[] oddElements(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        int[] b = new int[count];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                b[k++] = a[i];
            }
        }

        return b;

    }

    private static int[] evenElements(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        int[] b = new int[count];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[k++] = a[i];
            }
        }

        return b;

    }

    public static int isOddHeavy(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }

        }
        if (count == 0) {
            return 0;
        }

        int[] odd = oddElements(a);
        int[] even = evenElements(a);

        for (int i = 0; i < odd.length; i++) {
            for (int j = 0; j < even.length; j++) {
                if (even[j] > odd[i]) {
                    return 0;
                }
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[] { 11, 9, 2, 4, 6 })); // 1
        System.out.println(isOddHeavy(new int[] { 11, 9, 2, 4, 12 })); // 0
        System.out.println(isOddHeavy(new int[] { 1, 3, 0 })); // 1
        System.out.println(isOddHeavy(new int[] { 1 })); // 1
        System.out.println(isOddHeavy(new int[] { 2, 4, 6 })); // 0
        System.out.println(isOddHeavy(new int[] { 2, 4, 5 })); // 1

    }

}
