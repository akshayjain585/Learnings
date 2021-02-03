package pepCoding.BinaryTree;

import java.util.ArrayList;

public class BTree {
	
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
	
	// Written in previous class as well. Used here as a helper function in --
	static ArrayList<Node> path;
	public static boolean findNodeAndPath(Node root, int data){
		path = new ArrayList<>();
		if(root == null) {
			return false;
		}
		
		if(root.data == data) {
			path.add(root);				// Added only node to the list unlike data in previous class same function.
			return true;
		}
		
		boolean inLeftNodes = findNodeAndPath(root.left,data);
		if(inLeftNodes) {
			path.add(root);
			return true;
		}
		
		boolean inRightNodes = findNodeAndPath(root.right, data);
		if(inRightNodes) {
			path.add(root);
			return true;
		}
		return false;
	}
	
	// Written in previous class as well. Used here as a helper function in --
	public static void printNodesKLevelDownFromRoot(Node root, int kLevelDown, Node blocker) {
		if(root == null || kLevelDown < 0 || root == blocker) {
			return;
		}
		
		if(kLevelDown == 0) {
			System.out.print(root.data+" , ");
		}
		
		printNodesKLevelDownFromRoot(root.left, kLevelDown-1, blocker);
		printNodesKLevelDownFromRoot(root.right, kLevelDown-1, blocker);	
	}
	
	
	
	// Print all the nodes at K distance from the given node. Could be down, up, left subtree and right subtree.
	// To understand : https://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
	// Above functions are helper.
	public static void printNodesKDistanceFromNode(Node root, int data, int kDistance) {
		// First of all find a path from node's data to root which we have done in our earlier function to find the distance on ancestor side, above the node.
		findNodeAndPath(root,data);		// Got the path for ancestor, means distance from node till root.
		for(int i=0; i<path.size(); i++) {
			printNodesKLevelDownFromRoot(path.get(i), kDistance-i, i == 0 ? null : path.get(i-1));
			// i == 0 ? null : path.get(i-1) : This is ternary statement. If i==0 then null else path.get(i-1)
			// This is added for blocker node, while trying to consider self node in printing distance node from ancestor side.
		}
	}
	
	public static void pathToLeafFromRootLowHigh(Node root, String path, int sum, int low, int high) {
		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null) {
			sum = sum + root.data;
			if(sum >= low && sum <= high) {
				System.out.println(path+root.data);
			}
		}
		
		pathToLeafFromRootLowHigh(root.left, path + root.data + " ", sum, low, high);
		pathToLeafFromRootLowHigh(root.right, path + root.data + " ", sum, low, high);
	}
	
	//Print the node which has a single child, either left/right
	public static void printSingleChild(Node root, Node parent) {
		if(root == null) {
			return;
		}
		if(parent != null && parent.left == root && parent.right == null) {
			System.out.print(root.data + " , ");
		}else if(parent != null && parent.right == root && parent.left == null) {
			System.out.print(root.data + " , ");
		}
		printSingleChild(root.left, root);
		printSingleChild(root.right, root);
	}
	
	
	// Remove leaves of a binary tree
	public static Node removeLeaves(Node root) {
		if(root == null) {
			return null;
		}
		if(root.left == null && root.right == null) {
			return null;
		}
		
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		
		return root;	
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
	
	//Diameter of binary tree O(n2) as two recursive calls will be made one for diameter and one for height.
	public static int diameterOn2(Node root) {
		if(root == null) {
			return 0;
		}
		// Maximum diameter on left hand side
		int leftDiameter = diameterOn2(root.left);
		// Maximum diameter on right hand side
		int rightDiameter = diameterOn2(root.right);
		// Maximum diameter between left deepest and right deepest node and + 2 to attach both of them with root node
		int leftRightHeight = height(root.left) + height(root.right) + 2;
		int maxD = Math.max(leftRightHeight, Math.max(leftDiameter, rightDiameter));
		return maxD;
	}
	
	// Diameter of binary tree O(n). Leetcode : https://leetcode.com/problems/diameter-of-binary-tree/solution/
    static int ans;
    public static int diameterOfBinaryTree(Node root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public static int depth(Node node) {
        if (node == null) {
        	return 0;
        }
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }
    
    //Tilt of binary tree
    static int tilt = 0;
    public static int tiltBinaryTree(Node root) {
    	if(root == null) {
    		return 0;
    	}
    	
    	int leftSum = tiltBinaryTree(root.left);
    	int rightSum = tiltBinaryTree(root.right);
    	
    	int localTilt = Math.abs(leftSum - rightSum);
    	tilt = tilt + localTilt;
    	int tiltSum = leftSum + rightSum + root.data;
    	return tiltSum;
    }
    
    static boolean isBalanced = true;
    // If binary tree is balanced. Tree is balanced is difference between left and right node is <=1
    public static int isBal(Node root) {
    	if(root == null) {
    		return 0;
    	}
    	
    	int leftHeight = isBal(root.left);
    	int rightHeight = isBal(root.right);
    	
    	int gap = Math.abs(leftHeight - rightHeight);
    	if(gap > 1) {
    		isBalanced = false;
    	}
    	
    	int treeHeight = Math.max(leftHeight, rightHeight) +1;
    	return treeHeight;    	
    }
	
	
	
	public static void main(String[] args) {
		
		BTree tree = new BTree();
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.right.left = new Node(5); 
		tree.root.right.right = new Node(6);
		tree.root.right.left.left = new Node(7);
		tree.root.right.left.right = new Node(8);
		
		printNodesKDistanceFromNode(root, 8,3);	
		System.out.println();
		System.out.print("Single child nodes are => ");
		printSingleChild(root, null);
		System.out.println();
		System.out.println(diameterOn2(root));
		System.out.println(diameterOfBinaryTree(root));
		System.out.println(tiltBinaryTree(root));
		
	}

}
