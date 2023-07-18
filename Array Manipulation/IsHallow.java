public class IsHallow {

    public static int isHallow(int[] a) {

        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] == 0 && a[i + 1] == 0 && a[i + 2] == 0) {
                int leftCount = i;
                int rightCount = a.length - i - 3;

                if (leftCount == rightCount) {
                    return 1;
                }
            }
        }

        // for (int i = 0; i < a.length - 2; i++) {
        // for (int j = i; j < a.length; j++) {
        // if (a[j] == 0 && a[i + 1] == 0 && a[i + 2] == 0) {
        // if (a.length - i - j == 1) {
        // return 1;
        // }
        // }
        // }
        // }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isHallow(new int[] { 1, 2, 0, 0, 0, 3, 4 })); // 1
        System.out.println(isHallow(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 })); // 1
        System.out.println(isHallow(new int[] { 1, 2, 0, 0, 3, 4 })); // 0
        System.out.println(isHallow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 })); // 0
        System.out.println(isHallow(new int[] { 3, 8, 3, 0, 0, 0, 3, 3 })); // 0
        System.out.println(isHallow(new int[] { 1, 2, 0, 0, 0, 3, 4, 0 })); // 0
        System.out.println(isHallow(new int[] { 0, 1, 2, 0, 0, 0, 3, 4 })); // 0
        System.out.println(isHallow(new int[] { 0, 0, 0 })); // 1
    }
}
