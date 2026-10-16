// LeetCode Problem: Subtract the Product and Sum of Digits of an Integer
// Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Difficulty: Easy
// Language: java

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,digit,prod=1,result;
        while(n!=0){
            digit=n%10;
            sum+=digit;
            prod*=digit;
            n=n/10;
        }
        result=prod-sum;
        return result;
    }
}