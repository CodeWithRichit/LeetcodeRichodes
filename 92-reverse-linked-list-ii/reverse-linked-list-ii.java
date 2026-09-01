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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        dummy.next=head;
        for(int i=1;i<left;i++){
            t=t.next;
        }
        ListNode c=t.next;
        ListNode h1=c;
        ListNode temp=t.next;
        t.next=null;
        ListNode p=null;
        ListNode f=null;
        for(int i=left;i<right;i++){
            temp=temp.next;
        }
        ListNode h2=temp.next;
        temp.next=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        t.next=p;
        h1.next=h2;
        return dummy.next;
        // ArrayList<ListNode> arr=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     arr.add(temp);
        //     temp=temp.next;
        // }
        // int i=left-1;
        // int j=right-1;
        // while(i<=j){
        //     ListNode a=arr.get(i);
        //     ListNode b=arr.get(j);
        //     ListNode t=a;
        //     arr.set(i,b);
        //     arr.set(j,t);
        //     i++;
        //     j--;
        // }
        // for(i=0;i<arr.size();i++){
        //     if(i==arr.size()-1){
        //         arr.get(i).next=null;
        //     }
        //     else{
        //     arr.get(i).next=arr.get(i+1);}
        // }
        // return arr.get(0);
    }
}