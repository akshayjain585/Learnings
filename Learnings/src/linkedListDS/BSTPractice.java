package linkedListDS;


public class BSTPractice {
	
	Node root;
	
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
	
	public static int minElementInBST(Node root){
		if(root!=null){
			while(root.left!=null){     
				root = root.left;
			}
		}
		return root.data;		
	}
	
// In Below function next is right node to find minimum element.	
	
	public static int maxElementInBST(Node root){
		if(root!=null){
			while(root.right!=null){
				root = root.right;
			}
		}
		return root.data;
	}
	
	public static Node searchNodeInBST(Node root, int data){
		if(root == null || root.data == data){
			return root;
		}
		if(root.data < data){
			return searchNodeInBST(root.right, data);   
		}
		return searchNodeInBST(root.left, data);
	}
	
	public static void main(String[] args){
		BSTPractice bst = new BSTPractice();
		bst.root = new Node(10);
		bst.root.left = new Node(5);
		bst.root.right = new Node(20);
		bst.root.left.left = new Node(4);
		bst.root.left.right = new Node(6);
		int min = minElementInBST(bst.root);
		int max = maxElementInBST(bst.root);
		System.out.println(min);
		System.out.println(max);
		Node a = searchNodeInBST(bst.root, 20);
		System.out.println(a);

		
	}

}
