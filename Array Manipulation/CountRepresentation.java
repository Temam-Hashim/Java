import java.util.HashSet;

public class CountRepresentation {
    public static int countRepresentation1(int n) {
        int[] denominators = { 1, 2, 5, 10, 20 };
        int dp[] = new int[n + 1];
        dp[0] = 1; // one way to represent 0 rupee

        for (int i = 0; i < denominators.length; i++) {
            int denominator = denominators[i];
            for (int j = denominator; j <= n; j++) {
                dp[j] += dp[j - denominator];
            }
        }

        return dp[n];
    }

    public static int countRepresentation2(int numRupees) {
        int count = 0;

        for (int rupee20 = 0; rupee20 <= numRupees / 20; rupee20++) {
            for (int rupee10 = 0; rupee10 <= numRupees / 10; rupee10++) {
                for (int rupee5 = 0; rupee5 <= numRupees / 5; rupee5++) {
                    for (int rupee2 = 0; rupee2 <= numRupees / 2; rupee2++) {
                        for (int rupee1 = 0; rupee1 <= numRupees; rupee1++) {
                            if (rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2 + rupee1 == numRupees) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countRepresentation2(12)); // 15
        System.out.println(countRepresentation2(2)); // 2

    }
}
