class Program2 {
    public int SumArray(int[] a) {
        int i;
        int sumOdd = 0;
        int sumEven = 0;

        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumEven += a[i];
            } else {
                sumOdd += a[i];
            }
        }

        return sumOdd - sumEven;

    }
}

public class SumArrayElement {
    public static void main(String[] args) {
        Program2 main = new Program2();
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(main.SumArray(arr));
    }

}
