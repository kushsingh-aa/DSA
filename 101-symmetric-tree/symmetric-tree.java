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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode leftSide,TreeNode rightSide){
        if(leftSide==null && rightSide==null) return true;
        if(leftSide==null || rightSide==null) return false;
        return (leftSide.val==rightSide.val) && isMirror(rightSide.right,leftSide.left) && isMirror(rightSide.left,leftSide.right);
    }
}