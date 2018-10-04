/*1. PreOrder : Root, Left, Right
2. PostOrder: Left, Right, Root
3. InOrder: Left, Root, Right
*/

package linkedListDS;

class Node
{
    int data;
    Node left, right;
 
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

 class BinaryTree{
	 static Node root;
	 
	 BinaryTree(){
		 root = null;
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
		 if(root.data <=min || root.data > max){
			 return false;
		 }
		 return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
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
		 
		 tree.printInorder(root);
		 System.out.println();
		 tree.printPreorder(root);
		 System.out.println();
		 tree.printPostorder(root);
		 boolean isBST = isBST(root, 1, 1);  //Need to know how to pass min and max value in this method
		 System.out.println(isBST);
		 
		 
		 
		 
	 }
	 
	 

	 
 }