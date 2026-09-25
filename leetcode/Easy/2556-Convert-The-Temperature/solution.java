// LeetCode Problem: Convert the Temperature
// Link: https://leetcode.com/problems/convert-the-temperature/
// Difficulty: Easy
// Language: java

class Solution {
    public double[] convertTemperature(double celsius) {
            return new double[] { celsius + 273.15, (celsius * 1.80) + 32.00};
    }
}