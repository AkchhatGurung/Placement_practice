// LeetCode Problem: Reverse String
// Link: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Language: java

class Solution {
    public void reverseString(char[] s) {
            int count=0;
            for(int i=s.length-1;i>=s.length/2;i--){
                char temp=s[i];
                s[i]=s[count];
                s[count]=temp;
                count++;
            }
    }
    
}