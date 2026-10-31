// LeetCode Problem: Intersection of Two Linked Lists
// Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
// Difficulty: Easy
// Language: java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA=headA;
        ListNode pB=headB;

        while(pA!=pB){
            if(pA==null){
                pA=headA;
            }
            else{
                pA=pA.next;
            }
            if(pB==null){
                pB=headB;
            }
            else{
                pB=pB.next;
            }
        }
        return pA;
    }
}