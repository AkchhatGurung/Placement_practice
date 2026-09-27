// LeetCode Problem: Number of Steps to Reduce a Number to Zero
// Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
// Difficulty: Easy
// Language: java

class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        while(num!=0){
            if(num%2==0)
                num=num/2;
            else
                num=num-1;
            step++;
        }
        return step;
    }
}