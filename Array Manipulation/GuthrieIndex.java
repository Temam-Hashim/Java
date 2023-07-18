public class GuthrieIndex {

    public static int guthrieIndex(int n) {
        int oddCounter = 0, evenCounter = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                evenCounter++; // used if we need only even guthrie index counter
            } else {
                n = (n * 3) + 1;
                oddCounter++; // used if we need only odd guthrie index counter
            }
        }

        return oddCounter + evenCounter; // used if we need total guthrie index counter
    }

    public static void main(String[] args) {
        System.out.println(guthrieIndex(1)); // Output: 0
        System.out.println(guthrieIndex(2)); // Output: 1
        System.out.println(guthrieIndex(3)); // Output: 7
        System.out.println(guthrieIndex(4)); // Output: 2
        System.out.println(guthrieIndex(7)); // Output: 16
        System.out.println(guthrieIndex(42)); // Output: 8

    }

}
