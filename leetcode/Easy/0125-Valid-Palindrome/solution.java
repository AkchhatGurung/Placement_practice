// LeetCode Problem: Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// Language: java

class Solution {

    public boolean isPalindrome(String s) {

        String clean = "";

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetterOrDigit(s.charAt(i))) {
                clean = clean + Character.toLowerCase(s.charAt(i));
            }
        }

        String rev = "";

        
        for (int i = clean.length() - 1; i >= 0; i--) {
            rev = rev + clean.charAt(i);
        }

        return rev.equals(clean);
    }
}