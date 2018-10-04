package linkedListDS;

public class DLL {
	
	Node head;
	
	
	public void printList(Node a){

		System.out.println("Traversing in forward direction");
		while(a!=null){
			System.out.print(a.data +" <--> ");
			a = a.next;
		}
		System.out.println("null");
	}
	
	
	public void insertAtFront(int data){
		Node node = new Node(data);
		node.prev = null;
		node.next = head;
		
		if(head!=null){
			head.prev = node;
			head = node;
		}
		
	}
	
	public void insertAfterGivenNode(Node prev_Node,int new_data ){
	       
		if(prev_Node == null){
			System.out.println("The previous node can not be null");
			return;
		}
		
		Node newNode = new Node(new_data);
		newNode.next = prev_Node.next;
		prev_Node.next = newNode;
		newNode.prev = prev_Node;	
		
		if(newNode.next!= null){
			newNode.next.prev = newNode;		
		}
	}
	
	public void insertBeforeGivenNode(Node next_Node, int data){
		Node node = new Node(data);
//		if(next_Node == null){
//			
//		}
		
		node.next = next_Node;
		next_Node.prev.next = node;
		node.prev = next_Node.prev;
		next_Node.prev = node;
		
	}
	
	public void insertAtEnd(int data){
		Node node = new Node(data);
		node.next = null;
		if(head == null){
			node.prev = null;
			head = node;
			return;
		}
		
		Node last = head;
		while(last.next!=null){
			last = last.next;			
		}
		last.next = node;
		node.prev = last;					
	}
	
	static class Node{
		
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
		}
		
	}
	
	public static void main(String[] args){
		
		DLL dll = new DLL();
		
		dll.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		dll.head.prev = null;
		dll.head.next = second;
		second.prev = dll.head;
		
		second.next = third;
		third.prev = second;
		
		third.next = fourth;
		fourth.prev = third;
		
		dll.printList(dll.head);
		System.out.println("Adding a node at front");
		dll.insertAtFront(5);
		dll.printList(dll.head);
		System.out.println("Adding a node after a given Node "+second.data);
		dll.insertAfterGivenNode(second, 25);
		dll.printList(dll.head);
		System.out.println("Adding a node before a given Node "+fourth.data);
		dll.insertBeforeGivenNode(fourth, 35);
		dll.printList(dll.head);
		System.out.println("Adding a node at the end");
		dll.insertAtEnd(45);
		dll.printList(dll.head);

		
	}

}
