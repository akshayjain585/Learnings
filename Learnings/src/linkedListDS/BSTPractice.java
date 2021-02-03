package linkedListDS;

import java.util.ArrayList;

public class BSTPractice {
	
	static Node root;
	
	static class Node
	{
	    int data;
	    Node left, right;
	 
	    public Node(int data)
	    {
	        this.data = data;
	        left = right = null;
	    }
	}
	
// In Below function next is left node to find minimum element.	
	//Complexity is O(log n)
	public static int minElementInBST(Node root){
		if(root!=null){
			while(root.left!=null){     
				root = root.left;
			}
		}
		return root.data;		
	}
	
// In Below function next is right node to find minimum element.	
	//Complexity is O(log n)
	public static int maxElementInBST(Node root){
		if(root!=null){
			while(root.right!=null){
				root = root.right;
			}
		}
		return root.data;
	}
	
	// Complexity is O(log n) as it doesn't visit all nodes and discard half of the nodes at each level depending on its value either less/more to figure out if it has to go in left/rightt side.
	// Binary tree complexity is O(n) as in that case, we visit each node.
	public static boolean searchNodeInBST(Node root, int data){
		if(root == null) {
			return false;	// When root is null or we reach null while traversing without any element is found
		}
		if(root.data > data) {
			return searchNodeInBST(root.left, data);
		}else if(root.data < data) {
			return searchNodeInBST(root.right, data);
		}else {
			return true;
		}
	}
	
	// Add a node in BST
	public static Node addNodeInBST(Node root, int data) {
		
		if(root == null) {
			return new Node(data);
		}
		if(data > root.data) {
			root.right = addNodeInBST(root.right,data);
		}else {
			root.left = addNodeInBST(root.left,data);
		}
		return root;
	}
	

	// Remove a node in BST
	public static Node removeNodeInBST(Node root, int data) {
		if(root == null) {
			return null;
		}
		
		if(root.data > data) {
			root.left = removeNodeInBST(root.left, data);
		} else if(root.data < data) {
			root.right = removeNodeInBST(root.right, data);
		} else {
			//When node has both left and right child, take the max from left side and assign that max node at deleted place and delete the max node at the previous place.
			if(root.left != null && root.right != null) {
				int leftMax = maxElementInBST(root.left);
				root.data = leftMax;
				root.left = removeNodeInBST(root.left, leftMax);
				return root;
				// If node has only left child
			}else if(root.left != null) {
				return root.left;
				// If node has only right child
			}else if(root.right != null) {
				return root.right;
			}else {
				// If node has no child means leaf node
				return null;
			}
		}
		return root;
	}
	
	static int sum = 0;
	// Function to replace the value of node with sum of larger node. Here we will use reverse InOrder which will traverse the node in descending order. R, root, Left
	public static void replaceSumOfLarger(Node root) {
		if(root == null) {
			return;
		}
		replaceSumOfLarger(root.right);
		int oldData = root.data;
		root.data = sum;
		sum = sum + oldData;
		replaceSumOfLarger(root.left);
	}
	
	// Function to return the LCA (Lowest common ancestor) in BST
	public static int lcaBST(Node root, int data1, int data2) {
		if(root == null) {
			return 0;
		}
		if(root.data > data1 && root.data > data2) {
			return lcaBST(root.left, data1, data2);
		}else if(root.data < data1 && root.data < data2) {
			return lcaBST(root.right, data1, data2);
		}else {
			// This is the node from where the path will be separated and thats the lowest common ancestor
			return root.data;
		}
	}
	
	// Function to print all nodes between given nodes in BST in increasing order, range in BST
	public static void printRangeInBST(Node root, int dataRange1, int dataRange2) {
		if(root == null) {
			return;
		}
		
		if(root.data < dataRange1 && root.data < dataRange2) {
			printRangeInBST(root.right, dataRange1, dataRange2); 
		}else if(root.data > dataRange1 && root.data > dataRange2) {
			printRangeInBST(root.left, dataRange1, dataRange2);
		}else if(root.data > dataRange1 && root.data < dataRange2)
			// Printing the nodes in InOrder as it will be increasing
			printRangeInBST(root.left, dataRange1, dataRange2);
			System.out.print(root.data + " , ");
			printRangeInBST(root.right, dataRange1, dataRange2);			
	}
	
	// Function to print target sum pair in BST . Complexity is O(nlogn) : Find is logn and traversing will take n.
	// Time : O(nlogn) , Space : O(logn)
	public static void targetSumPair(Node root, Node node, int targetSum) {
		if(node == null) {
			return;
		}
		
		// Printing in Inorder to be in ascending format (L, Data, Right)
		targetSumPair(root, node.left, targetSum);
		
		int dataToFind = targetSum - node.data;
		if(node.data < dataToFind) {				// To avoid same nodes printing multiple times like 50,50 and to print only in ascending order
			if(searchNodeInBST(root, dataToFind)) {
				System.out.println(node.data+" , "+dataToFind);
			}
		}
		
		targetSumPair(root, node.right, targetSum);
	}
	
	// Another approach of above function. Remaining code is at bottom
	// Time : O(n) , Space : O(n)
	public static void targetSumPair1(Node root, ArrayList<Integer> list) {
		if(root == null) {
			return;
		}
		// Adding all the data in InOrder(sorted order) for BST
		targetSumPair1(root.left, list);		
		list.add(root.data);
		targetSumPair1(root.right, list);
	}
	
	public static Node node;
	public static void main(String[] args){
		
		
		BSTPractice bst = new BSTPractice();
		bst.root = new Node(50);
		bst.root.left = new Node(40);
		bst.root.right = new Node(60);
		bst.root.left.left = new Node(35);
		bst.root.left.right = new Node(45);
		
		
		System.out.println("Minimum element in BST => "+minElementInBST(bst.root));
		System.out.println("Maximum element in BST => "+maxElementInBST(bst.root));
		System.out.println("Is node present in BST => "+searchNodeInBST(bst.root, 50));
		System.out.println("Adding node in BST => "+addNodeInBST(root,10));
		System.out.println("After adding node, minimum element in BST => "+minElementInBST(bst.root));
		System.out.println("Removing node in BST => "+removeNodeInBST(root,10));
		System.out.println("After removing node, minimum element in BST => "+minElementInBST(bst.root));
		System.out.println("Printing lowesst common ancestor between 2 nodes => "+lcaBST(root,35,45));
		System.out.print("Printing all nodes in given range in ascending order => ");
		printRangeInBST(root,35,60);
		System.out.println();
		System.out.print("Target sum pair in BST => ");
		targetSumPair(root,root,100);
		
		ArrayList<Integer> list = new ArrayList<>();
		int target = 100;
		targetSumPair1(root,list);
		int startIndex = 0;
		int endIndex = list.size() -1;
		while(startIndex < endIndex) {
			if(list.get(startIndex) + list.get(endIndex) < target) {
				startIndex ++;
			}else if(list.get(startIndex) + list.get(endIndex) > target) {
				endIndex --;
			}else {
				System.out.println("Target sum pair is => "+list.get(startIndex) + " , " + list.get(endIndex));
				startIndex ++;
				endIndex --;
			}
		}
		
	}

}
