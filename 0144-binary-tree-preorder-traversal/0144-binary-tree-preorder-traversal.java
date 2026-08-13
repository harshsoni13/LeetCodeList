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
    public static void preOrderHelp(TreeNode node,List<Integer> out){
        if(node==null){
            return ;
        }
        out.add(node.val);
        preOrderHelp(node.left,out);
        preOrderHelp(node.right,out);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> out=new ArrayList<>();
       if(root==null){
        return out;
       }
       preOrderHelp(root,out);
       return out;}}