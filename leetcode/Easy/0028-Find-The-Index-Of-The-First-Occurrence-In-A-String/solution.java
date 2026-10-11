// LeetCode Problem: Find the Index of the First Occurrence in a String
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int strStr(String haystack, String needle) {
         
            for(int i=0;i<=haystack.length()-needle.length();i++){
                if(haystack.substring(i,i+needle.length()).equals(needle))
                    return i;
            }
            return -1;
            

    }
}