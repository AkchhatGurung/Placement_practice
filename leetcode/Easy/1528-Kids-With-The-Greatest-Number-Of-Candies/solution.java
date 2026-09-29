// LeetCode Problem: Kids With the Greatest Number of Candies
// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest=0;
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>greatest)
                greatest=candies[i];                
        }
        for(int i=0;i<candies.length;i++){
            candies[i]+=extraCandies;
            if(candies[i]>=greatest)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}