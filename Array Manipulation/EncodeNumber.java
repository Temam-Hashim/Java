import java.util.*;

public class EncodeNumber {

    private static int[] digitArray(int n) {
        List<Integer> numbers = new ArrayList<>();
        while (n > 1) {
            int r = n % 2;
            numbers.add(r);
            n /= 2;
        }
        int[] c = new int[numbers.size()];
        int k = 0;
        for (int num : numbers) {
            c[k++] = num;
        }
        return c;
    }

    public static int encodeNumber(int n) {
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitArray(6936)));

    }
}
