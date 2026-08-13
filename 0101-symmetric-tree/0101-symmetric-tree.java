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
    public boolean solve(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        if(node1.val!=node2.val){
            return false;
        }
        boolean result1=solve(node1.left,node2.right);
        if(result1==false){
            return false;
        }
          boolean result2=solve(node1.right,node2.left);
        if(result2==false){
            return false;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        boolean res=solve(root,root);
        return res;
    }
}