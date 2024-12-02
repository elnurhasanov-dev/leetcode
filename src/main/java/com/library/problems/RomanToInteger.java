package com.library.problems;

public class RomanToInteger {
    public static void main(String[] args) {
        int test1 = romanToInt("LVIII");
        int test2 = romanToInt("MCMXCIV");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static int romanToInt(String s) {
        java.util.Map<Character, Integer> romanToInt = new java.util.HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int total = 0;
        int helper = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanToInt.get(s.charAt(i));

            total += (currentValue < helper) ? -currentValue : currentValue;

            helper = currentValue;
        }

        return total;
    }
}
