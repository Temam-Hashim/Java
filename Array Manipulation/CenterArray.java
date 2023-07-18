public class CenterArray {
    public int middleElemnt(int[] a) {
        int i;
        int middleElement = a[a.length / 2];
        for (i = 0; i < a.length; i++) {
            if (middleElement > a[i]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        CenterArray main = new CenterArray();
        int[] arr = { 7, 6, 5, 1, 4, 5, 2 };
        System.out.println(main.middleElemnt(arr));
    }

}
