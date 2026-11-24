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
    public int countnode(TreeNode root){
        if(root==null) return 0;
        return 1+countnode(root.left)+countnode(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        int leftcnt=countnode(root.left);
        if(k==leftcnt+1) return root.val;
        if(k<=leftcnt){
            return kthSmallest(root.left,k);
        }
        return kthSmallest(root.right,k-leftcnt-1);
    }
}