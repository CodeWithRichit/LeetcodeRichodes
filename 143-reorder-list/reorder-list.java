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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h2=slow.next;
        slow.next=null;
        ListNode c=h2;
        ListNode p=null;
        ListNode f=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        ListNode i=head;
        ListNode j=p;
        while(i!=null && j!=null){
           ListNode n1=i.next;
           ListNode n2=j.next;
           i.next=j;
           j.next=n1;
           i=n1;
           j=n2;
        }
    }
}