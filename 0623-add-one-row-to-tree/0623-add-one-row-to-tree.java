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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode newNode=null;
        if(depth==1){
            newNode=new TreeNode(val);
            newNode.left=root;
            return newNode;
        }
        dfs(root,1,depth,val);
        return root;
    }
    public void dfs(TreeNode root,int curr,int depth,int val){
        if(root==null){
            return;
        }
        if(curr==depth-1){
             TreeNode leftNode=new TreeNode(val);
            leftNode.left=root.left;
            root.left=leftNode;
             TreeNode rightNode=new TreeNode(val);
            rightNode.right=root.right;
            root.right=rightNode;
            return ;
        }
        dfs(root.left,curr+1,depth,val);
        dfs(root.right,curr+1,depth,val);
    }
}