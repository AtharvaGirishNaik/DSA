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
    public int diameterOfBinaryTree(TreeNode root) {
        int [] diameter = new int [1]; 
        help(root , diameter);
        return diameter[0];
    }
    private int help(TreeNode rt , int diameter[]){
        if(rt == null) return 0;
        int x = help(rt.left , diameter);
        int y = help(rt.right, diameter);
        diameter[0] = Math.max(diameter[0] , x + y);
        return 1 + Math.max(x , y);
    }
}
