class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        return help(root.left , root.right); 
    }
    private boolean help(TreeNode r1 , TreeNode r2){
        if(r1 == null || r2 == null){
            return r1 == r2;
        }
        return (r1.val == r2.val) && help(r1.left , r2.right) && help(r1.right , r2.left);
    }
}
