public class ReverseInteger {
    public void reverseInteger(int num) {
        int sum = 0, rem;
        while (num != 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed value:" + sum);
    }

    public static void main(String[] args) {
        ReverseInteger p = new ReverseInteger();
        p.reverseInteger(-12345);
    }
}
