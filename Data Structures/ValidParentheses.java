// Write a function that takes a string of parentheses as input and determines if the parentheses are valid. 
// The function should return true if the parentheses are valid and false otherwise.
//  Valid parentheses must be properly closed and opened in the correct order.

// For example:

// () is valid
// ()[]{} is valid
// ([{}]) is valid
// ([)] is not valid
// ]([)] is not valid

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String s1 = "()"; // Valid
        String s2 = "()[]{}"; // Valid
        String s3 = "([{}])"; // Valid
        String s4 = "([)]"; // Not valid
        String s5 = "][(]"; // Not valid

        System.out.println(s1 + " is valid: " + vp.isValid(s1));
        System.out.println(s2 + " is valid: " + vp.isValid(s2));
        System.out.println(s3 + " is valid: " + vp.isValid(s3));
        System.out.println(s4 + " is valid: " + vp.isValid(s4));
        System.out.println(s5 + " is valid: " + vp.isValid(s5));
    }
}