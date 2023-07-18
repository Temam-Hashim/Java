import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Test {

    public static int[] reverseArray(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;

    }

    public static int[] minMax(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }

        return new int[] { min, max };
    }

    public static double Power(double base, int exp) {
        double result = 1.0;
        if (exp >= 0) {
            for (int i = 1; i <= exp; i++) {
                result *= base;
            }
        } else {
            for (int i = 1; i <= -exp; i++) {
                result /= base;
            }
        }

        return result;

    }

    public static int characterCount(String str, char c) {
        int count = 0;
        int[] a = new int[str.length()];

        // for (int i = 0; i < str.length(); i++) {
        // int charAt = str.charAt(i);
        // int intChar = Character.getNumericValue(charAt);
        // a[i] = intChar;
        // }
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] == Character.getNumericValue(c)) {
        // count++;
        // }
        // }

        // char[] str2 = str.toCharArray();
        // for (int i = 0; i < str.length(); i++) {
        // if (str2[i] == c) {
        // count++;
        // }
        // }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        // int[] a = { 1, 2, 3, 4, 5 };
        // int[] b = minMax(a);

        System.out.println(characterCount("Temammamama", 'm'));

    }
}
