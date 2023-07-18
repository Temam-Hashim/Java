import java.util.*;

public class ClusterCompression {

    public static int[] clusterCompression(int a[]) {

        int count = 0;
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            if (a[i] != a[i + 1]) {
                count++;
            }
        }
        int[] c = new int[count + 1];
        int k = 0;

        for (int i = 0; i < len - 1; i++) {
            if (a[i] != a[i + 1]) {
                c[k++] = a[i];
            }
        }
        // Handle the last element
        c[k] = a[len - 1];
        return c;
    }

    public static void main(String[] args) {
        int[] a = clusterCompression(new int[] { 2, 2, 1, 1, 0, 1, 2 });
        int[] b = clusterCompression(new int[] { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 });
        int[] c = clusterCompression(new int[] { 18 });
        int[] d = clusterCompression(new int[] { -5, -5, -5, -5, -5, -5 });
        int[] e = clusterCompression(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 });
        System.out.println(Arrays.toString(a)); // {2,1,0,1,2}
        System.out.println(Arrays.toString(b)); // {0,2,0,2,0,2,0}
        System.out.println(Arrays.toString(c)); // {18}
        System.out.println(Arrays.toString(d)); // {-5}
        System.out.println(Arrays.toString(e)); // {1,2,1}
    }
}
