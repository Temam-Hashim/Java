public class StantonMeasure {
    public static int stantonMeasure(int a[]) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                counter++;
            }
        }
        int numCounter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == counter) {
                numCounter++;
            }
        }

        return numCounter;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 1, 1, 4 };
        System.out.println(stantonMeasure(arr1)); // Output: 1

        int[] arr2 = { 1 };
        System.out.println(stantonMeasure(arr2)); // Output: 0

        int[] arr3 = { 0 };
        System.out.println(stantonMeasure(arr3)); // Output: 0

        int[] arr4 = { 8, 4, 2, 1, 1, 2, 2 };
        System.out.println(stantonMeasure(arr4)); // Output: 0
    }

}
