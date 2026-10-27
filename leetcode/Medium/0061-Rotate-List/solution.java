// LeetCode Problem: Rotate List
// Link: https://leetcode.com/problems/rotate-list/
// Difficulty: Medium
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;    
        }
        ListNode temp=head;
        int length=1;

        while(temp.next!=null){
            temp=temp.next;
            length++;
        }

        k=k%length;
        if(k==0){
            return head;
        }
        temp.next=head;

        int steps=length-k;
        ListNode newLast=head;

        for(int i=1;i<steps;i++){
            newLast=newLast.next;
        }

        ListNode newHead=newLast.next;
        newLast.next=null;

        return newHead;

    }
}