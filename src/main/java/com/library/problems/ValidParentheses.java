package com.library.problems;

public class ValidParentheses {
    public static void main(String[] args) {
        boolean test1 = isValid("()()");

        System.out.println(test1);
    }

    private static boolean isValid(String s) {

        StringBuilder parentheses = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                parentheses.append(c);
            else {
                if (parentheses.length() == 0) return false;
                char last = parentheses.charAt(parentheses.length() - 1);


                if ((c == ')' && last == '(') ||
                        (c == '}' && last == '{') ||
                        (c == ']' && last == '[')) {

                    parentheses.deleteCharAt(parentheses.length() - 1); // Remove last character
                } else {
                    return false; // Mismatched bracket
                }
            }
        }

            return parentheses.length() == 0;
    }
}
