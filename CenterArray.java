class Program1 {
    public int MiddleElemnt(int[] a) {
        int i, j;
        int middleElement = a[a.length / 2];
        // System.out.println(middleElement);
        for (i = 0; i < a.length; i++) {
            if (middleElement > a[i]) {
                return 0;
            }
        }

        return 1;
    }
}

public class CenterArray {
    public static void main(String[] args) {
        Program1 main = new Program1();
        int[] arr = { 7, 6, 5, 3, 4, 5, 2 };
        System.out.println(main.MiddleElemnt(arr));
    }

}
