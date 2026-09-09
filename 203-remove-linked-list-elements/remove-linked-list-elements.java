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
    public ListNode removeElements(ListNode head, int val) {
        
        // return dummy.next;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        dummy.next=head;
        ListNode temp=head;
        rv(temp,t,val);
        // while(temp!=null){
        //     if(temp.val!=val){
        //         t.next=temp;
        //         t=temp;
        //     }
        //     temp=temp.next;
        // }
        // t.next=null;
        return dummy.next;
    }
    public void rv(ListNode temp,ListNode t,int val){
        if(temp==null){t.next=null;
        return;}
        if(temp.val==val){
         rv(temp.next,t,val);
         return;
        }
        t.next=temp;
        t=temp;
        rv(temp.next,t,val);
    }
}