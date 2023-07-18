public class PerfectSquare {

    public static int nextPerfectSquare1(int n) {
        if (n < 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            if (i * i > n) {
                return i * i;
            }
        }
        return -1;
    }

    public static int nextPerfectSquare2(int n) {
        if (n < 0) {
            return 0;
        }
        int root = (int) Math.sqrt(n);
        if (root + 1 > n) {
            return -1;
        }
        return (root + 1) * (root + 1);

    }

    public static void main(String[] args) {
        System.out.println(nextPerfectSquare2(1));
        System.out.println(nextPerfectSquare2(12));
    }

}
