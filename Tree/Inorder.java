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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        this.inor(root , l);
        return l;  
    }
     public void inor(TreeNode rt , List<Integer> l){
         if(rt == null){
            return;            
        }else{
            inor(rt.left,l);
            l.add(rt.val);
            inor(rt.right,l);
        }
     }
}
