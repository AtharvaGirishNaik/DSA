class Solution {
    public int maxDepth(TreeNode root) {
        return help(root);
    }
    private int help(TreeNode root){
        if(root == null) 
            return 0;
       int l = help(root.left);
       int r = help(root.right);
       return 1 + Math.max(l , r); 
    }
}
