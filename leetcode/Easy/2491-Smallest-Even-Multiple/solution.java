// LeetCode Problem: Smallest Even Multiple
// Link: https://leetcode.com/problems/smallest-even-multiple/
// Difficulty: Easy
// Language: java

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                return n;
            } else {
                return n * 2;
            }
        }
        return -1;
    }
}