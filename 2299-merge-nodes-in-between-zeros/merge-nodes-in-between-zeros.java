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
    public ListNode mergeNodes(ListNode head) {
        ListNode i = head;
        ListNode j = head.next;
        ListNode  dum = new ListNode(-1);
        ListNode t=dum;

        while(j != null) {

            int sum = 0;

            while(j != null && j.val != 0) {
                sum += j.val;
                j = j.next;
            }

            ListNode l = new ListNode(sum);
            t.next = l;
            t = l;

            if(j == null) break;

            i = j;
            j = j.next;
        }
        t.next=null;
        return dum.next;
    }
}