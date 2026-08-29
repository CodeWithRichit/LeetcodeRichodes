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
    public ListNode swapPairs(ListNode head) {
     if(head==null)return null;
     if(head.next==null)return head;
      ListNode c=head;
      ListNode f=null;
      ListNode p=null;
      ListNode newHead = head.next;
      while(c!=null && c.next!=null){
        f=c.next;
        c.next=f.next;
        f.next=c;
        if(p!=null){p.next=f;}
        p=c;
        c=c.next;
      }
      return newHead;
        // if(head==null)return null;
        // if(head.next==null)return head;
        // ArrayList<ListNode> arr=new ArrayList<>();
        // ListNode t=head;
        // while(t!=null){
        //    arr.add(t);
        //    t=t.next;
        // }
        // for(int i=0;i<arr.size()-1;i=i+2){
        //     ListNode temp = arr.get(i);
        //     arr.set(i, arr.get(i + 1));
        //     arr.set(i + 1, temp);
        // }
        // for(int i=0;i<arr.size()-1;i++){
        //     arr.get(i).next=arr.get(i+1);
        // }
        // arr.get(arr.size()-1).next=null;
        // return arr.get(0);
    }
}