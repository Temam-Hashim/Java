public class MinMaxDisJoint {

    private static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    private static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    private static boolean countMinMax(int[] a) {
        int max = a[0];
        int min = a[0];
        int minCount = 0;
        int maxCount = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxCount++;
            } else if (a[i] < min) {
                min = a[i];
                minCount++;
            }
        }

        return minCount + maxCount == 2;
    }

    public static int isMinMaxDisjoint(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int min = min(a);
        int max = max(a);

        if (max == min) {
            return 0;
        }

        if (!countMinMax(a)) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            // check adjacency
            if ((a[i] == min && a[i + 1] == max) || (a[i] == max && a[i + 1] == min)) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[] { 5, 4, 1, 3, 2 })); // 1
        System.out.println(isMinMaxDisjoint(new int[] { 18, -1, 3, 4, 0 })); // 0
        System.out.println(isMinMaxDisjoint(new int[] { 9, 0, 5, 9 })); // 0
        System.out.println(isMinMaxDisjoint(new int[] { 0, 5, 18, 0, 9 })); // 0
        System.out.println(isMinMaxDisjoint(new int[] { 7, 7, 7, 7 })); // 0
        System.out.println(isMinMaxDisjoint(new int[] {})); // 0
        System.out.println(isMinMaxDisjoint(new int[] { 1, 2 })); // 0
        System.out.println(isMinMaxDisjoint(new int[] { 1 })); // 0
    }
}
