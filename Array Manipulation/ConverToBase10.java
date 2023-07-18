import java.util.Arrays;

public class ConverToBase10 {

    public static int[] convertToArray(int n) {
        String str = Integer.toString(n);
        int len = str.length();
        int[] c = new int[len];
        for (int i = 0; i < len; i++) {
            c[i] = Character.getNumericValue(str.charAt(i));
        }
        return c;
    }

    public static int convertToBase10(int n, int base) {
        int[] arr = convertToArray(n);
        System.out.println(Arrays.toString(arr));
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= base) {
                return -1;
            }
            res += arr[i] * Math.pow(base, count++);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase10(10, 2));
        System.out.println(convertToBase10(222, 3));

    }
}
