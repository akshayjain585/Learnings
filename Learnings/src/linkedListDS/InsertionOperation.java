package linkedListDS;

public class InsertionOperation {

	Node head ;      //The main class has the reference of Node class

	static class Node{    //The node class is made static so that main() can access it
		int data;
		Node next;
		Node(int data){        //Made constructor so that data can be assigned while object creation
			this.data = data;
			this.next = null;  //By default the last node remains null from constructor. Needs to link the previous nodes.


		}
	}
	
	
	public void printList(){  						//Method to print LinkedList
		Node a = head;   							//Take Node a as head of the list
		while(a!=null){						//Run the loop until a node refers to null and print the data
			System.out.print(a.data + " --> ");
			a = a.next;								//The node a assigning itself to second node.
		}
		System.out.print("null");
	}

	
	//Time complexity of insertAtFront() is O(1) as it does constant amount of work.
	public void insertAtFront(int data){          //Method to add node at beginning of LinkedList
		Node node = new Node(data);			      //Create the node and allocate the data in it.
		node.next = head;						  //Point the new node link to head
		head = node;							 //	Assign the head of the linked list to new node.
	}

	
	//Time complexity of insertAfterNode() is O(1) as it does constant amount of work.
	public void insertAfterNode(Node prev_Node, int data){    //Method to add node after a given Node
		if(prev_Node == null){								  //If the previous node is null, print error message	
			System.out.println("The linked list is empty");
			return;
		}
		Node node = new Node(data);   //Create the node and allocate the data in it.
		node.next = prev_Node.next;	  //Point the new node link to the node link which previous node.next was linking	
		prev_Node.next = node;		  //Point the previous node link to the new node added.	
	}

	
	//Time complexity of insertAtLast() is O(n) as there is a loop from head to end. N is number of nodes in list
	public void insertAtLast(int data){    //Method to add at last

		if(head == null){				//Check if the given list is empty
			head = new Node(data);      //Make new node as head
			return;
		}
		Node node = new Node(data);     //Create node and allocate data
		node.next = null;				//Make next of new node as null

		Node last = head ;              
		while(last.next!= null)			//Traverse the node till last

			last = last.next;			
		last.next = node;				//Assign the next of last node tp new node.
		return;

	}
	public static void main(String args[]){
		InsertionOperation list = new InsertionOperation();

		list.insertAtLast(30);
		list.insertAtFront(20);
		list.insertAtFront(10);
		list.insertAtLast(40);
		list.insertAfterNode(list.head.next, 25);
		list.printList();





	}

}
