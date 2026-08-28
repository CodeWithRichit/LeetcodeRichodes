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
    public ListNode oddEvenList(ListNode head) {
        int l=1;
        ListNode odd=new ListNode(-1);
        ListNode eve=new ListNode(-2);
        ListNode o=odd;
        ListNode e=eve;
        ListNode temp=head;
        while(temp!=null){
            if(l%2!=0){
                o.next=temp;
                o=temp;
            }
            else if(l%2==0){
                e.next=temp;
                e=temp;
            }
            l++;
            temp=temp.next;
        }
        e.next=null;
        o.next=eve.next;
        return odd.next;
    }
}