public class StackedNumber {
    public static int isStacked(int n) {
        int sum = 0;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            sum += i;
            if (sum == n) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isStacked(1)); // 1
        System.out.println(isStacked(3));// 1
        System.out.println(isStacked(6));// 1
        System.out.println(isStacked(10));// 1
        System.out.println(isStacked(15));// 1

        System.out.println(isStacked(7));// 0
        System.out.println(isStacked(8));// 0
        System.out.println(isStacked(9));// 0
    }
}
