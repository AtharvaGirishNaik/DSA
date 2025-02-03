class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
       
        help(l , new ArrayList<Integer>() , root);
        return l;
    }
    
    private static void help(ArrayList<ArrayList<Integer>> l, ArrayList<Integer> curr , Node root){
        if(root == null){
            return ;
        }
        curr.add(root.data);
        
        if(root.left == null && root.right == null){
            l.add(new ArrayList<>(curr));
            // Issue Explanation
            // When you add curr to l: 
            // l.add(curr); 
            // You're not adding a new list, but rather a reference to curr. So when curr changes due to backtracking, the paths in l also change incorrectly.
            // ✅ Solution: Add a New Copy
        }
        else{
            help(l , curr , root.left);
            help(l , curr , root.right);
            
        }
        curr.remove(curr.size() - 1);
    }
}
