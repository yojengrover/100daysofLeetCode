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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode headp = head;
        if (list1 == null){
            return list2;
        } else if(list2 == null){
            return list1;
        }
        else{
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                head.val = list1.val;
                //System.out.println(head.val);
                list1 = list1.next;
            }else {
                head.val = list2.val;
                list2 = list2.next;
                //System.out.println(head.val);
            }
            if(list1 != null && list2 != null){
            ListNode node = new ListNode(); 
            // System.out.println(head.val);
            head.next = node;
            head = head.next;
            }
        }

        if(list1 == null ){
            head.next = list2;
           // System.out.println(list2.val + " last");
            return headp;
        }else {
            head.next = list1;
            //System.out.println(list1.val + " last");
            return headp;
        
        }
        }

        // return headp;


    }
}