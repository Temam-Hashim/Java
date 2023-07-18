import java.util.Arrays;
import java.util.Random;

// generate random number between 0 to 10 and store inside the array and return the max value
public class RandomNumber {

    private static int getMax(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // generate random Number

    private static int generateRandomNumber(int a, int b) {
        // using Math.random()
        // double rand = Math.random() * (b - a + 1) + a;

        // using random class
        Random rand = new Random();
        int x = rand.nextInt(a, b);

        return x;
    }

    // store random number in an array
    public static int[] randomArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = generateRandomNumber(0, 10);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = randomArray(new int[10]);
        System.out.println(Arrays.toString(randomArray(a)));
        System.out.println(getMax(a));
    }

}
