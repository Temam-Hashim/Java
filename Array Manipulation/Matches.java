public class Matches {
    public static String matches(int[] A, int[] P) {
        int Psum = 0;
        for (int i = 0; i < P.length; i++) {
            Psum += Math.abs(P[i]);
        }
        if (Psum != A.length) {
            return "A does not match P";
        }

        int start = 0;

        for (int i = 0; i < P.length; i++) {
            int length = Math.abs(P[i]);
            // boolean positive = P[i] > 0;

            for (int j = start; j < start + length; j++) {
                if ((P[i] > 0 && A[j] < 0) || (P[i] < 0 && A[j] > 0)) {
                    return "A does not match P";
                }
            }

            start += length;
        }

        return "A matches P";
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, -5, -5, 2, 3, 18 };
        int[] P1 = { 3, -2, 3 };
        int[] P2 = { 2, 1, -1, -1, 2, 1 };
        int[] P3 = { 1, 2, -1, -1, 1, 2 };
        int[] P4 = { 2, 1, -2, 3 };
        int[] P5 = { 1, 1, 1, -1, -1, 1, 1, 1 };
        int[] P6 = { 4, -1, 3 };
        int[] P7 = { 8 };
        int[] P8 = { 3, -3, 2 };

        System.out.println(matches(A, P1)); // matches\
        System.out.println(matches(A, P2)); // matches
        System.out.println(matches(A, P3)); // matches
        System.out.println(matches(A, P4)); // matches
        System.out.println(matches(A, P5)); // matches

        System.out.println(matches(A, P6)); // not matches
        System.out.println(matches(A, P7)); // not matches
        System.out.println(matches(A, P8)); // not matches

    }
}
