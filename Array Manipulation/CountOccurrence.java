import java.util.*;

public class CountOccurrence {

    public static int[] countOccurrence(int[] a) {

        int maxElement = a[0];
        for (int num : a) {
            if (num > maxElement) {
                maxElement = num;
            }
        }

        int[] occurrenceCounter = new int[maxElement + 1];

        for (int num : a) {
            occurrenceCounter[num]++;
        }

        return occurrenceCounter;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 1, 1, 2 };
        int[] c = countOccurrence(a);
        System.out.println("Occurrence of an array element is:");
        for (int i = 1; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

}
