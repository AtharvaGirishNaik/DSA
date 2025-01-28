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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return help(p , q);
    }
    private boolean help(TreeNode a , TreeNode b){
        if(a == null && b == null)
            return true;

        if(a == null || b == null || a.val != b.val){
             return false;
        }
       

        return  help(a.right , b.right) && help(a.left , b.left);
    }
}
