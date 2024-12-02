package com.library.problems;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean test = isPalindrome(-123);
        boolean test2 = isPalindrome2(121);

        System.out.println(test);
        System.out.println(test2);
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String original = String.valueOf(x);

        String reversed = new StringBuffer(original).reverse().toString();

        return original.equals(reversed);
    }

    private static boolean isPalindrome2(int x) {
        if (x < 0) return false;

        String original = String.valueOf(x);
        int size = original.length() / 2;

        for (int i = 0; i < size; i++) {
            if (original.charAt(i) != original.charAt(original.length() - 1 - i)) return false;
        }
        return true;
    }
}
