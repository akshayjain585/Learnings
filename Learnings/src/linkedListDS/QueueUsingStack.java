package linkedListDS;

/*
 * 1. Take 2 stacks
 * 2. Enqueue : Push the new element always in Stack1
 * 3. Dequeue : Pop all elements from Stack1, push in Stack2 and then pop the element from Stack2.
 * 
 */

public class QueueUsingStack {
	
	Stack s1;
	Stack s2;
	
	public void enqueue(int data){
		s1.push(data);
	}
	
	public int dequeue(){
		if(s1.isEmpty() && s2.isEmpty()){
			System.out.println("Underflow");
			return -1;
		}
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
