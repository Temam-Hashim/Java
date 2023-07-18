import java.util.HashSet;

public class IsTrivalent {

    public static int isTrivalent1(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
            if (set.size() > 3) {
                return 0;
            }

        }
        return set.size() == 3 ? 1 : 0;
    }

    public static int isTrivalent2(int[] a) {
        if (a.length < 3) {
            return 0;
        }

        int count = 0;
        int[] uniqueValues = new int[3];

        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < count; j++) {
                if (a[i] == uniqueValues[j]) {
                    break;
                }
            }

            if (j == count) {
                if (count == 3) {
                    return 0;
                }
                uniqueValues[count++] = a[i];
            }
        }

        return (count == 3) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isTrivalent2(new int[] { 22, 19, 10, 10, 19, 22, 22, 10 })); // 1
        System.out.println(isTrivalent2(new int[] { 1, 2, 2, 2, 2, 2, 2 })); // 0
        System.out.println(isTrivalent2(new int[] { 2, 2, 3, 3, 3, 3, 2, 41, 65 })); // 0
        System.out.println(isTrivalent2(new int[] {})); // 0
        System.out.println(isTrivalent2(new int[] { 2147483647, -1, -1, -2147483648 })); // 1
    }
}
