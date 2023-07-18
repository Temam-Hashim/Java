import java.util.Scanner;

public class FibonacciSeries {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void Fibonacci1(int n) {

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: " + firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static int Fibonacci2(int n) {

        if (n < 0) {
            return -1; // Invalid input, return -1
        } else if (n == 0) {
            return 0; // Base case, return 0 for the first term in the series
        } else if (n == 1) {
            return 1; // Base case, return 1 for the second term in the series
        } else {
            int a = 0;
            int b = 1;
            int result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();

        // Fibonacci1(numTerms);

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < num; i++) {
            System.out.print(Fibonacci2(i) + " ");
        }

    }
}