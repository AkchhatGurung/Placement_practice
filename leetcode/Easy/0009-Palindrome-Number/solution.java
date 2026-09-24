// LeetCode Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPalindrome(int x) {
        int og=x;
        int rev=0;
        if(x<0)
            return false;
        while(x!=0){
            int r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(rev==og)
            return true;
        else
            return false;
    }
}