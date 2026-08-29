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
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int i=left-1;
        int j=right-1;
        while(i<=j){
            ListNode a=arr.get(i);
            ListNode b=arr.get(j);
            ListNode t=a;
            arr.set(i,b);
            arr.set(j,t);
            i++;
            j--;
        }
        for(i=0;i<arr.size();i++){
            if(i==arr.size()-1){
                arr.get(i).next=null;
            }
            else{
            arr.get(i).next=arr.get(i+1);}
        }
        return arr.get(0);
    }
}