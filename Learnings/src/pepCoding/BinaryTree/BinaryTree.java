package pepCoding.BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	static Node root;

	private static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	// Size of Binary Tree
	public static int size(Node root) {
		if(root == null) {
			return 0;
		}
		int leftNodesSize = size(root.left);
		int rightNodesSize = size(root.right);
		int size = leftNodesSize + rightNodesSize + 1;	// Added + 1 for root node.
		return size;		
	}

	// Sum of all node's data in Binary Tree
	public static int sum(Node root) {
		if(root == null) {
			return 0;
		}
		int leftNodesDataSum = sum(root.left);
		int rightNodesDataSum = sum(root.right);
		int sum = leftNodesDataSum + rightNodesDataSum + root.data;	// Instead of adding 1 for root, now added root's data.
		return sum;
	}

	// Max element of Binary Tree
	public static int max(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int leftNodesMaxData = max(root.left);
		int rightNodesMaxData = max(root.right);
		int max = Math.max(root.data, Math.max(leftNodesMaxData, rightNodesMaxData));	// Comparing root's data with whichever is greater between left and right node's data.
		return max;
	}

	// Height of Binary Tree calculated using node because return is 0 which will result in 1 in case of only root node is present
	public static int height(Node root) {
		if(root == null) {
			return 0;	// -1 for edges as only for a root node, the edges would be (-1 + 1=0) and for node, return 0 as for a root node, it would be (0 + 1= 1)
		}
		int leftNodeHeight = height(root.left);
		int rightNodeHeight = height(root.right);
		int height = Math.max(leftNodeHeight, rightNodeHeight) + 1;	// Whichever has greater height between left and right, + 1 for root.
		return height;
	}

	// PreOrder traversal : Root, Left, Right
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" , ");
		preOrder(root.left);
		preOrder(root.right);
	}

	// InOrder traversal : Left, Root, Right
	public static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" , ");
		inOrder(root.right);
	}

	// PostOrder traversal : Left, Right, Root
	public static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" , ");
	}

	// Level order traversal. Print nodes at each level from left to right. Done by queue as first element to insert will be printed first.
	// Approach is to add root node in queue and then remove,print and add left and right nodes.
	public static void levelOrderTraversal(Node root) {
		if(root == null) {
			return;
		}

		Queue<Node> q = new ArrayDeque<>();
		q.add(root);

		while(q.size() > 0) {
			int nodesCount = q.size();
			for(int i=0; i<nodesCount; i++) {
				root = q.remove();
				System.out.print(root.data+" ");

				if(root.left != null) {
					q.add(root.left);
				}

				if(root.right != null) {
					q.add(root.right);
				}
			}
			System.out.println();	// To print nextLine after each level
		}	
	}

	// Iterative PreOrder traversal. Completely same like level order. Instead we use stack inplace of Queue.
	// Ref : https://www.techiedelight.com/preorder-tree-traversal-iterative-recursive/
	public static void iterativePreOrder(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> st = new Stack<>();
		st.push(root);

		while(st.size() > 0) {
			root = st.pop();
			System.out.print(root.data+" , ");

			if(root.right != null) {	// Note that right child is pushed first so that left is processed first */
				st.push(root.right);
			}

			if(root.left != null) {
				st.push(root.left);
			}
		}
		System.out.println();
	}


	// Iterative InOrder traversal
	// Ref : https://www.techiedelight.com/inorder-tree-traversal-iterative-recursive/
	public static void iterativeInOrder(Node root) {
		Stack<Node> st = new Stack<>();

		Node current = root;

		while(st.size() > 0 || current!=null) {

			// Keep going till last of left node until its equal to null and pop and print once it reaches null and move to right
			if(current!=null) {
				st.push(current);
				current = current.left;
			}else {
				current = st.pop();
				System.out.print(current.data+" , ");
				current = current.right;
			}
		}
		System.out.println();
	}

	// Iterative PostOrder traversal
	// Ref : https://www.techiedelight.com/postorder-tree-traversal-iterative-recursive/
	public static void iterativePostOrder(Node root) {
		Stack<Node> stack = new Stack<>(); 
		while(true) { 
			while(root != null) { 
				stack.push(root); 
				stack.push(root); 
				root = root.left; 
			} 

			// Check for empty stack 
			if(stack.empty()) {
				return;
			}
			root = stack.pop(); 

			if(!stack.empty() && stack.peek() == root) {
				root = root.right;
			}   
			else { 

				System.out.print(root.data + " , "); 
				root = null; 
			}
		}
	}
	
	// Find a node and print the path from that node to root in Binary tree
	// Approach : Search for a root node, search in left node, in right node and if found print the path as well.
	public static boolean findNodeAndPath(Node root, int data){
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null) {
			return false;
		}
		
		if(root.data == data) {
			list.add(root.data);
			System.out.print(list+" , ");	// If element is found here then it will print the path as well till root node.
			return true;
		}
		
		boolean inLeftNodes = findNodeAndPath(root.left,data);
		if(inLeftNodes) {
			list.add(root.data);
			System.out.print(list+" , ");	// If element is found here then it will print the path as well till root node.
			return true;
		}
		
		boolean inRightNodes = findNodeAndPath(root.right, data);
		if(inRightNodes) {
			list.add(root.data);
			System.out.print(list+" , ");	// If element is found here then it will print the path as well till root node.
			return true;
		}
		return false;
	}
	
	
	// Print all the nodes at K level down from the root.
	public static void printNodesKLevelDown(Node root, int kLevelDown) {
		if(root == null || kLevelDown < 0) {
			return;
		}
		
		if(kLevelDown == 0) {
			System.out.print(root.data+" , ");
		}
		
		printNodesKLevelDown(root.left, kLevelDown-1);
		printNodesKLevelDown(root.right, kLevelDown-1);	
	}
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		// 1st example of Binary Tree

		//		tree.root = new Node(50);
		//		tree.root.left = new Node(40);
		//		tree.root.right = new Node(60);
		//		tree.root.left.left = new Node(30);
		//		tree.root.left.right = new Node(35);
		//		tree.root.right.left = new Node(50);
		//		tree.root.right.right = new Node(55);


		// 2nd example of Binary Tree

		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.right.left = new Node(5); 
		tree.root.right.right = new Node(6);
		tree.root.right.left.left = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.root.right.right = new Node(6);

		System.out.println("Size of binary tree => "+size(root));
		System.out.println("Sum of binary tree nodes => "+sum(root));
		System.out.println("Max element in a binary tree => "+max(root));
		System.out.println("Height of a binary tree => "+height(root));
		System.out.println("PreOrder traversal => ");
		preOrder(root);
		System.out.println();
		System.out.println("InOrder traversal => ");
		inOrder(root);
		System.out.println();
		System.out.println("PostOrder traversal => ");
		postOrder(root);
		System.out.println();		
		System.out.println("Level order traversal for a binary is => ");
		levelOrderTraversal(root);
		System.out.println("Iterative PreOrder traversal => ");
		iterativePreOrder(root);
		System.out.println("Iterative InOrder traversal => ");
		iterativeInOrder(root);
		System.out.println("Iterative PostOrder traversal => ");
		iterativePostOrder(root);
		System.out.println();
		System.out.println(findNodeAndPath(root,7));
		printNodesKLevelDown(root,2);

	}

}
