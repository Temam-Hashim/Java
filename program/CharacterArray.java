class Program3 {
    public void MyMethod(char[] a, int start, int length) {
        int i, j;
        for (i = start; i < start + length; i++) {
            if (start < 0 || length < 0 || length + start > a.length) {
                System.out.print("null");
                break;
            } else {
                System.out.print(a[i] + " ");
            }
        }
    }
}

public class CharacterArray {
    public static void main(String[] args) {
        Program3 p = new Program3();
        char[] arr = { 'a', 'b', 'c' };
        p.MyMethod(arr, 0, 1);
    }
}
