/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int La=1;
        int Lb=1;
        ListNode ta=headA;
        ListNode tb=headB;
        while(ta!=null){
            La++;
            ta=ta.next;
        }
        while(tb!=null){
            Lb++;
            tb=tb.next;
        }
        int diff=Math.abs(La-Lb);
        ListNode tema=headA;
        ListNode temb=headB;
        if(La>Lb){
           for(int i=0;i<diff;i++){
            tema=tema.next;
           }
        }
        else if(Lb>La){
            for(int i=0;i<diff;i++){
            temb=temb.next;
           }
        }
        while(temb!=null && temb!=tema){
            tema=tema.next;
            temb=temb.next;
        }
        return temb;
    }
}