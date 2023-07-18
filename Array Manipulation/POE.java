// consider an array A with n of posative integers. an integer index is called POE(Point of Equilibrium) 
// of A if A[0]+A[1]+...+A[index-1] == A[index+1]+A[index+2]+...+A[n-1]
public class POE {

    public int equilibriumPoint(int[] array) {

        int i = 0;
        int j = array.length - 1;
        int index = 1;
        int leftSum = array[i];
        int rightSum = array[j];
        if (array.length < 3) {
            return -1;
        }
        for (int k = 1; k < array.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += array[i];
                index = i + 1;
            } else {
                j--;
                rightSum += array[j];
                index = j - 1;
            }

        }

        if (rightSum == leftSum) {
            return index;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = { 1, 8, 3, 7, 10, 2 };
        int[] b = { 1, 5, 3, 1, 1, 1, 1, 1, 1 };
        int[] c = { 2, 1, 1, 1, 2, 1, 7 };
        int[] d = { 3, 4, 5, 10 };
        POE p = new POE();
        System.out.println(p.equilibriumPoint(c));
    }

}
