class Program4 {
    public void myMethod(int num) {
        int sum = 0, rem;
        while (num != 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed value:" + sum);
    }
}

public class ReverseInteger {

    public static void main(String[] args) {
        Program4 p = new Program4();
        p.myMethod(-12345);
    }
}
