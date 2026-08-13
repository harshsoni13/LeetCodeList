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
    private int answer;
    public  void maxDepthHelp(TreeNode node,int depth){
        if(node==null){
            return;
        }
        answer=Math.max(answer,depth);
        maxDepthHelp(node.left,depth+1);
        maxDepthHelp(node.right,depth+1);

    }
    public int maxDepth(TreeNode root) {
        answer=0;
        if(root==null){
            return 0;
        }
        maxDepthHelp(root,1);
        return answer;
    }
}