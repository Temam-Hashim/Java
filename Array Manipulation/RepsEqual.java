import java.util.*;

public class RepsEqual {

    private static int[] digitArray(int n) {

        List<Integer> l = new ArrayList<>();
        if (n < 0) {
            n = -n;
        }
        while (n > 0) {
            int r = n % 10;
            l.add(r);
            n /= 10;
        }
        // reverse hence it is oredered backward
        Collections.reverse(l);
        int[] c = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            c[i] = l.get(i);
        }
        return c;
    }

    public static int[] digitArrayUsingString(int n) {
        String str = Integer.toString(n);
        int len = str.length();

        int[] c = new int[len];

        for (int i = 0; i < len; i++) {
            // int charArray = str.charAt(i);
            // c[i] = Character.getNumericValue(charArray);
            c[i] = Character.getNumericValue(str.charAt(i));
        }

        return c;
    }

    public static int repsEqual(int[] a, int n) {

        int[] x = digitArray(n);
        if (a.length != x.length) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i] != x[i]) {
                return 0;
            }

        }

        return 1;

    }

    public static void main(String[] args) {

        int[] a = digitArray(123);
        System.out.println(Arrays.toString(a));

        int[] b = digitArrayUsingString(123);
        System.out.println(Arrays.toString(b));

        int c = repsEqual(new int[] { 1, 2, 3 }, 321);
        System.out.println(c);
        int d = repsEqual(new int[] { 3, 2, 0, 5, 3 }, 32053);
        System.out.println(d);
        int e = repsEqual(new int[] { 3, 2, 0, 5 }, 32053);
        System.out.println(e);
    }

}
