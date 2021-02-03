package linkedListDS;

import java.util.Stack;

public class PepCoding_LinkedList {
	
	public static class Node{
		// Linkedlist node has 2 parts: First is data and second is address which is of Node type
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static class LinkedList {
		// Taking below three data members required for linkedlist operations
		Node head;
		Node tail;
		int size;
		
/*
 * *******************************FUNCTIONS FOR ADDITION IN LINKEDLIST********************************************************************************************************************
*/
		
// Function to return the size
		public int size() {
			return size;
		}
		
/*
 * Approach : 
 * 1. Create a new Node. 
 * 2. New node's next should point to head of existing linkedlist. 
 * 3. Assign head to the newly created node.
 * Special Cases : If linkedlist is empty, assign head to the tail.		
 */
		// Function to add the Node at first in Linkedlist
		public void addFirst(int data) {
			Node new_Node = new Node(data);
			new_Node.next = head;
			head = new_Node;
			if(size==0) {
				tail = head;
			}
			size++;
		}
		
/*
 * Approach: 
 * 1. Create a new Node. 
 * 2. Tail's next should point to newNode. 
 * 3. New node should be assigned to tail.
 * Special Cases: If linkedlist is empty, the head, tail and newNode are same.		
 */
		
		// Function to add the Node in last in LinkedList
		public void addLast(int data) {
			Node newNode = new Node(data);
			if(size==0) {
				head = tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			size++;
		}
		
/*
 * Approach: 
 * 1. If index is 0, use addFirst() approach of linkedlist
 * 2. If index is equal to size of linkedlist, use addLast() appraoch of linkedlist
 * 3. Create a new node. Assign a temp head. Run a for loop till the previous element of index using temp. Assign New node's next to temp's next node and temp's next to new Node. (Hint : If you need to add the node at index 5 for example, then you need to come at index 4 to assign next. Then run the loop till index 3 as you assign node to its next node inside loop which means at index 3, the node will come to index 4.)
 * 4. Hint for running for loop : Always run the loop till 2 indexes lower as we always assign the node to its next address inside for loop.
 * 5. Special Cases : If index is negative integer or more than the size of linkedlist then print a error message.
 */
		
		// Function to add the node at particular index in Linkedlist
		public void addAt(int index, int data) {
			if(index<0 || index>size) {	
				System.out.println("Invalid index to add the node");
			}
			else if(index == 0) {
				addFirst(data);
			}
			else if(index == size) {
				addLast(data);
			}
			else {
				Node new_Node = new Node(data);
				Node temp = head;
/*
* 1. i<index-1 because we need the previous element so that we can point the next of previous element to new node.
* 2. The reason i is lesser than index-1 rather than i<=index-1 because temp=temp.next that means temp points to the next element already.
* 3. Will be able to solve doing practically for any doubts.
* 4. Hint : If you need to add the node at index 5 for example, then you need to come at index 4 to assign next. Then run the loop till index 3 as you assign node to its next node inside loop which means at index 3, the node will come to index 4.
*/				
				for(int i=0; i<index-1; i++) {
					temp = temp.next;
				}
				new_Node.next = temp.next;
				temp.next = new_Node;
				size++;
			}
			
		}

/*
 * **********************************FUNCTIONS FOR REMOVAL IN LINKEDLIST*****************************************************************************************************************
 */		

		
/*
 * Approach:
 * 1. Assign head to the head's next element.
 * Special Cases: 1. If size is 0, then list is empty. 2. If size is 1 means only one node is present, then assign head,tail to null. 		
 */
		// Function to remove first element from LinkedList
		public void removeFirst() {
			if(size==0) {
				System.out.println("Linked list is empty");
			}
			else if(size==1) {
				head = tail = null;
				size = 0;
			}
			else {
				head = head.next;
				size --;
			}
		}

/*
 * Approach
 * 1. Assign a temp head.
 * 2. Run a for loop till < (size-2) as i starts from 0 and size starts from 1 and as mentioned above, always run the loop till -2 index. Example to place/remove some value at index 5, run for loop till 3 index as 3 points to 4 inside for loop. 		
 * 3. Special Cases : 1. If size is 0, then list is empty. 2. If size is 1, then head,tail = null
 */
		
		// Function to remove last element in Linkedlist
		public void removeLast() {
			if(size==0) {
				System.out.println("List is empty");
			}
			else if(size==1) {
				head = tail = null;
			}
			else {
				Node temp = head;
/*
 * 1. i<size-2 because we need the second last element and size value starts at 1 and we are traversing through indexes
 * 2. The reason i is lesser than size-2 rather than i<=size-2 because temp=temp.next that means temp points to the next element already.
 * 3. Will be able to solve doing practically for any doubts.
 */
				for(int i=0; i<size-2; i++) {
					temp = temp.next;
				}
				tail = temp;
				temp.next=null;
				size--;				
			}
		}
		
/*
* Approach: 
* 1. If index is 0, use removeFirst() approach of linkedlist
* 2. If index is equal to (size-1) of linkedlist, use removeLast() approach of linkedlist
* 3. Create a new node. Assign a temp head. Run a for loop till the previous element of index using temp. Assign temp's next to temp's next's next. (Hint : If you need to add the node at index 5 for example, then you need to come at index 4 to assign next. Then run the loop till index 3 as you assign node to its next node inside loop which means at index 3, the node will come to index 4.)
* 4. Hint for running for loop : Always run the loop till 2 indexes lower as we always assign the node to its next address inside for loop.
* 5. Special Cases : If index is negative integer or more than the size of linkedlist then print a error message.
*/
		
		// Function to remove the node at particular index in Linkedlist
		public void removeAt(int index) {
			if(index<0 || index>=size) {
				System.out.println("Invalid index");
			}
			else if(index==0) {
				removeFirst();
			}
			else if(index==size-1) {
				removeLast();
			}
			else {
				Node temp = head;
				for(int i=0; i < index-1; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				size--;
			}
		}
		
/*
 * ***********************************FUNCTIONS FOR RETRIEVAL IN LINKEDLIST****************************************************************************************************************
*/		
		
/*
 * Approach:
 * 1. Return head's data.
 * Special Case: 1. If size is 0, then list is empty.		
 */
		
		// Function to return first element in Linkedlist
		public int getFirst() {
			if(size==0) {
				System.out.println("List is empty");
				return -1;
			}
			else {
				return head.data;
			}
		}
		
/*
 * Approach:
 * 1. Return tail's data
 * Special Case: If size is 0, then list is empty.		
 */
		
		// Function to return last element in Linkedlist
		public int getLast() {
			if(size==0) {
				System.out.println("List is empty");
				return -1;
			}
			else {
				return tail.data;
			}
		}
		
/*
 * Approach:
 * 1. Assign a temp head.
 * 2. Run a for loop till < (index) because we need to reach till index itself to retrieve index's data.
 * Special Case: 1. if size is o, then list is empty. 2. if index is negative or more than size of linkedlist then invalid index.		
 */
		
		// Function to return value using index
		public int getAt(int index) {
			if(size == 0) {
				System.out.println("List is empty");
				return -1;
			}
			// Less than 0 : To handle negative indexes
			// index>=size : To handle greater indexes then the size of linkedlist. '=' is used as indexes start from 0.
			else if(index<0 || index>=size) {
				System.out.println("Invalid index");
				return -1;
			}
			else {
				Node temp = head;
				for(int i=0; i<index; i++) {
					temp = temp.next;
				}
				return temp.data;
			}
			
		}
		
/*
***********************************FUNCTIONS FOR GENERIC OPERATIONS IN LINKEDLIST****************************************************************************************************************
*/				
		
		// Function to print the LinkedList
		public void printList() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+ " -> ");
				temp = temp.next;
			}
//			System.out.print("null");
			System.out.println();
		}
		
		// Function to return Node using index. Same function like above getAt. Instead of returning the data "temp.data", we return node itself which is "temp".
		public Node getNodeAt(int index) {
			if(size == 0) {
				System.out.println("List is empty");
				return null;
			}
			// Less than 0 : To handle negative indexes
			// index>=size : To handle greater indexes then the size of linkedlist. '=' is used as indexes start from 0.
			else if(index<0 || index>=size) {
				System.out.println("Invalid index");
				return null;
			}
			else {
				Node temp = head;
				for(int i=0; i<index; i++) {
					temp = temp.next;
				}
				return temp; 
			}
			
		}
		
/*
 * Approach:
 * 1. Take two pointers : one from start index (head) and the other from last index (tail).
 * 2. Get the node at left and right index using getNodeAt(). 
 * 3. Run a while loop till left index is lesser than right index, keep swapping the values.
 * 4. Increment left index and decrement right index till the condition is true inside while loop.		
 * Ex: 10 --> 20 --> 30 --> 40 --> 50 
 * Sol: 50 --> 40 --> 30 --> 20 --> 10	
 */
		
		// Function to reverse a linkedlist iterative
		public void reverseLinkedListData() {
			int leftIndex = 0;
			int rightIndex = size-1;
			
			while(leftIndex < rightIndex) {
				Node left = getNodeAt(leftIndex);
				Node right = getNodeAt(rightIndex);
				int temp = left.data;
				left.data = right.data;
				right.data = temp;
				
				leftIndex ++;
				rightIndex --;
			}
		}
		

		//Function to reverse a linkedlist : https://www.geeksforgeeks.org/reverse-a-linked-list/
		public Node reverseLLIterative(Node head) {
			if(head == null) {
				return head;
			}
			Node current = head;
			Node prev = null;
			Node next = null;
			
			while(current != null) {
				next = current.next;	// Setting the next to second node so that current can take this value.
				current.next = prev;	// Unlinking first's next to second node and assigning first's next to prev which is null
				prev = current;			// Now prev becomes the current node which is first
				current = next;			// Now current becomes the next node which is second node. Like this it will continue. Easy to do on paper if unable to understand.
			}
			head = prev;
			return head;
		}
		
		//Function to reverse linkedlist recursively : https://www.geeksforgeeks.org/reverse-a-linked-list/
		public Node reverseLLrecursilvely(Node head) {
			if(head == null || head.next == null) {
				return head;
			}
			Node temp = reverseLLrecursilvely(head.next);
			head.next.next = head;	// To point back to same node	// Here we fallback to second last node directly due to recursion as we return if head.next = null
			head.next = null;	// To unlink the previous link.
			return temp;
			
		}
		
		//Function to reverse linkedlist in a group of given size
		public Node reverseLLInGroup(Node head, int k) {
			Node current = head;
			Node prev = null;
			Node next = null;
			int count = 0;
			
			// Same as iterative reverse except using counter for K.
			while(count < k && current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
				count++;
			}
			
			// Now next becomes the K+1 pointer so need to reverse from there.
			while(next != null) {
				head.next = reverseLLInGroup(next, k);	// Using head.next as we need to linked the reversed linked list to next reverse as well.
			}
			
			return prev;	// This will be the head node.
		}
/*
 * Approach :
 * 1. Run a while loop till the size of given linkedlist is > than or equal to 0 and create a current list to perform the operations.
 * 2. If linkedlist size is greater than or equal to the given group number to be reversed at, run a loop till the group count and then perform the operations like getFirst() and then addFirst() (Using addFirst as we need to reverse).
 * 3. If linkedlist size is less than the given group number to be reversed at, run a loop till size of linkedlist and 	then perform the operations like getFirst() and then addLast() (Using addLast as we don't have to reverse if its less than the group count).	
 * 4. Create a linkedlist previous and assign it as null with below conditions.
 * 5. If previous is null (which it will be for the first time when for loop exits), assign current list to previous.
 * 6. Now that, previous list has some nodes in it, to keep the chain going, assign the previous's tail to current's head, previous's tail to be assigned as current's tail and previous's size will be incremented with current's size.
 */
		
		//Function to reverse the linkedlist in a group of K 
		// Example : 10,20,30,40,50,60,70,80,90,100,110 : Reverse in a group of 3. Ans : 30,20,10,60,50,40,90,80,70,100,110
		public void reverseLinkedListInGroup(int k, LinkedList l1) {
			LinkedList prev = null;
			while(l1.size>=0) {
				LinkedList current = new LinkedList();
				
				// If given linked list has actually more or equal number of elements to be revered in a group. Example : If list needs to be reversed in a group of 3, then linkedlist should have either 3 or more than that.
				if(l1.size>=k) {
					for(int i=0; i<k; i++) {
						int data = getFirst();
						removeFirst();
						// Adding first as we need to reverse the data.
						current.addFirst(data);					
					}
				} else {
					// This will handle the case when list doesn't have the remaining elements to be reversed in a group. Ex: In above list, 100 and 110 will be left out after reversing in a group of 3.
					int s = l1.size;
					for(int i=0; i<s; i++) {
						int data = getFirst();
						removeFirst();
						// Adding last as here we just have to add in last and not reverse.
						current.addLast(data);	
					}
				}
				
				if(prev == null) {
					// Store in prev list for the first time.
					prev = current;
				}else {
					// Assign the prev's tail to current's head to maintain the chain.
					prev.tail.next = current.head;
					// Update the tail using current's tail.
					prev.tail = current.tail;
					// Increment the prev size linkedlist.
					prev.size = prev.size + current.size;
				}
			}
		}
		
		
/*
 * Approach: 
 * 1. Using recursion, we are reaching till tail when node == null which is the base case.
 * 2. Flow -> Control comes at displayReverseHelper(head) first time in main function (displayReverse()), then it goes to helper function and continue till it reaches null and meets the base condition. After, this it starts printing the data in reverse.
 * 3. Then printing the data using node.data.	
 * example : (head)10 --> 20 --> 30 --> 40 -- > 50 --> null
 * sol: null <-- 50 <-- 40 <-- 30 <-- 20 <-- 10 (head)
 * 	
 */
		// Function helper to display linkedlist in reverse
		private void displayReverseHelper(Node node) {
			if(node == null) {
				return;
			}
			displayReverseHelper(node.next);
			System.out.println(node.data);
		}
		
		// Function to display linkedlinst in reverse
		public void displayReverse() {
			displayReverseHelper(head);
			System.out.println(" ");
		}
				
		
/*
 *  Approach:
 *  1. Same as above, first of all, we will reach to null and meet the base condition which is node == null.
 *  2. Now, while coming back, we need to change the address, means reverse the address. 
 *  example : (head)10 --> 20 --> 30 --> 40 -- > 50 --> null
 *  sol: null <-- 10 <-- 20 <-- 30 <-- 40 <-- 50 (head)
 *  
 */
		
		// Function helper to reverse the linkedlist with its addresses.
		private void reverseUsingPointerHelper(Node node) {
			if(node == null) {
				return;
			}
			reverseUsingPointerHelper(node.next);
			if(node == tail) {
				//nothing to do as when node is at tail which is at 50, we don't have to do anything
			}else {
				// Check above example to understand, when the node is 40, then 40's next's next should point to 40 only to reverse the direction.
				node.next.next = node;
			}
		}
		
		// Function to reverse the linkedlist with its addresses
		public void reverseUsingPointer() {
			reverseUsingPointerHelper(head);
			// After we change the direction, only thing left out is to swap the head and tail
			Node temp = head;
			head = tail;
			tail = temp;			
		}
		
		

/*
 * Approach:
 * Ex: 10 --> 20 --> 30 --> 40 --> 50 
 * Sol: 50 --> 40 --> 30 --> 20 --> 10	
 * 1. Same as above, first of all, we will reach to null and meet the base condition which is node == null.
 * 2. Now start checking the value of floor and size, and swap the values from left index to right index as left is set at head and right is at tail, thus, floor value is 4 and size is 5 so 4>=2, therefore swapping will happen between left and right index.
 * 3. Now we are explicitly moving left to its next and right will fall due to recursion. Odd and even linkedlist will be handled using floor parameter.
 *	Similar function using iterative is written above reverseLinkedListData()
 */
		
		
		// Function helper to reverse linkedlist data 
		// floor is more like index to handle the middle element as we want to stop swapping element when we are at middle node and used "=" between floor >= size/2 to handle the even nodes linkedlist
		private void reverseLLDataRecursiveHelper(Node right, int floor) {
			if(right == null) {
				return;
			}
			reverseLLDataRecursiveHelper(right.next, floor+1);
			if(floor >= size/2) {
				int temp = right.data;
				right.data = rleft.data;
				rleft.data = temp;
			}
		}
		
		// Function to reverse linkedlist data
		// Taken one node left at heap level as declared outside the function
		Node rleft;
		public void reverseLLDataRecursive() {
			rleft = head;
			reverseLLDataRecursiveHelper(head,0);
		}
		
		

		
/*
 * Approach :
 * 1. Declare one left node outside the function as global variable as its required in both the functions, where recursion method is called and recursion helper function.
 * 2. Assign head to left node and call recursive function with head and floor value (floor to handle middle element).
 * 3. Using recursion, node will reach to null and return true in res variable.
 * 4. Logic to check if left's node data is not equal to right's node data then return res as false.
 * 5. If it passes this condition as well then increment left node to its next and return true to keep checking the remaining elements by comparing both left node to its corresponding right node.
 * 		
 */
		
		// Function to identify if linkedlist is palindrome
		public boolean isLLPalindromeHelper(Node right, int floor) {
			// Once node reaches null, return true so that you are on tail element and leftNode is at head only and then you can compare the nodes between left and right using below logic.
			if(right == null) {
				return true;
			}
			// recursive function with next in each node and index value as floor getting incremented till node reaches null.
			boolean res = isLLPalindromeHelper(right.next, floor+1);
			
			// This condition is to check if extremes of linkedlist that means result of Left and right node are same or not, if not same means if res == false then no point in checking the further nodes.
			if(res == false) {
				return false;
				// If left node data is not equal to right node then return false
			} else if (leftNode.data != right.data) {
				return false;
			} else {
				// Move left node to its next explicitly before returning true and right will fall back to its previous node due to recursion
				leftNode = leftNode.next;
				return true;
			}
		}
		
		// Declared leftNode at the heap level outside the function as it is required to be used inside both the function, below and above helper function.
		Node leftNode;
		public boolean isLLPalindrome() {
			// Assigned head to one left node declared outside the function in heap in summary object where (head, tail, size are defined of linkedlist)
			leftNode = head;
			// Call recursive function from here passing leftNode as head and floor value to handle the middle element as we don't want to compare the element reaching middle.
			return isLLPalindromeHelper(head,0);
		}
		
		
		// Function to identify if LL is palindrome using Stack. Time & Space : O(n) : Taken this one to learn.
		public static boolean isLinkedListPalindrome(Node head) {
			if(head == null || head.next == null) {
				return true;
			}
			Stack<Integer> st = new Stack<>();
			Node current = head;
			Node secondHead = head;
			while(current != null) {
				st.push(current.data);
				current = current.next;
			}
			
			while(secondHead != null) {
				int lastNodeData = st.pop();
				if(secondHead.data != lastNodeData) {
					return false;
				}
				secondHead = secondHead.next;
			}
			return true;
		}
		
		
		public Node middleElementRearrangeHelper(Node head) {
			Node slow_p = head;
			Node fast_p = head;
			
			// fast_p.next!=null for odd and fast_p.next.next!=null is for even linkedlist
			// Reason fast_p.next!= null is for odd as in case of odd, fast_p will reach to last node as we start from 1st node as head and then it goes like 1 to 3 to 5.
			// Reason fast_p.next.next!= null is for even as in case of even, by the time fast_p will reach second last node fast_p.next.next will become null. like 1,3,5 and we will be left with one node.
			while(fast_p.next!=null && fast_p.next.next!=null) {
				slow_p = slow_p.next;
				fast_p = fast_p.next.next;
			}
			return slow_p;
		}
		
		// Function to rearrange/zigzag/fold a linkedlist. ref : https://www.youtube.com/watch?v=Igz8MFaO4nc
		// helper function required : Fn which returns the middle node and reverse the linkedlist.
		// Approach : Find out the middle Node, spplit the linkedlist into 2, reverse the second half. Merge both the linkedlist alternatively.
		public void foldOrZigZagOrRearrangeLL(Node head) {
			if(head == null || head.next == null || head.next.next == null) {	// Base condition as in all these cases, there won't be any change
				return;
			}
			
			//Take the middle Node
			Node middleNode = middleElementRearrangeHelper(head);
			Node secondList = middleNode.next;	// This will be the second list as first list would include the middle node as well.
			middleNode.next = null;		// Breaking the link from middle node to second half of list.
			Node firstList = head;
			
			// Create a dummy node to merge both the nodes from splitted linkedlist
			Node finalList = new Node(0);
			Node current = finalList;	// Taken current again as we need to point the finalList to the head of merged linkedlist.
			
			while(firstList != null || secondList != null) {
				if(firstList != null) {
					current.next = firstList;	// Linking to first node of firstList
					current = current.next;	// Moving the current counter to firstNode
					firstList = firstList.next;	// Moving the firstList
				}
				if(secondList != null) {
					current.next = secondList;	// Linking the second node to first node
					current = current.next;
					secondList = secondList.next;
				}
			}
			finalList = finalList.next;		// Pointing to head of mergedLinkedList
		}

		
		
/*
 * Ques : 10 --> 20 --> 30 --> 40 --> 50 (Fold a linkedlist)
 * Sol : 10 --> 50 --> 20 --> 40 --> 30 (First should point to last, last should point to second node, second should point to second last, second last should point to third node )
 * Approach :
 * 1. Declare one left node outside the function as global variable as its required in both the functions, where recursion method is called and recursion helper function.  
 * 2. Assign head to left node and call recursive function with head and floor value (floor to handle middle element and when it reaches middle element then we need to assign tail.next to null).	
 * 3. Now, the logic is to store left's next in one temp variable.
 * 4. As, we need to assign left's next to right node as first step
 * 5. Then, right's next to left's next which is stored in temp.
 * 6. Now, increment left node to its next node which is stored in temp.	
 */
		
		// Helper function to fold a linkedlist
		public void foldLLHelper(Node right, int floor) {
			// Once node reaches null, return so that you are on tail element and leftNode is at head only and right node is at last node which is tail.
			if(right == null) {
				return;
			}
			// recursive function with next in each node and index value as floor getting incremented till node reaches null.
			foldLLHelper(right.next, floor+1);
			
			// To handle the middle element
			if (floor > size/2) {
				// Store left's next node in temp.
				Node temp = foldLeft.next;
				// First node pointing to last node here
				foldLeft.next = right;
				// Last node pointing to second node which left.next
				right.next = temp;
				// Incrementing left to left.next using temp variable
				foldLeft = temp;
			} else if (floor == size/2) {
				// when you are at middle element means both left and right are at same element, then assign tail to that element.
				tail = right;
				// Assign tail's next to null.
				tail.next = null;
			}			
		}
				
		// Function to fold a linkedlist. Same as above isLLPalindrome()
		Node foldLeft;
		public void foldLL() {
			foldLeft = head;
			foldLLHelper(foldLeft, 0);
		}
		

		
/*
 * Approach: ex: First : 9,9,9,6 AND Second: 7,8 AND SOL: 1, 0, 0, 7, 4
 * 1. The trick here is to use the previous recursion approach like palindrome, fold, datarecurive and reach till null of both the linkedlist to meet base condition.
 * 2. Once, you meet the base condition means when both the linkedlist are at null, return carry as 0.
 * 3. Write the code to take the number to be added using mod and carry using divide.
 * 4. Mod to be added in linkedlist using addFirst() and carry will be returned to use in recursion call backs
 * 5. Once, the recursion calls are over and in case carry is returned then handle it in main function using condition if (carry>0) and addFirst. Like carry will be left out in above example and there will be no nodes left out in first and second linkedlist.	
 */
		
		
		// Function helper to add two linkedlist
		public int addTwoLLHelper(Node one, int oneSize, Node two, int twoSize, LinkedList res) {
			
			
			// Initially the sum data is 0
			int data = 0;
			
			// First linkedlist is bigger than second one. Ex: 8, 9, 7, 6 and 8,9. Then we need to move the head of first linkedlist to its next continuously and reduce the size of first linkedlist until it reaches null to meet the base condition of one == null as the carry is 0 initially and the addition will start from tail itself.
			if(oneSize > twoSize) {
				int carry = addTwoLLHelper(one.next, oneSize-1, two, twoSize, res);
				
				// As in the above example, one linkedlist is bigger in size so after adding 6 to 9 and 7 to 8, then carry needs to be added with 9 and then carry needs to be added with 8
				data = one.data + carry;
			} 
			
			// If second linkedlist is bigger than first one. Ex: 8, 9 and 8, 9, 8, 9. Then we need to move the head of second linkedlist to its next continuously and reduce the size of second linkedlist until it reaches null to meet the base condition of two == null as the carry is 0 (to be returned) initially and the addition will start from tail itself.
			else if (oneSize < twoSize) {
				int carry = addTwoLLHelper(one, oneSize, two.next, twoSize-1, res);
				
				// After adding the elements from last and returning carry, some elements will be left out only in second list, then in that carry will be added like above.
				data = two.data + carry;
			}
			
			// when both linkedlist are of equal size, then move to last element till they reach null, meets base condition and to return 0 in carry.
			else {
				int carry = addTwoLLHelper(one.next, oneSize-1, two.next, twoSize-1, res);
				
				// Sum of both the nodes of linkedlist
				data = one.data + two.data + carry;
			}
			
			// Logic to get the carry
			
			// Will get the number to be added using mod operator
			int number = data % 10;		//Ex: for 15, 15%10 : 5 remainder will be added in linkedlist
			int numberCarry = data/10;	// Ex: for 15, 15/10 : 1 will be taken as carry and returned
			
			// addFirst as we need to go in backward direction to add the numbers
			res.addFirst(number);
			
			// Return the carry.
			return numberCarry;
		}
		
		
		
		// Function to add two linkedlist
		public LinkedList addTwoLL(LinkedList l1, LinkedList l2) {
			LinkedList res = new LinkedList();
			
			int carry = addTwoLLHelper(l1.head, l1.size, l2.head, l2.size, res);
			if(carry > 0) {
				res.addLast(carry);
			}
			return res;
		}
		
		
		

/*
 * Approach:
 * 1. Take two pointers slow_p, fast_p and assign head to them.
 * 2. Run the fast pointer till kth element index. (Lets say, we have a linkedlist of 8 nodes (7 indexes) and we need to return 5th index from last which means its index 2 which we have to return from head)		
 * 3. Run the while loop for fast pointer till it reaches tail and increment both the pointer inside loop. When the confition exits, return slow pointer's data.
 */
		
		// Function to return Kth element from last without using size function in iterative manner
		// 10 --> 20 --> 30 --> 40 --> 50 --> 60. Now if k=2 that means we should return 40, for k=0, 60, k=1,50
		public int kthFromLast(int k) {
			Node slow_p = head;
			Node fast_p = head;
			
			// Moving the fast_p with i<k so that the difference between slow_p and fast_p will be of that kth element and return slow_p data once fast_p reaches tail.
			for(int i=0; i<k; i++) {
				fast_p = fast_p.next;
			}
			
			while(fast_p!=tail) {
				slow_p = slow_p.next;
				fast_p = fast_p.next;
			}
			return slow_p.data;
		}
		
		// Another approach of above function with base case handled, when size is not given
		public int kTHFromLast(Node head, int k) {
			if(head == null) {
				return -1;
			}
			Node current = head;
			int size = 0;
			while(current != null) {
				current = current.next;
				size ++;
			}
			
			if(size < k) {
				return -1;
			}
			current = head;	// Again pointed current to head as we need to traverse the list again.
			
			for(int i=0; i<size - k; i++) {
				current = current.next;
			}
			return current.data;			
		}
		
/*
 * Approach:
 * 1. Take two pointers as slow and fast and start them with head.
 * 2. Run the while loop till fast pointer's next reaches to null and fast pointer's next to next reaches null.
 * 3. Return the slow pointers data.		
 */
		
		// Function to return middle element of LinkedList for both odd and even nodes. For odd, its identifiable but for even nodes, return last element of first half
		// 10 -->20 --> 30 --> 40. Result : 20 (Last element of first half) && 10->20->30->40->50. Result : 30
		public int middleElement() {
			Node slow_p = head;
			Node fast_p = head;
			
			// fast_p.next!=null for odd and fast_p.next.next!=null is for even linkedlist
			// Reason fast_p.next!= null is for odd as in case of odd, fast_p will reach to last node as we start from 1st node as head and then it goes like 1 to 3 to 5.
			// Reason fast_p.next.next!= null is for even as in case of even, by the time fast_p will reach second last node fast_p.next.next will become null. like 1,3,5 and we will be left with one node.
			while(fast_p.next!=null && fast_p.next.next!=null) {
				slow_p = slow_p.next;
				fast_p = fast_p.next.next;
			}
			return slow_p.data;
		}
		
/*
 * Approach:
 * 1. Create a new result linkedlist where you will merge two given sorted linkedlist.
 * 2. Keep two pointers at head on both of the linked list
 * 3. Run a while loop till either first or second linkedlist node's next reaches to null.
 * 4. Mention the condition inside loop : If first linkedlist node's data is smaller than  add it in result's linkdlist using addLast()	function.
 * 5. Similarly, If second linkedlist node's data is smaller than  add it in result's linkdlist using addLast() function.
 * 6. At one instance one of the linkedlist node's next reaches to null if both given linkedlist is not of same size, so add the remaining data to sorted resulted linkedlist	
 */
		
		// Function to merge two sorted linkedlist. Example: l1 = 10->20->30->40->50, l2= 7->15->25->35->45>55->65->75
		// Result : 7 -> 10 -> 15 -> 20 -> 25 -> 30 -> 35 -> 40 -> 45 -> 50 -> 55 ->65 ->75
		public LinkedList mergeTwoSortedLL(LinkedList l1, LinkedList l2) {
			LinkedList res = new LinkedList();
			
			// Keep two pointers at head on both of the linked list
			Node one = l1.head;
			Node two = l2.head;
			
			// Run a loop till either first or second linkedlist node's next reaches to null
			while(one.next!=null && two.next!=null) {
				
				// If first linkedlist node's data is smaller than  add it in result's linkdlist using addLast()
				if(one.data < two.data) {
					res.addLast(one.data);
				}
				else {
					// If second linkedlist node's data is smaller than  add it in result's linkdlist using addLast()
					res.addLast(two.data);
				}
			}
			
			// At one instance one of the linkedlist node's next reaches to null so add the remaining data to sorted resulted linkedlist
			while(one.next!=null) {
				res.addLast(one.data);
			}
			
			// At one instance one of the linkedlist node's next reaches to null so add the remaining data to sorted resulted linkedlist
			while(two.next!=null) {
				res.addLast(two.data);
			}
			
			return res;
		}

		
		
		// Function to return middle element of LinkedList for both odd and even nodes. For odd, its identifiable but for even nodes, return last element of first half
		// 10 -->20 --> 30 --> 40. Result : 20 (Last element of first half) && 10->20->30->40->50. Result : 30
		public Node middleElemenNodeAt(Node head, Node tail) {
			Node slow_p = head;
			Node fast_p = head;
			
			// fast_p.next!=null for odd and fast_p.next.next!=null is for even linkedlist
			while(fast_p.next!=null && fast_p.next.next!=null) {
				slow_p = slow_p.next;
				fast_p = fast_p.next.next;
			}
			return slow_p;	//Same function like above middle element, instead of returning the data, returning the node
		}
		
		// Function to merge sort a linkedlist
		//20->10->90->15->40->25->5. Result : 5->10->15->25->40->90
		public LinkedList mergeSort(Node head, Node tail) {
			// Base condition when head == tail after only one element is left out taking mid element continuously
			if(head == tail) {
				LinkedList baseResult = new LinkedList();
				baseResult.addLast(head.data);
				return baseResult;
			}
			
			// Take the mid node of list first			
			Node mid = middleElemenNodeAt(head, tail);
			LinkedList firstSortedList = mergeSort(head, mid);
			LinkedList secondSortedList = mergeSort(mid.next, tail);
			LinkedList res = mergeTwoSortedLL(firstSortedList, secondSortedList);
			return res;
		}
		
		//Function for mergedSort Linkedlist : https://www.geeksforgeeks.org/merge-sort-for-linked-list/
		public Node mergeSortLL(Node head) {
			if(head == null || head.next == null) {
				return head;
			}
			Node middle = middleElemenNodeAt(head, tail);	// Here we can avoid tail as well writing separate method which takes only head
			Node left = head;
			Node right = middle.next;
			middle.next = null;	// To unlink and split the LL
			
			Node firstHalf = mergeSortLL(left);
			Node secondHalf = mergeSortLL(right);
//			LinkedList sortedlist = mergeTwoSortedLL(firstHalf,secondHalf);		// Commented the code because the method return type is not as per this function. Else code is fine.
//			return sortedList;	
			return head;	// Just for code compilation, not required.
		}
		
		
/*
 * Approach:
 * 1. Create one linkedlist and then retrieve and remove first element from given linkedlist till size is > than 0.
 * 2. Add removed element from given linkedlist to new linkedlist using addLast() only when if either new linkedlist tail's data is not equal to removed element (as list is sorted so it could only be 1,2,2,3,4,4) or if new linkedlist size is 0 to add first element.
 */
		// Function to remove duplicates in sorted linkedlist
		// Solution : Create one linkedlist and remove first element from given linkedlist. Add removed element from given linkedlist to new linkedlist using addLast() only when new linkedlist tail's data is not equal to removed element.
		public LinkedList removeDuplicates(LinkedList l1) {
			LinkedList result = new LinkedList();
			
			while(l1.size >0) {
				int data = l1.getFirst();
				l1.removeFirst();
				
				if(result.size==0 || result.tail.data!=data) {
					result.addLast(data);
				}
			}
			return result;
		}
		
// Alternative approach for removing duplicates in a sorted linkedlist (This approach is better)
		
		public Node removeDuplicatesSortedLL(Node head) {
	            Node current = head;
	    while (current != null && current.next != null) {
	        if (current.next.data == current.data) {
	            current.next = current.next.next;
	        } else {
	            current = current.next;
	        }
	    }
	    return head;
	    }
		

		
/*
 * Approach	:
 * 1. Create two linkedlist for odd and even, and then retrieve and remove first element from given linkedlist till size is > than 0.
 * 2. If retrieved data mod by 2 is equal to 0, then addLast() function in even linkedlist else addLast() in odd linedlist.
 * 3. If list had both odd and even elements, then assign the tail of odd linkedlist to head of even linkedlist to make it one.
 * 4. If only odd elements are present then odd tail should should be the tail of given linkedlist
 * 5. If only even elements are present then even tail should should be the tail of given linkedlist	
 */
		
		// Function to return oddEven list from LinkedList without changing the sequence.
		// Ex: 2->5->6->1->10->3. Result : 5->1->3->2->6->10
		public void oddEven(LinkedList l1) {
			LinkedList odd = new LinkedList();
			LinkedList even = new LinkedList();
			
			while(l1.size>0) {
				int val = l1.getFirst();
				l1.removeFirst();
				
				if(val %2 == 0) {
					even.addLast(val);
				}else {
					odd.addLast(val);
				}
			}
			
			// When both odd and even elements are present
			if(odd.size>0 && even.size >0) {
				odd.tail.next = even.head;	
			}
			else if(odd.size>0) {
				odd.tail = l1.tail;
			}
			else if(even.size>0) {
				even.tail = l1.tail;
			}
		}
		
//https://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/ : For Odd and Even
		
		// Function to segregate odd even on the basis of node number and not the values. So, first node is always odd in terms of node no, second is even and so on.
//		Input: 1->2->3->4->5->NULL	ref : https://leetcode.com/problems/odd-even-linked-list/
//		Output: 1->3->5->2->4->NULL
		// Time: O(n) and Space : O(1)
		public Node oddEvenLeetCode(Node head) {
			Node oddNode = head;
			Node evenNode = head.next;	// 1st node is odd and second is even and so on
			Node evenHead = evenNode;	//Keeping this separate to link oddLast to evenFirst
			
			while(evenNode != null && evenNode.next != null) {
				oddNode.next = evenNode.next;
				oddNode = oddNode.next;
				evenNode.next = oddNode.next;
				evenNode = evenNode.next;
			}
			
			oddNode.next = evenHead;	// Linking the end of Odd Node to first even Node.
			return head;
		}
		
		
		// Segregate odd and even on the basis of values. ref : https://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/
		// Problem : All even followed by all odd in the list.
		// Time : O(n) and Space : O(1)
		public void segregateOddEven(Node head) {
			Node evenStart = null;
			Node evenEnd = null;
			Node oddStart = null;
			Node oddEnd = null;
			Node current = head;
			
			while(current != null) {
				int data = current.data;
				if(data % 2 == 0) {
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
				
				if(oddStart == null || evenStart == null) {
					return;
				}
				
				evenEnd.next = oddStart;
				oddEnd.next = null;
				head = evenStart;
			}
		}
		
/*
 * Approach:
 * 1. Set pointers at head for both the list. 
 * 2. Find the difference in size between both the list as after intersection point, the number of nodes are same. 
 * 3. After getting the diff in size, increase the pointer of higher size linkedlist till that difference so that both are at same point and reaches the intersection point together. 
 * 4. Return the data when both nodes are equal. 		
 */
		
		// Function to find the intersection point of two linked list
		// Approach : Set pointers at head for both the list. Find the difference in size between both the list as after intersection point, the number of nodes are same. After getting the diff in size, increase the pointer of higher size linkedlist till that difference so that both are at same point and reaches the intersection point together. Return the data when both nodes are equal. 
		public int intersectionLinkedlist(LinkedList l1, LinkedList l2) {
			
			// Set the pointers at head for both the LinkedList.
			Node t1 = l1.head;
			Node t2 = l2.head;
			
			// Find the delta between both the linkedlist. Idea is to get the difference in size till the intersection point.
			int delta = Math.abs(l1.size - l2.size);
			// If l1 is higher in size say n times, increase the l1 pointer till n times so that the journey till intersection point becomes equal with the other linkedlist as well.
			if(l1.size > l2.size) {
				for(int i=0; i<delta; i++) {
					t1 = t1.next;
				}
			}else {
				for(int i=0; i<delta; i++) {
					t2 = t2.next;
				}
			}
			
			// Code will come here when both the nodes are at same distance from the intersection point
			while(t1!=t2) {
				t1 = t1.next;
				t2 = t2.next;
			}			
			return t1.data;			
			
		}
		
		// Same function like above when size needs to be calculated
		public int intersectionLL(Node head1, Node head2) {
			Node firstList = head1;
			Node secondList = head2;
			int firstListSize = 0;
			int secondListSize = 0;
			
			while(firstList != null) {
				firstList = firstList.next;
				firstListSize ++;
			}
			
			while(secondList != null) {
				secondList = secondList.next;
				secondListSize ++;
			}
			
			int delta = Math.abs(firstListSize - secondListSize);
			firstList = head1;
			secondList = head2;
			
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
		
/*
***********************************FUNCTIONS FOR  IN LINKEDLIST****************************************************************************************************************
*/	
		public static void main(String[] args) {
			LinkedList ll = new LinkedList();
			ll.head = new Node(10);
			Node second = new Node(20);
			Node third = new Node(30);
			Node fourth = new Node(40);
			Node fifth = new Node(50);
			
			ll.head.next = second;
			second.next = third;
			third.next = fourth;
			fourth.next = fifth;
			
			// Printing linkedlist
			ll.printList();
			ll.reverseLinkedListData();
			ll.printList();
				
			
		}
		
	}
}

