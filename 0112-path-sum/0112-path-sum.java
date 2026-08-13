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
    private boolean result;
    public void solve(TreeNode node,int sum,int target){
        if(node==null){
            return;
        }
        if(result){
            return;
        }
        sum=sum+node.val;
        if(node.left==null && node.right==null){
            if(sum==target){
                result=true;
            }
            return ;
        }
        solve(node.left,sum,target);
        solve(node.right,sum,target);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        result=false;
        if(root==null){
            return result;
        }
        solve(root,0,targetSum);
        return result;
        
    }
}