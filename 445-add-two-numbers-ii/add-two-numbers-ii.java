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
        ListNode c=l1;
        ListNode p=null;
        ListNode f=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        ListNode c1=l2;
        ListNode p1=null;
        ListNode f1=null;
        while(c1!=null){
            f1=c1.next;
            c1.next=p1;
            p1=c1;
            c1=f1;
        }
        ListNode h1=p;
        ListNode h2=p1;
        ListNode d=new ListNode(-1);
        ListNode t=d;
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
          if(h1!=null){h1=h1.next;}
          if(h2!=null){h2=h2.next;}
          }
          if(carry!=0){
            t.next=new ListNode(carry);
          }
          d=d.next;
          ListNode c3=d;
          ListNode f3=null;
          ListNode p3=null;
          while(c3!=null){
            f3=c3.next;
            c3.next=p3;
            p3=c3;
            c3=f3;
          }
        return p3;
        }
        
    }
