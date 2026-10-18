/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        pre(arr,root);
        return arr;
    }
    public void pre(ArrayList<Integer> arr,TreeNode root){
       if(root==null)return;
       arr.add(root.val);
       pre(arr,root.left);
       pre(arr,root.right);
    }
}