public class Armstrong {

    public static int armstrong(int n) {
        int r = 0;
        int sum = 0;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        if (temp == sum) {
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int a = armstrong(170);
        if (a == 1) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

}
