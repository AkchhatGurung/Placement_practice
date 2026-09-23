// LeetCode Problem: Pow(x, n)
// Link: https://leetcode.com/problems/powx-n/
// Difficulty: Medium
// Language: java

class Solution {
    public double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double res = 1;

        while (power > 0) {

            if (power % 2 == 1) {
                res = res * x;
            }

            x = x * x;
            power = power / 2;
        }

        return res;
    }
}