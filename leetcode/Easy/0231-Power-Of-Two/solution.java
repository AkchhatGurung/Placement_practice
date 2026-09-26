// LeetCode Problem: Power of Two
// Link: https://leetcode.com/problems/power-of-two/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}