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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h2=slow.next;
        slow.next=null;
        ListNode p=null;
        ListNode c=h2;
        ListNode f=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        ListNode i=head;
        ListNode j=p;
        int ms=Integer.MIN_VALUE;
        while(i!=null){
            if(i.val+j.val>=ms){
                ms=i.val+j.val;
            }
            i=i.next;
            j=j.next;
        }
        return ms;
    }
}