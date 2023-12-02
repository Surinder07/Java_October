package assignment.solution;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String testString = "{[()]}";

        if (isValid(testString)) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is not valid.");
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
