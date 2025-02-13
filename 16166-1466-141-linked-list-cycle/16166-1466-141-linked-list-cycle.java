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
        if(head == null){
            return false;
        }
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = slow;
         while(fast.next != null && fast.next.next != null){
         slow = slow.next;
         fast = fast.next.next; 
         if (slow == fast) { 
            return true;
         }

         }

         return false;
    }
}