import java.util.AbstractMap.SimpleEntry;
class Solution {
    
    // Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        
        Queue<SimpleEntry<Node, Integer>> q = new LinkedList<>();
        Map<Integer, Integer> mp = new TreeMap<>();
        
        q.add(new SimpleEntry<>(root, 0));  // Starting with the root node at horizontal distance 0
        
        while (!q.isEmpty()) {
            SimpleEntry<Node, Integer> p = q.poll();
            Node node = p.getKey();
            int num = p.getValue();  // Horizontal distance of the current node
            
            // Always update the map to store the latest value at that horizontal distance
            mp.put(num, node.data);
            
            // If left child exists, add it with horizontal distance - 1
            if (node.left != null) {
                q.add(new SimpleEntry<>(node.left, num - 1));
            }
            
            // If right child exists, add it with horizontal distance + 1
            if (node.right != null) {
                q.add(new SimpleEntry<>(node.right, num + 1));
            }
        }
        
        // Add all values in map to the result list, values are automatically ordered by horizontal distance
        for (int x : mp.values()) {
            l.add(x);
        }
        
        return l;
    }
}
        
