
public class DigitSum {
    public void digitSum(int num) {
        int sum = 0, rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Digit Sum:" + sum);
    }

    public static void main(String[] args) {
        DigitSum p = new DigitSum();
        p.digitSum(12345);
    }
}
