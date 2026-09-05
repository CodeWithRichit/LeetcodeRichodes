/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr=head;
        while(curr!=null){
            if(curr.child==null)curr=curr.next;
            else{
                Node fwd=curr.next;
                Node c=flatten(curr.child);
                curr.child=null;
                c.prev=curr;
                curr.next=c;
                Node temp=c;
                while(temp.next!=null)temp=temp.next;
                if(fwd!=null)fwd.prev=temp;
                temp.next=fwd;
                curr=fwd;
            }

        }
        return head;
    }
}