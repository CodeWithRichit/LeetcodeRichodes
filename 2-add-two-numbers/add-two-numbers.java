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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode(-1);
        ListNode t=dum;
        ListNode h1=l1;
        ListNode h2=l2;
        int carry=0;
        while(h1!=null || h2!=null){
          int a=0;
          int b=0;
          if(h1!=null){a=h1.val;}
          if(h2!=null){b=h2.val;}
          int s=a+b+carry;
          int digit=s%10;
          carry=s/10;
          ListNode v=new ListNode(digit);
          t.next=v;
          t=v;
          if(h1!=null){
            h1=h1.next;
          }
          if(h2!=null){
            h2=h2.next;
          }
        }
        if(carry!=0){
            t.next=new ListNode(carry);
        }
        return dum.next;
    }
}