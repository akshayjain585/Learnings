package linkedListDS;

public class LinkedList {
	
	static Node head;
	
	static class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// Print a LinkedList
	public void printList(Node head) {
		if(head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		Node current = head;
		while(current != null) {
			System.out.print(current.data+"  ");
			current = current.next;
		}
		System.out.println();
	}
	
	// Get the size of LinkedList
	public int size(Node head) {
		Node current = head;
		int size = 0;
		while(current != null) {
			size ++;
			current = current.next;
		}
		return size;
	}
	
	// Add first node to LinkedList
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	// Add last node to LinkedList
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = null;
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return;
	}
	
	// Add at given Node in LinkedList
	public void addAt(int index, int data) {
		int size = size(head);
		if(index < 0 || index > size) {
			System.out.println("Invalid index");
			return;
		}else if(index == 0) {
			addFirst(data);
		}else if(index == size) {
			addLast(data);
		}else {
			Node newNode = new Node(data);
			Node current = head;
			for(int i=0; i<index-1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			return;
		}
	}
	
	// Remove first node from LinkedList
	public void removeFirst() {
		if(head == null) {
			System.out.println("Empty Linkedlist");
			return;
		}
		head = head.next;
		return;
	}
	
	// Remove Last node from LinkedList
	public void removeLast() {
		if(head == null || head.next == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		return;
	}
	
	// Remove at given node in LinkedList
	public void removeAt(int index) {
		int size = size(head);
		if(index < 0 || index >= size) {
			System.out.println("Invalid index");
			return;
		}else if(index == 0) {
			removeFirst();
		}else if(index == size-1) {
			removeLast();
		}else {
			Node current = head;
			for(int i=0; i<index-1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
			return;
		}
	}
	
	// Reverse a LinkedList iterative
	public Node reverseLinkedListIterative(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	
	// Reverse a LinkedList recursively
	public Node reverseLinkedListRecursive(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node temp = reverseLinkedListRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}
	
	// Reverse a LinkedList in a group of K element
	public Node reverseLinkedListInGroup(Node head, int k) {
		if(head == null || head.next == null) {
			return head;
		}
		Node current = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		
		while(count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		
		if(current != null) {
			head.next = reverseLinkedListInGroup(current,k);
		}
		return prev;
	}
	
	// Display reverse LinkedList
	public void displayReverse(Node head) {
		if(head == null) {
			return;
		}
		displayReverse(head.next);
		System.out.print(head.data+"  ");
	}
	
	// Kth Node from Last
	public int kthNodeFromLast(Node head, int k) {
		if(head == null || k < 1) {
			return -1;
		}
		
		int size = size(head);
		if(size < k) {
			return -1;
		}
		
		Node slow_p = head;
		Node fast_p = head;
		
		for(int i=0; i<k; i++) {
			fast_p = fast_p.next;
		}
		
		while(fast_p != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next;
		}
		return slow_p.data;
	}
	
	// Kth node from last
	public int kthNodeFromLastAnotherApproach(Node head, int k) {
		if(head == null || k < 1) {
			return -1;
		}
		
		int size = size(head);
		if(size < k) {
			return -1;
		}
		Node current = head;
		for(int i=0; i<size - k; i++) {
			current = current.next;
		}
		return current.data;
	}
	
	// Very important, Remove Kth Node from end of linkedlist
	public Node removeKthNodeFromEnd(Node head, int k) {
		if(head == null || head.next == null) {
			return null;
		}
		Node dummy = new Node(0);
		dummy.next = head;
		Node slowp = dummy;	// Running from dummy so that we can handle the head node to be deleted
		Node fastp = dummy;
		
		for(int i=0; i<=k; i++) {	// Running till <=k as we need to go one step more so that slowp runs slow and we can unlink the node
			fastp = fastp.next;
		}
		
		while(fastp != null) {
			slowp = slowp.next;
			fastp = fastp.next;
		}
		slowp.next = slowp.next.next;
		return dummy.next; 	// Returning dummy.next which is head's reference because when head itself is deleted in case of only 2 nodes and K is 2 then it will give null pointer.
	}
	
	// Remove duplicates from Sorted LinkedList
	public void removeDuplicatesFromSortedList(Node head) {
		if(head == null || head.next == null) {
			return;
		}
		Node current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
		return;
	}
	
	// Middle Node of a LinkedList
	public Node middleNode(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node slow_p = head;
		Node fast_p = head;
		
		while(fast_p.next != null && fast_p.next.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
		}
		return slow_p;
	}
	
	// If linkedlist is palindrome : Time :O(n), Space : O(1)
	public boolean isPalindrome(Node head) {
		if(head == null || head.next == null) {
			return true;
		}
		
		Node middleNode = middleNode(head);
		Node secondHalf = middleNode.next;
		middleNode.next = null;
		secondHalf = reverseLinkedListIterative(secondHalf);
		Node firstHalf = head;
				
		while(firstHalf != null && secondHalf != null) {
			if(firstHalf.data != secondHalf.data) {
				return false;
			}
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}
		return true;
	}
	
	// Fold/Rearrange/Zig Zag a LinkedList
	public void foldZigZagReArrangeLL(Node head) {
		if(head == null || head.next == null || head.next.next == null) {
			return;
		}
		
		Node middleElement = middleNode(head);
		Node firstHalf = head;
		Node secondHalf = middleElement.next;
		middleElement.next = null;
		secondHalf = reverseLinkedListIterative(secondHalf);
		
		Node finalList = new Node(0);
		Node current = finalList;
		
		while(firstHalf != null || secondHalf != null) {
			if(firstHalf != null) {
				current.next = firstHalf;
				current = current.next;
				firstHalf = firstHalf.next;
			}
			if(secondHalf != null) {
				current.next = secondHalf;
				current = current.next;
				secondHalf = secondHalf.next;
			}
		}
		finalList = finalList.next;
	}
	
	// Odd Even Linkedlist on the basis of LinkedList nodes. Means 1st node at odd, second node at even and so on. Move all odd first followed by even.
	public Node oddEvenOnTheBasisOfNode(Node head) {
		Node oddNode = head;
		Node evenNode = head.next;
		Node evenHead = evenNode;
		
		while(evenNode != null && evenNode.next != null) {
			oddNode.next = evenNode.next;
			oddNode = oddNode.next;
			evenNode.next = oddNode.next;
			evenNode = evenNode.next;
		}
		
		oddNode.next = evenHead;
		return head;
	}
	
	// Function to segregate even and odd on the basis of values
	public Node oddEvenOnTheBasisOfValues(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node current = head;
		
		while(current != null) {
			if(current.data % 2 == 0) {
				if(evenStart == null) {
					evenStart = current;
					evenEnd = evenStart;
				}else {
					evenEnd.next = current;
					evenEnd = evenEnd.next;
				}
			}else {
				if(oddStart == null) {
					oddStart = current;
					oddEnd = oddStart;
				}else {
					oddEnd.next = current;
					oddEnd = oddEnd.next;
				}
			}
			current = current.next;
		}
		
		if(oddStart == null || evenStart == null) {
			return head;
		}
		evenEnd.next = oddStart;
		oddEnd.next = null;
		head = evenStart;
		return head;
	}
	
	// Function to merge two sorted list. Time : O(n) and Space : O(1)
	// Ref : https://www.educative.io/m/merge-two-sorted-linked-lists
	public Node mergeTwoSortedList(Node head1, Node head2) {
		if(head1 == null) {
			return head2;
		}else if(head2 == null) {
			return head1;
		}
		Node mergedHead = null;
		
		if(head1.data <= head2.data) {
			mergedHead = head1;
			head1 = head1.next;
		}else {
			mergedHead = head2;
			head2 = head2.next;
		}
		
		Node firstList = head1;
		Node secondList = head2;
		Node mergedTail = mergedHead;
		
		while(firstList != null && secondList != null) {
			Node temp = null;
			if(firstList.data <= secondList.data) {
				temp = firstList;
				firstList = firstList.next;
			}else {
				temp = secondList;
				secondList = secondList.next;
			}
			mergedTail.next = temp;
			mergedTail = temp;
		}
		
		if(firstList != null) {
			mergedTail.next = firstList;
		}else if(secondList != null) {
			mergedTail.next = secondList;
		}
		
		return mergedHead;
	}
	
	// Function for mergeSort
	public Node mergeSort(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node middleElement = middleNode(head);
		Node firstHalf = head;
		Node secondHalf = middleElement.next;
		middleElement.next = null;
		
		Node left = mergeSort(firstHalf);
		Node right = mergeSort(secondHalf);
		Node res = mergeTwoSortedList(left,right);
		
		return res;
	}
	
	// Intersection point of linkedlist
	public int intersectionOfLinkedList(Node head1, Node head2) {
		if(head1 == null || head2 == null) {
			return -1;
		}
		
		Node firstList = head1;
		Node secondList = head2;
		int firstListSize = size(firstList);
		int secondListSize = size(secondList);
		firstList = head1;
		secondList = head2;
		int delta = Math.abs(firstListSize - secondListSize);
		
		if(firstListSize > secondListSize) {
			for(int i=0; i<delta; i++) {
				firstList = firstList.next;
			}
		}else {
			for(int i=0; i<delta; i++) {
				secondList = secondList.next;
			}
		}

		while(firstList != secondList) {
			firstList = firstList.next;
			secondList = secondList.next;
		}
		return firstList.data;
	}
	
	// Function to detect loop
	public boolean detectLoop(Node head) {
		Node slow_p = head;
		Node fast_p = head;
		
		while(fast_p.next != null || fast_p.next.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p) {
				return true;
			}
		}
		return false;
	}
	
	// Function if LL is circular
	public boolean isCircular(Node head) {
		if(head == null) {
			return true;
		}
		Node current = head.next;
		while(current != null && current.next != head) {
			current = current.next;
		}
		if(current == null) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.printList(head);
		l1.addLast(60);
		l1.printList(head);
		l1.addAt(4, 50);
		l1.printList(head);
		l1.removeFirst();
		l1.printList(head);
		l1.removeLast();
		l1.printList(head);
		l1.removeAt(2);
		l1.printList(head);
		l1.addFirst(10);
		l1.addAt(3, 40);
		l1.addLast(60);
		System.out.println("Formed linkedlist using insertion/deletion operatios");
		l1.printList(head);
		
		
		head = l1.reverseLinkedListIterative(head);
		System.out.println("Reversing a linkedlist iteratively : ");
		l1.printList(head);
		
		head = l1.reverseLinkedListRecursive(head);
		System.out.println("Reversing a linkedlist recursively : ");
		l1.printList(head);
		
		head = l1.reverseLinkedListInGroup(head, 2);
		System.out.println("Reversing a linkedlist in a group of 2 : ");
		l1.printList(head);
		
		head = l1.reverseLinkedListInGroup(head, 2);
		System.out.println("Reversing a linkedlist again in a group of 2 : ");
		l1.printList(head);
		
		System.out.println("Displaying a linkedlist in a reverse : ");
		l1.displayReverse(head);
		System.out.println();
		
		System.out.println("Current LinkedList now : ");
		l1.printList(head);
		
		System.out.println("3rd Node from last : "+l1.kthNodeFromLast(head, 3));
		
		System.out.println("3rd Node from last using another approach : "+l1.kthNodeFromLastAnotherApproach(head, 3));
		
		l1.addAt(1, 20);
		l1.addAt(1, 20);
		l1.addAt(1, 20);
		l1.addAt(1, 20);
		l1.addAt(8, 50);
		System.out.println("After adding duplicates to LinkedList : ");
		l1.printList(head);
		
		System.out.println("After removing duplicates from LinkedList : ");
		l1.removeDuplicatesFromSortedList(head);
		l1.printList(head);
		
		System.out.println("Middle node of LinkedList is : "+l1.middleNode(head).data);
		l1.addLast(70);
		l1.printList(head);
		System.out.println("Middle node of LinkedList is : "+l1.middleNode(head).data);
		
		l1.addLast(60);
		l1.addLast(50);
		l1.addLast(40);
		l1.addLast(30);		
		l1.addLast(20);
		l1.addLast(10);
		System.out.println("Made LinkedList palindrome : ");
		l1.printList(head);
		System.out.println("Given LinkedList is palindrome : "+l1.isPalindrome(head));
		l1.printList(head);
		System.out.println("Fold/ReArrange/ZigZag a linkedlist : ");
		l1.foldZigZagReArrangeLL(head);
		l1.printList(head);
		l1.removeAt(1);
		l1.removeAt(2);
		l1.removeAt(3);
		l1.addLast(50);
		l1.addLast(60);
		System.out.println("Formed a proper linkedlist again : ");
		l1.printList(head);
		System.out.println("Segregate Odd - even on the basis of node : ");
		head = l1.oddEvenOnTheBasisOfNode(head);
		l1.printList(head);
		int size = l1.size(head);
		for(int i=0; i< size; i++) {
			l1.removeLast();
		}
		l1.printList(head);
		l1.removeFirst();
		l1.printList(head);
		l1.addLast(17);
		l1.addLast(15);
		l1.addLast(8);
		l1.addLast(12);
		l1.addLast(10);
		l1.addLast(5);
		l1.addLast(4);
		l1.addLast(1);
		l1.addLast(7);
		l1.addLast(6);
		System.out.println("Formed a new LinkedList again : ");
		l1.printList(head);
		System.out.println("Segregated LinkedList Even Odd on the basis of values : ");
		head = l1.oddEvenOnTheBasisOfValues(head);
		l1.printList(head);
		System.out.println("Merge sort a Linkedlist : ");
		head = l1.mergeSort(head);
		l1.printList(head);
		
	}

}
