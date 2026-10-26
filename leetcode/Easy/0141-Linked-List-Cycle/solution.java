// LeetCode Problem: Linked List Cycle
// Link: https://leetcode.com/problems/linked-list-cycle/
// Difficulty: Easy
// Language: java

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
            ListNode current=head;
            ListNode prev=head;
            while(current!=null && current.next!=null){
                prev =prev.next;
                current=current.next.next;
                if(current==prev){
                    return true;
                }
            }       
         return false;

    }
}