class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        postor(root , l);
        return l;
    }
    private void postor(TreeNode rt , List<Integer> l){
        if(rt == null)
            return;
        postor(rt.left , l);
        postor(rt.right , l);
        l.add(rt.val);
    }
}
