class Program7 {
    public void myMethod(int num) {
        int sum = 0, rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Digit Sum:" + sum);
    }
}

public class DigitSum {

    public static void main(String[] args) {
        Program7 p = new Program7();
        p.myMethod(12345);
    }
}
