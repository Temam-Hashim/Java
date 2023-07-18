public class CharacterArray {
    public void characterArray(char[] a, int start, int length) {
        int i;
        for (i = start; i < start + length; i++) {
            if (start < 0 || length < 0 || length + start > a.length) {
                System.out.print("null");
                break;
            } else {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        CharacterArray p = new CharacterArray();
        char[] arr = { 'a', 'b', 'c' };
        p.characterArray(arr, 0, 2);
    }
}
