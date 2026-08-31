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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        int pos=0;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int[] crits=new int[arr.size()];
        for(int i=1;i<arr.size()-1;i++){
            if((arr.get(i)<arr.get(i+1) && arr.get(i)<arr.get(i-1))||(arr.get(i)>arr.get(i+1) && arr.get(i)>arr.get(i-1))){
                crits[pos]=i;
                pos++;
            }
        }
        if(pos==0 || pos==1){
            return new int[]{-1,-1};
        }
        int maxdis=crits[pos-1]-crits[0];
        if(pos==2){
            return new int[]{maxdis,maxdis};
        }
        int mindis=Integer.MAX_VALUE;
        for(int i=0;i<pos-1;i++){
            mindis=Math.min(mindis,Math.abs(crits[i]-crits[i+1]));
        }
        return new int[]{mindis,maxdis};
    }
}