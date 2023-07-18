public class SmallestMultipleWithDigit {

    private static boolean containsDigit(int number, int digit) {
        while (number != 0) {
            if (number % 10 == digit) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static int smallest1(int n) {
        int number = 1;
        while (true) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                int multiple = number * i;
                if (containsDigit(multiple, 2)) {
                    count++;
                }
            }
            if (count == n) {
                return number;
            }
            number++;

        }

    }

    public static int smallest2(int n) {
        int number = 1;
        int count = 0;

        while (count < n) {
            boolean contains2 = true;

            for (int i = 1; i <= n; i++) {
                int multiple = number * i;

                if (!containsDigit(multiple, 2)) {
                    contains2 = false;
                    break;
                }
            }

            if (contains2) {
                count++;
            } else {
                number++;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println("Smallest number whose first " + 1 + " multiples contain the digit 2: " + smallest1(1));
        System.out.println("Smallest number whose first " + 2 + " multiples contain the digit 2: " + smallest1(2));
        System.out.println("Smallest number whose first " + 3 + " multiples contain the digit 2: " + smallest1(3));
        System.out.println("Smallest number whose first " + 4 + " multiples contain the digit 2: " + smallest1(4));
        System.out.println("Smallest number whose first " + 5 + " multiples contain the digit 2: " + smallest1(5));
        System.out.println("Smallest number whose first " + 6 + " multiples contain the digit 2: " + smallest1(6));
        System.out.println("Smallest number whose first " + 7 + " multiples contain the digit 2: " + smallest1(7));
    }
}
