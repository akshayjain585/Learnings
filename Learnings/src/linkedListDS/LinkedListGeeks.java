package linkedListDS;

import java.util.HashSet;

public class LinkedListGeeks {

	Node head ;
	Node head2;

	static class Node{

		int data ;
		Node next ;
		Node(int data){
			this.data = data;
			this.next = null;
		}

	}
	
	public void middleNode(Node head){
		Node slow_p = head;
		Node fast_p = head;
		if(head!=null){
			while(slow_p!=null && fast_p!=null && fast_p.next!=null){
				slow_p = slow_p.next;
				fast_p = fast_p.next.next;
			}
			System.out.println("Middle node is: "+slow_p.data);
		}	
	}
	
//	public void middleNodeUsingLoop(Node head){
//		int count =0;
//		while(head!=null){
//			head =head.next;
//			count++;
//		}
//		while(head!=null){
//			
//		}
//	}
	
	//With the complexity of O(n2)
	
	public Node intersectionOfLinkedList(Node head1, Node head2){
		Node firstList = head1;
		Node secondList = head2;
		while(firstList!=null){
			while(secondList!=null){
				if(firstList == secondList){
					return firstList;
				}
				secondList = secondList.next;
			}
			firstList = firstList.next;
		}			
		return null;				
	}
	
	//With the complexity of O(n) using Set
	
	public Node intersection(Node head1, Node head2){
		if(head1==null || head2==null){
			return null;		
		}
		HashSet<Node> set = new HashSet<>();
		Node firstList = head1;
		while(firstList!=null){
			set.add(firstList);
			firstList = firstList.next;
		}
		Node secondList = head2;
		while(secondList!=null){
			if(set.contains(secondList)){
				return secondList;
			}
			secondList = secondList.next;
		}
		return null;
	}

	public void deleteNode(int key)
	{
		// Store head node
		Node current = head, prev = null;

		// If head node itself holds the key to be deleted
		if (current != null && current.data == key)
		{
			head = current.next; // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (current != null && current.data != key)
		{
			prev = current;
			current = current.next;
		}    

		// If key was not present in linked list
		if (current == null) {
			System.out.println("Key not found in linked list");
			return;
		}

		// Unlink the node from linked list
		prev.next = current.next;
	}

	public Node deleteFirstNode(Node head){

		if(head == null){
			return head;
		}

		Node temp = head;
		head = head.next;
		temp.next = null;		
		return temp;
	}

	public Node deleteLastNode(Node head){
		if(head == null){
			return head;
		}

		Node current = head;
		Node prev = null;
		while(current.next != null){
			prev = current;
			current = current.next;			
		}
		prev.next = null;
		return current;
	}

	public Node reverseLinkedList(Node head){

		if(head == null){
			return head;
		}

		Node current = head;  // Take three pointers: current, next and prev. Mark next of current to previous to reverse the link
		Node next = null;		// Put current in prev to keep prev as previous node of current.
		Node prev = null;		//Move next to next pointer to keep it one ahead of current node.

		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}		
		head = prev;   //Mark the last node as head which would be prev as prev = current.
		return head;		
	}
	
	public Node reverseLLRec(Node head){
		if(head == null || head.next == null){
			return head;
		}
		Node remaining = reverseLLRec(head.next);
		head.next.next = head;
		head.next = null;
		return remaining;
	}

	public void printList(Node node){
		while(node!=null){
			System.out.print(node.data + " --> ");
			node = node.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args){

		LinkedListGeeks list = new LinkedListGeeks();

		
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);

		list.head.next = second;
		second.next = third ;
		third.next = fourth;
		
		
		/*
		 * This code is to make the intersection of two linkedlist
		 * 
		list.head = new Node(3);
        list.head.next = new Node(6);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(15);
        list.head.next.next.next.next = new Node(30);
 
        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);
        
		*/

		//list.reverseLLRec(list.head);

		//		System.out.println("Delete first node from LinkedList");		
		//		Node firstNode = list.deleteFirstNode(list.head);
		//		System.out.println(firstNode.data);	
		//		
//		
//		System.out.println("Delete last node from LinkedList");
//		Node lastNode = list.deleteLastNode(list.head);
//		System.out.println(lastNode.data);
//
//		System.out.println("Linked list after reverse");
//		list.reverseLinkedList(list.head);
		list.printList(list.head);
		list.middleNode(list.head);
		list.printList(list.head);
		
		

	}


}
