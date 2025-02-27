/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> Integer.compare(a.val, b.val));

       
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

       
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        
        while (!pq.isEmpty()) {
            
            ListNode smallestNode = pq.poll();
            current.next = smallestNode;
            current = current.next;

            if (smallestNode.next != null) {
                pq.add(smallestNode.next);
            }
        }

        return dummyHead.next;

    }
}