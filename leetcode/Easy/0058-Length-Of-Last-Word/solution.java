// LeetCode Problem: Length of Last Word
// Link: https://leetcode.com/problems/length-of-last-word/
// Difficulty: Easy
// Language: java

class Solution {
    public int lengthOfLastWord(String s) {
            String[] sp=s.split(" ");
            int last=sp.length-1;
            int len=sp[last].length();
            return len;
    }
}