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
    public ListNode partition(ListNode head, int x) {
        ListNode ds=new ListNode(-1);
        ListNode db=new ListNode(-2);
        ListNode s=ds;
        ListNode b=db;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                s.next=temp;
                s=temp;
            }
            else if(temp.val>=x){
                b.next=temp;
                b=temp;
            }
            temp=temp.next;
        }
        b.next=null;
        s.next=db.next;
        return ds.next;
    }
}