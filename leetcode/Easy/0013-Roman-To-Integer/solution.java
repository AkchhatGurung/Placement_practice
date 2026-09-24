// LeetCode Problem: Roman to Integer
// Link: https://leetcode.com/problems/roman-to-integer/
// Difficulty: Easy
// Language: java

class Solution {

    public int romanToInt(String s) {

        int num = 0, ans = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            if (i + 1 < s.length() && num < getValue(s.charAt(i + 1))) {
                ans -= num;
            } else {
                ans += num;
            }
        }

        return ans;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }

        return 0;
    }
}