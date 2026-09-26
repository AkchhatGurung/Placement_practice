// LeetCode Problem: Subtract the Product and Sum of Digits of an Integer
// Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Difficulty: Easy
// Language: java

class Solution {
    public int subtractProductAndSum(int n) {
            int pd=1,sd=0,ans,digit;
            while(n!=0){
                digit=n%10;
                pd=pd*digit;
                sd=sd+digit;
                n=n/10;
            }
            ans=pd-sd;
            return ans;
    }
}