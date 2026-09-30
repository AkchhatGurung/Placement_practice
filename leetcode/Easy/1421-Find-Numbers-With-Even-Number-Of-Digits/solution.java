// LeetCode Problem: Find Numbers with Even Number of Digits
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int count=0;
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            if(count%2==0)even++;
        }
        return even;
    }
}