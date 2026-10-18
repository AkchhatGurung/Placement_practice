// LeetCode Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int org=x;
        int rev=0;
        while(x!=0){
            int r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(rev!=org){
            return false;
        }
        return true;
    }
}