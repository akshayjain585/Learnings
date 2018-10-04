package linkedListDS;

import java.util.ArrayList;

public class LinkedListCommonPrograms {

	Node head ;

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public void getLength(Node node){     //Method to get the length of linked list in Iterative way
		int count = 0;
		while(node!=null){
			count++;
			node = node.next;
		}
		System.out.println("The length of linked list is "+count);
		//return count;		
	}

	public int getLengthRecursive(Node node){
		if(node == null){
			return 0;
		}

		return 1 + getLengthRecursive(node.next);
	}

	public void printList(){
		Node a = head;
		while(a!=null){
			System.out.print(a.data + " --> ");
			a = a.next;
		}
		System.out.print("null");
	}

	public void searchListWithIndex(Node node, int data){      //To search and print index of LinkedList
		int count = 0;
		boolean isPresent=false;
		while(node!=null){
			if(node.data == data){
				isPresent=true;
				System.out.println("Node present for "+data+ " at index "+count);
			}
			node = node.next;
			count++;
		}		
		
		if(!isPresent)
		{
			System.out.println("Node is not present in LinkedList");			

		}
	}

	public void getNodeData(Node node, int index){
		int count = 0;
		boolean isPresent = false;
		while(node!=null){
			if(count == index){
				isPresent = true;
				System.out.println("Data at " +index +" is " +node.data);
			}
			node = node.next;
			count ++ ;
		}
		if(!isPresent){
			System.out.println("Node is not present at particular index");
		}

	}

	public static void main(String[] args){
		LinkedListCommonPrograms list = new LinkedListCommonPrograms();
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;


		list.printList();
		System.out.println();
		list.getLength(list.head);
		list.getLengthRecursive(list.head);
		list.searchListWithIndex(list.head, 20);
		list.searchListWithIndex(list.head, 0);
		list.getNodeData(list.head, 3);
		list.getNodeData(list.head, 7);
	}
}


