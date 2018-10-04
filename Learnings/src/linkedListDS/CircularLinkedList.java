package linkedListDS;

public class CircularLinkedList {
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;		
		}
	}
	
	public void printList(Node head){
		while(head!=null){
			System.out.print(head.data+ " --> ");
			head = head.next;
		}
		System.out.println("null");
	}
	
	public void insertAtFront(int data){
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	//Time Complexity: O(n), Auxiliary Space: O(1)
	
	boolean detectLoop(Node head){
		Node slow_p = head;
		Node fast_p = head;
		while(slow_p!=null && fast_p !=null && fast_p.next!=null){
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p){
				System.out.println("Loop found");
				return true;
			}
		}
		System.out.println("No loop found");
		return false;		
	}
	
	boolean isCircular(Node head){
	
		if(head == null){
			System.out.println("Linked list is circular as its null");
			return true;
		}
		
		Node node = head.next;
		while(node!=null && node!=head){
			node = node.next;
		}
		if(node==null){
			System.out.println("Linked list is not circular");
			return false;
		}
		System.out.println("Linkedlist is circular");
		return true;
	}
	
	
	public static void main(String[] args){
		CircularLinkedList cll = new CircularLinkedList();
		cll.insertAtFront(5);
		cll.insertAtFront(10);
		cll.insertAtFront(15);
		cll.insertAtFront(20);
		cll.insertAtFront(25);
		cll.insertAtFront(30);
		cll.printList(cll.head);
		
		//Making Loop
		//cll.head.next = cll.head;
		cll.detectLoop(cll.head);
		cll.isCircular(cll.head);
	}
	

}







