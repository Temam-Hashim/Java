public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = new StringBuilder(str).reverse().toString();
        // for (int i = str.length() - 1; i >= 0; i--) {
        // reversedStr.append(str.charAt(i));
        // }
        System.out.println("Reversed string: " + reversedStr);
    }
}
