import java.util.*;
/*
	
	Following the structure used for Binary Tree
	
	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */

public class Solution {

	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		List<Integer> l = new ArrayList<>();
		if(root == null){
			return;
		}
		Stack<BinaryTreeNode> s = new Stack<>();
		s.push(root);
	    while(! s.empty()){

			root = s.pop();
			l.add(root.data);

			if(root.right != null){
				s.push(root.right);
			}
			if(root.left != null){
				s.push(root.left);
			}
		} 

		for(int i : l){
			System.out.print(i+" ");
		}
	}

}
