public class MaxMinElement {
    public int[] maxMinArrayElement(int[] a) {
        int max = a[0];
        int min = a[0];
        int[] c = new int[2];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }

        c[0] = max;
        c[1] = min;

        return c;
    }

    public static void main(String[] args) {
        MaxMinElement m = new MaxMinElement();
        int[] a = { 20, 2, 54, 4, 1, 21 };
        int[] result = m.maxMinArrayElement(a);

        System.out.println("Maximum: " + result[0]);
        System.out.println("Minimum: " + result[1]);
    }
}
