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
        List<Integer> l = new ArrayList<>();
        this.preor(root , l);
        return l;
    }
    private void preor(TreeNode rt , List<Integer> l){
        if(rt == null){
            return;
        }
        l.add(rt.val);
        preor(rt.left , l);
        preor(rt.right , l);
    }
}
