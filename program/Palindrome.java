class Program8 {
    public String myMethod(int num) {
        int sum = 0, rem, temp;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        if (sum != temp) {
            return "The number not is Palindrome";
        }
        return "The number is Palindrome";
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Program8 p = new Program8();
        System.out.println(p.myMethod(122));

    }
}
