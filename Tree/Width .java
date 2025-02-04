class Solution {
    class Pair{
        TreeNode node;
        int data;

        Pair(TreeNode t , int i){
            node = t;
            data = i;
        } 
    }
    private int diameter = 0;
    public int widthOfBinaryTree(TreeNode root) {
        int maxW = 0;
        if(root == null)
            return maxW;
        
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root , 0));

        while(! q.isEmpty()){
            int size = q.size();
            int leftMost = q.peek().data;
            int rightMost = leftMost;

            for(int i = 0 ; i < size ; i++){
                Pair p = q.poll();
                TreeNode node = p.node;
                int index = p.data;

                rightMost = index;

                if(node.left != null){
                    q.offer(new Pair(node.left , index * 2));
                } 
                if(node.right != null){
                    q.offer(new Pair
                    (node.right , index * 2 + 1));
                }
            }
            maxW = Math.max(maxW , rightMost - leftMost + 1);
        }
        return maxW;
    }
}
