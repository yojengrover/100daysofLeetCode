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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }else{
        ListNode c = head;
        int count = 1;
        while(c.next != null){
            c = c.next;
            count++;
        }
        if(count == 1 && n == 1){
            head = null;
        }

        else if(count>1 && n == 1){
            ListNode d = head;
        
            while(d.next.next != null){
            d = d.next;
            }
            d.next = null; 
        }else if(count>1 && n == count){
            head = head.next;
        }

        else{
         
        ListNode tail = head;
       
        for(int i =0; i<(count - n - 1); i++){
            tail = tail.next;
        }
       
        tail.next = tail.next.next;
        }
        return head;
        }
    }
        
}
