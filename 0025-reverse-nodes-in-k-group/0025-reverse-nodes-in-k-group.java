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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev =dummy;
        //find k Node
        while(true){
            ListNode kth = groupPrev;
            for(int i = 0;i<k;i++){
                kth = kth.next;
                if(kth == null) return dummy.next;
            }
            ListNode groupNext = kth.next;
        //reverse k node
        ListNode prev = groupNext;
        ListNode curr = groupPrev.next;

        while(curr != groupNext){
            ListNode temp =curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        //move group
        ListNode oldGroupStart = groupPrev.next;
        groupPrev.next = kth;
        groupPrev = oldGroupStart;

        }
    }
}