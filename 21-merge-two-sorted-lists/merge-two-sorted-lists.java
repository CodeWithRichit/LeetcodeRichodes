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
        ListNode d=new ListNode(-1);
        ListNode  t=d;
        ListNode h1=list1;
        ListNode h2=list2;
        if(h1==null)return h2;
        else if(h2==null)return h1;
        while(h1!=null && h2!=null){
            if(h1!=null && h2!=null && h1.val>=h2.val){
                t.next=h2;
                t=h2;
                h2=h2.next;
            }
            else if(h1!=null && h2!=null && h2.val>h1.val){
                t.next=h1;
                t=h1;
                h1=h1.next;
            }
        }
        while(h1!=null){
            t.next=h1;
            t=h1;
            h1=h1.next;
        }
        while(h2!=null){
            t.next=h2;
            t=h2;
            h2=h2.next;
        }
        return d.next;
    }
}