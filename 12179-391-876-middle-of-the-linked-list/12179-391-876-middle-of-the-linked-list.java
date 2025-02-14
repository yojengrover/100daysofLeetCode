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
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode end = head;
        int mid = 0;
        while(head.next != null){
            head = head.next;
            mid++;
        }

        int n = 0;
        if(mid%2 == 0){
           n = mid/2;
        }else{
            n = mid/2+1;
        }

        for(int i = 0; i<n; i++){
            end = end.next;
        }

        return end;
        
    }
}