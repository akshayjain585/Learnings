/*1. PreOrder : Root, Left, Right  : Type of Depth First Search (Can print PreOrder traversal in case of DFS traversal)
2. PostOrder: Left, Right, Root
3. InOrder: Left, Root, Right	: Would give all nodes in ascending order in case of Binary Search Tree since its order is Left --> Root --> Right

Binary Tree and Binary Search Tree : 
1. A tree which can have maximum of 2 nodes and each node could be of greater/lesser value than root node is binary tree.
2. A tree which can have maximum of 2 nodes and each left node would be lesser than the root node and right node would be greater than root node is binary search tree.

Height/Depth of Binary tree : Calculated in two ways :
1. Number of nodes from root to leaf (The last node) node : According to this, the height is 3 for below binary tree : 1,2,3,4,5,6,7 
2. Number of edges from root to leaf node. : According to this, the height is 2 for below binary tree.

Note : Height : Calculated from root to leaf (top-down) and Depth : Leaf to Root (Bottom up)
1. Height and Depth of binary tree is always same since doesn't matter either we count the edges/Nodes from root to leaf or from leaf to root.
2. Height and Depth of a node in a binary tree can not be same since the height of second last node in a binary tree as per below example will be 2 but depth would be 1.
 */

package linkedListDS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryTree{
	 static Node root;
	 static int maxLevel=0;
	 static int maxLevell = 0;
	 
	BinaryTree(){
		root = null;
	}

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


	public static int heightOfBinaryTree(Node root){

		//Ref : https://www.youtube.com/watch?v=_O-mK2g_jhI&t=555s
		int h = 0;
		if(root == null){
			return h;
		}

		/* compute  height of each subtree */
		int lheight = heightOfBinaryTree(root.left);  //Traverse till leaf of the node on left hand side.
		int rheight = heightOfBinaryTree(root.right); //Traverse till leaf of the node on right hand side.

		if(lheight<rheight){
			h = lheight+1;
		}else{
			h = rheight + 1;   //Start adding 1 moving from leaf to root node.
		}
		return h;
	}

	public static void printBinaryTree(Node root){

		/*
		 * Ref : https://www.youtube.com/watch?v=9PHkM0Jri_4
		 * https://www.geeksforgeeks.org/level-order-tree-traversal/
		 * Note : Level Order Traversal is BFS (Can print level order binary tree in case of DFS traversal)
		 */

		if(root==null){
			return;
		}

		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			root = q.poll(); 	//poll() removes the present head.
			System.out.print(root.data+" ");

			/*Enqueue left child */
			if(root.left!=null){
				q.add(root.left);
			}

			/*Enqueue right child */
			if(root.right!=null){
				q.add(root.right);
			}
		}
	}

	public static void printLevelOrderBinaryTree(Node root){
        // Base Case 
		if(root == null){
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while(true){
			
			// nodeCount (queue size) indicates number of nodes 
            // at current level.
			int nodeCount = q.size();
			if(nodeCount==0){
				break;
			}
			while(nodeCount>0){
				root = q.poll();
				System.out.print(root.data+" ");

				if(root.left!=null){
					q.add(root.left);
				}

				if(root.right!=null){
					q.add(root.right);
				}
				nodeCount--;
			}
			System.out.println();
		}
			
	}
	
	public static void printRightSideViewUsingQueue(Node root){
		
		if(root == null){
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()){
			int nodeCount = q.size();
			for(int i=1; i<=nodeCount; i++){
				root = q.poll();
				if(i==nodeCount){
					System.out.print(root.data+" ");
				}
			}
			
			if(root.left!=null){
				q.add(root.left);
			}
			
			if(root.right!=null){
				q.add(root.right);
			}
		}
	}
	
	public static void printLeftSideView(Node root, int level){
		if(root == null){
			return;
		}
		
		if(maxLevel<level){
			System.out.print(root.data+" ");
			maxLevel = level;
		}
		
		printLeftSideView(root.left,level+1);
		printLeftSideView(root.right,level+1);
	}
	
	public static void printRightSideView(Node root, int level){
		if(root == null){
			return;
		}
		
		if(maxLevell<level){
			System.out.print(root.data+" ");
			maxLevell = level;
		}
		
		printRightSideView(root.right,level+1); //Initially we have to go towards right side to print right Nodes
		printRightSideView(root.left,level+1);
	}
	
	public static void printBinaryTreeSpiralForm(Node root){
		
		/*
		 * Ref : https://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/
		 * https://www.youtube.com/watch?v=YsLko6sSKh8 
		 */
		
		if(root==null){
			return;
		}
		
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()){
			
			while(!s1.isEmpty()){
				root = s1.pop();
				System.out.print(root.data+" ");
				
				if(root.right!=null){	//Initially, we will move to right to add right node in Stack s2 to be popped first to print in Spiral form 
					s2.push(root.right);
				}
				
				if(root.left!=null){
					s2.push(root.left);
				}
			}
			
			while(!s2.isEmpty()){
				root = s2.pop();
				System.out.print(root.data+" ");
				
				if(root.left!=null){
					s1.push(root.left);
				}
				
				if(root.right!=null){
					s1.push(root.right);
				}
			}
		}
	}
	
	
	public void printPreorder(Node node){
		if(node == null){
			return ;
		}
		System.out.print(node.data+" ");
		printPreorder(node.left);
		printPreorder(node.right);
	}

	public void printPostorder(Node node){
		if(node == null){
			return ;
		}
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data+" ");
	}

	public void printInorder(Node node){
		if(node == null){
			return ;
		}
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}

	//Complexity is O(n): Visiting every node
	public static boolean isBST(Node root, int min, int max){
		if(root==null){
			return true;
		}
		if(root.data < min || root.data > max){
			return false;
		}
		return isBST(root.left,min,root.data-1) && isBST(root.right,root.data+1,max);
	}

	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
//        tree.root = new Node(12); 
//        tree.root.left = new Node(10); 
//        tree.root.right = new Node(30); 
//        tree.root.right.left = new Node(25); 
//        tree.root.right.right = new Node(40); 

		System.out.println("Printing Inorder Tree: ");
		tree.printInorder(root);
		System.out.println();
		System.out.println();

		
		System.out.println("Printing Preorder Tree: ");
		tree.printPreorder(root);
		System.out.println();
		System.out.println();

		
		System.out.println("Printing Postorder Tree: ");
		tree.printPostorder(root);
		System.out.println();
		System.out.println();

		
		int h = heightOfBinaryTree(root);		
		System.out.println("Printing height of Binary tree: ");
		System.out.println(h);
		System.out.println();

		
		System.out.println("Checking if the tree is BST or not :");
		boolean isBST = isBST(root, 1, 1);  //Need to know how to pass min and max value in this method
		System.out.println(isBST);
		System.out.println();
		
		
		System.out.println("Binary tree traversal :");
		printBinaryTree(root);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Binary tree level traversal");
		printLevelOrderBinaryTree(root);
		System.out.println();
		
		
		System.out.println("Printing right side view of Binary tree using Queue: ");
		printRightSideViewUsingQueue(root);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Printing left side view");
		printLeftSideView(root,1);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Printing right side view");
		printRightSideView(root,1);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Printing in Spiral form :");
		printBinaryTreeSpiralForm(root);


	}




}