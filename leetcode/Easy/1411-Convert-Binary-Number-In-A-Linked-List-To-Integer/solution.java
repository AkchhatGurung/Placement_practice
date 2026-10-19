// LeetCode Problem: Convert Binary Number in a Linked List to Integer
// Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
// Difficulty: Easy
// Language: java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode current=head;
        int sum=0;
        while(current!=null){
            sum=sum*2+current.val;
            current=current.next;
        }
        return sum;
    }
}