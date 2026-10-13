// LeetCode Problem: Reverse String
// Link: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Language: java

class Solution {
    public void reverseString(char[] s) {
        int first=0;
        int last=s.length-1;
        while(first<last){
            char temp=s[first];
            s[first]=s[last];
            s[last]=temp;

            first++;
            last--;
            if(first==last)
                break;
        }
    }
}