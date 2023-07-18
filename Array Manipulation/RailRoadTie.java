// 3. Define an array to be a railroad-tie array if the following three conditions hold
// a. The array contains at least one non-zero element 
// b. Every non-zero element has exactly one non-zero neighbor 
// c. Every zero element has two non-zero neighbors.

public class RailRoadTie {
    // condition 1
    private static boolean hasNonZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                return true;
            }
        }
        return false;
    }

    // condition 2
    private static boolean nonZeroHasExactlyOneNonZeroNeighbors(int[] a) {
        if (a.length < 2) {
            return true;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (i == 0 && a[i + 1] != 0) {
                    return true;
                } else if (i == a.length - 1 && a[i - 1] != 0) {
                    return true;

                } else if ((a[i - 1] == 0 && a[i + 1] != 0) || (a[i - 1] != 0 && a[i + 1] == 0)) {
                    return true;

                }

            }
        }
        return false;
    }

    // condition 3
    private static boolean zeroElementHasTwoNonZeroNeighbors(int[] a) {
        if (a.length < 3) {
            return true;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                if ((i == 0 || i == a.length - 1)) {
                    return false;
                } else {
                    if (a[i + 1] == 0 || a[i - 1] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int isRailRoadTie(int[] a) {
        if (hasNonZero(a) && nonZeroHasExactlyOneNonZeroNeighbors(a) && zeroElementHasTwoNonZeroNeighbors(a)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isRailRoadTie(new int[] { 1, 2, 0, 3, -18, 0, 2, 2 })); // 1
        System.out.println(isRailRoadTie(new int[] { 1, 2 })); // 1
        System.out.println(isRailRoadTie(new int[] { 1, 2, 0, 1, 2, 0, 1, 2 })); // 1
        System.out.println(isRailRoadTie(new int[] { 3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3 })); // 1
        System.out.println(isRailRoadTie(new int[] { 0, 0 })); // 0
        System.out.println(isRailRoadTie(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })); // 0
        System.out.println(isRailRoadTie(new int[] { 1, 3, 0, 3, 5, 0 })); // 0
    }
}
