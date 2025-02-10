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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }else{
        ListNode list = new ListNode(head.val);
        while(head != null && head.next != null){
            ListNode node = new ListNode(head.next.val);
            node.next = list;
            list = node;
            head = head.next; 
        
        }
        return list;
        }
    }
}