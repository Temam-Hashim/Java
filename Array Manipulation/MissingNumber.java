import java.util.Arrays;

public class MissingNumber {

    // assum the number always start from 0;
    public static int missingNumber1(int[] a) {
        int actualSum = 0;
        int n = a.length;

        int expectedSum = n * (n + 1) / 2;
        for (int ele : a) {
            actualSum += ele;
        }

        int missingNumber = expectedSum - actualSum;
        if (missingNumber < 0) {
            return -1;
        }

        return missingNumber;
    }

    public static int missingNumber2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;

    }

    public static int missingNumber3(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length && a[i + 1] != a[i] + 1) {
                return a[i] + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        System.out.println(missingNumber1(new int[] { 1, 3, 4, 5, 2, 6, 7, 8 }));
        System.out.println(missingNumber1(new int[] { 0, 2, 1 }));
    }
}
