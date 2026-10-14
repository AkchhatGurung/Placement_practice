// LeetCode Problem: Reverse Words in a String III
// Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Difficulty: Easy
// Language: java

class Solution {
    public String reverseWords(String s) {
            String[] a=s.split(" ");
            String result="";
            for(int i=0;i<a.length;i++){
                for(int j=a[i].length()-1;j>=0;j--){
                        result+=a[i].charAt(j);
                    }
                result=result+" ";
                }
                return result.trim();
        }           
}
