// LeetCode Problem: Reverse Integer
// Link: https://leetcode.com/problems/reverse-integer/
// Difficulty: Medium
// Language: java

class Solution {
    public int reverse(int x) {
        int rev=0,r;
        while(x!=0){
            r=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10||rev==Integer.MAX_VALUE/10 && r>7){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10||rev==Integer.MIN_VALUE/10&& r<-8){
                return 0;
            }
           rev=rev*10+r;
        }
        return rev;
    }
}