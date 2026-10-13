// LeetCode Problem: Find Numbers with Even Number of Digits
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int findNumbers(int[] nums) {
        int digit=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]>0){
                count++;
                nums[i]=nums[i]/10;
            }
            if(count%2==0){
                digit++;
            }
        }
        return digit;

    }
}