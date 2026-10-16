// LeetCode Problem: Final Value of Variable After Performing Operations
// Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
// Difficulty: Easy
// Language: java

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")||operations[i].equals("X--")){
                x--;
                System.out.println(x);
            }
           else if(operations[i].equals("X++")||operations[i].equals("++X")){
                x++;
                System.out.println(x);
           }
        
        
        }
        return x;
    }
}