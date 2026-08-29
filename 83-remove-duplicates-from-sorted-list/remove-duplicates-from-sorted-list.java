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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dum=new ListNode(-1);
        ListNode d=dum;
        ListNode i=head;
        while(i!=null && i.next!=null){
            d.next=i;
            d=i;
            while(i.next!=null && i.val==i.next.val){
                i=i.next;
            }
            i=i.next;
        }
        d.next=i;
        return dum.next;
    }
}