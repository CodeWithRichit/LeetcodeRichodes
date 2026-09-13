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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode t=head;
        while(t!=null){
            if(st.size()==0 || st.peek()>=t.val){
               st.push(t.val);
            }
            else if(st.peek()<t.val){
                while(st.size()>0 &&st.peek()<t.val){
                    st.pop();

                }
                st.push(t.val);
            }
            t=t.next;
        }
        ListNode te = null;

        while (st.size() != 0) {
        ListNode s = new ListNode(st.pop());
        s.next = te;
        te = s;
        }
        return te;
        // ListNode i=head;
        // ListNode dummy=new ListNode(-1);
        // ListNode temp=dummy;
        // while(i!=null){
        //     ListNode j=i.next;
        //     int v=1;
        //     while(j!=null){
        //         if(i.val<j.val){
        //             v=0;
        //             break;
        //         }
        //         else{j=j.next;}
        //     }
        //     if(v==1){
        //         temp.next=i;
        //         temp=i;
        //     }
        //     i=i.next;
        // }
        // return dummy.next;
    }
}