public class Palindrome {
    public String palindrome(int num) {
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

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.palindrome(122));

    }
}
