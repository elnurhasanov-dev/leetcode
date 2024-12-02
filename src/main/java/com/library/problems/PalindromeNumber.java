package com.library.problems;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean test = isPalindrome(-123);

        System.out.println(test);
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String original = String.valueOf(x);

        String reversed = new StringBuffer(original).reverse().toString();

        return original.equals(reversed);
    }
}
