// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space
public class Singleton {

    public static int findSingleArrayElement1(int[] a) {

        int result = 0;
        for (int num : a) {
            result = result ^ num;
        }
        return result;
    }

    public static int findSingleArrayElement2(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 1) {
                res = a[i];
                break;
            }

        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(findSingleArrayElement2(new int[] { 2, 2, 1 })); // 1
        System.out.println(findSingleArrayElement2(new int[] { 1, 2, 1, 3, 5, 2, 3 })); // 5
        System.out.println(findSingleArrayElement2(new int[] { 1, 2, 1, 4, 2 })); // 4
        System.out.println(findSingleArrayElement2(new int[] { 1 })); // 1
        System.out.println(findSingleArrayElement2(new int[] {})); // 0
    }

}
