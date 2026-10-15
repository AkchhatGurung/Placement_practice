// LeetCode Problem: Repeated Substring Pattern
// Link: https://leetcode.com/problems/repeated-substring-pattern/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean repeatedSubstringPattern(String s) {
            int n=s.length();
            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                   String sub=s.substring(0,i);
                   String res="";
                   while(res.length()<n){
                        res+=sub;
                   }
                   if(res.equals(s)){
                    return true;
                   }
                }    
            }
            return false;
    }
}