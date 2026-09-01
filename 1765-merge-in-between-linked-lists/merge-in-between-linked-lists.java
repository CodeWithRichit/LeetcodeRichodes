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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t=list1;
        ListNode temp1=list1;
        for(int i=0;i<a;i++){
            t=temp1;
            temp1=temp1.next;
        }
        for(int i=a;i<b;i++){
            temp1=temp1.next;
        }
        ListNode h1=temp1.next;
        ListNode temp2=list2;
        while(temp2!=null){
            t.next=temp2;
            t=temp2;
            temp2=temp2.next;
        }
        t.next = h1;
        return list1;
    }
}