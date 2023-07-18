public class Pattern {
    public static String pattern1(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    public static String pattern2(int n) {
        String str = "";
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                str += j + " ";
            }
            str += "\n";
        }
        return str;
    }

    public static String pattern3(int n) {
        String str = "";
        int i, j;
        for (i = 0; i < n; i++) {
            // inner loop work for space
            for (j = n - i; j >= 1; j--) {
                // prints space between two stars
                str += " ";
            }
            // inner loop for columns
            for (j = 1; j <= i; j++) {
                // prints star
                str += j + " ";
            }
            // throws the cursor in a new line after printing each line
            str += "\n";
        }

        return str;
    }

    public static String pattern4(int n) {
        int i, j;
        int space = n - 1;
        String str = " ";
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= space; j++) {
                str += " ";
            }
            space--;
            for (j = 1; j <= 2 * i - 1; j++) {
                str += "*";
            }
            str += "\n ";
        }
        space = 1;
        for (i = 1; i <= n - 1; i++) {
            for (j = 1; j <= space; j++) {
                str += " ";
            }
            space++;
            for (j = 1; j <= 2 * (n - i) - 1; j++) {
                str += "*";
            }
            str += "\n ";
        }

        return str;
    }

    public static String pattern5(int n) {
        int i, j, k;
        String str = " ";
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= i; j++) {
                str += " ";
            }
            for (k = 0; k <= n - i - 1; k++) {
                str += "* ";
            }
            str += "\n";
        }
        return str;
    }

    public static String pattern6(int n) {
        int i, j, k;
        String str = " ";
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= i + 1; j++) {
                str += " ";
            }
            for (k = 0; k < n - 1 - i; k++) {
                str += "* ";
            }
            str += "\n";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.print(pattern6(8));
    }

}
