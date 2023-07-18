import java.util.*;

public class WaveFormSort {
    public static int[] waveFormSort(int[] a) {
        for (int i = 0; i < a.length; i = i + 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 3, 1, 6, 4, 2, 5 };
        int[] c = waveFormSort(a);
        System.out.println(Arrays.toString(c));
    }

}
