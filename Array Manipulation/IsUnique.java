public class IsUnique {

    public static int isUnique(int a[], int n) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    counter++;
                }
            }
        }
        if (counter == 1) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {
        int[] a = { 7, 3, 3, 2, 4 };
        int[] e = { 1 };

        System.out.println(isUnique(a, 6));
        System.out.println(isUnique(a, 10));
        System.out.println(isUnique(a, 11));
        System.out.println(isUnique(a, 8));
        System.out.println(isUnique(a, 4));
        System.out.println(isUnique(e, 5));

    }

}
