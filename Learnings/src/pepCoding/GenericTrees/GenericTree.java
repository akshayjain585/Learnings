package pepCoding.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {
	
	private static class Node {
		int data;
		ArrayList<Node> child = new ArrayList<>();
	}
	
	//Display of a generic tree
	public static void displayGenericTree(Node root) {
		String s = root.data + " -> ";
		
		for(Node child : root.child) {
			s = s + child.data + " , ";
		}
		s = s + ".";
		System.out.println(s);
		
		for(Node child : root.child) {
			displayGenericTree(child);
		}
	}
	
	// Size of generic tree
	public static int size(Node root) {
		int size = 0;
		for(Node child : root.child) {
			int childSize = size(child);
			size = size + childSize; 
		}
		size = size + 1;
		return size;
		
	}
	
	public static void main(String[] args) {
		
		int[] list = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		
		Stack<Node> st = new Stack<>();
		Node root = null;
		for(int i=0; i<list.length; i++) {
			if(list[i] == -1) {
				st.pop();
			}else {
				Node newNode = new Node();
				newNode.data = list[i];
				if(st.size() > 0) {
					st.peek().child.add(newNode);
				}else {
					root = newNode;
				}
				st.push(newNode);
			}
		}
		
		displayGenericTree(root);
		System.out.println(size(root));
		
		
		
		
	}
}
