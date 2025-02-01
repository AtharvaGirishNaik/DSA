import java.util.AbstractMap.SimpleEntry;

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> l = new ArrayList<>();
        if(root == null){
            return l;
        }
        Queue<SimpleEntry<Node , Integer>> q = new LinkedList<>();
        Map<Integer , Integer> mpp = new TreeMap<>();
        
        q.add(new SimpleEntry<>(root , 0));
        
        while(! q.isEmpty()){
            SimpleEntry<Node , Integer> p = q.poll();
            
            Node key = p.getKey();
            int val = p.getValue();
            
            if(! mpp.containsKey(val)){
                mpp.put(val , key.data);
            }
            
            if(key.left != null){
                q.add(new SimpleEntry<>(key.left , val - 1));
            }
            
            if(key.right != null){
                q.add(new SimpleEntry<>(key.right , val + 1));
            }
        }
        
        for(int val : mpp.values()){
            l.add(val);
        }
        return l;
    }
}
