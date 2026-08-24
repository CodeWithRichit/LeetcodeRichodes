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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode f=head;
        for(int i=1;i<k;i++){
           f=f.next;
        }
        ListNode h=head;
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int temp=f.val;
        f.val=slow.val;
        slow.val=temp;
        return h;
    }
}