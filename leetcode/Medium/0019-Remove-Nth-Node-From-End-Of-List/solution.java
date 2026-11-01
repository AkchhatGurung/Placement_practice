// LeetCode Problem: Remove Nth Node From End of List
// Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Difficulty: Medium
// Language: java

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode current = head;

        while(current != null) {
            count++;
            current = current.next;
        }

    
        if(count == n) {
            return head.next;
        }

        current = head;

        for(int i = 1; i < count - n; i++) {
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }
}