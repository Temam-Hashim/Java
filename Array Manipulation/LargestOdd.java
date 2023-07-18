public class LargestOdd {

    public static int findLargestOdd(String str) {
        int maxDigit = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));

            if (digit % 2 != 0) {
                if (maxDigit < digit) {
                    maxDigit = digit;
                }
            }
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        System.out.println(findLargestOdd("789")); // 9
        System.out.println(findLargestOdd("18632")); // 3
        System.out.println(findLargestOdd("121")); // 1
    }

}
