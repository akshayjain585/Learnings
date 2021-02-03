package pepCoding.StacksQueues;

public class ExampleQueue {
	
	public static class CustomQueue {
		
		int[] queue;
		int front;
		int size;
		
		public CustomQueue(int capacity) {
			queue = new int[capacity];
			front = 0;
			size = 0;
		}
		
		// Add function for normal queue
		public void add(int data) {
			// If array is full then queue overflow.
			if(size == queue.length) {
				System.out.println("Queue overflow");
			} else {
				// Rear = 0 + 0, thus element would get added at queue[0] = data; and size will be incremented so size = 0+1 = 1
				int rear = (front + size) % queue.length;	// Added modulus because there could be a scenario when front is at middle and elements got removed earlier so we have empty space in starting as it queue will behave like circular array only.						
				queue[rear] = data;
				size++;
			}
		}
		
		// Add function for dynamic queue like stack in earlier program to avoid queue overflow condition and always add
		public void dynamicAdd(int data) {
			// If array is full then queue overflow.
			if(size == queue.length) {
				int[] newQueue = new int[2*(queue.length)];
				for(int i=0; i<size; i++) {
					int idx = (front+i) % queue.length;
					newQueue[i] = queue[idx];
				}
				queue = newQueue;
				front = 0;
				int rear = (front+size) % queue.length;
				queue[rear] = data;
				size++;
			} else {
				// Rear = 0 + 0, thus element would get added at queue[0] = data; and size will be incremented so size = 0+1 = 1
				int rear = (front + size) % queue.length;	// Added modulus because there could be a scenario when front is at middle and elements got removed earlier so we have empty space in starting as it queue will behave like circular array only.						
				queue[rear] = data;
				size++;
			}
		}
		
		public int remove() {
			if(size == 0) {
				System.out.println("Queue underflow");
				return -1;
			}else {
				int data = queue[front];
				// Increment the front and reduce the size
				front = (front+1) % queue.length; 	// Added modulus, as front also needs to come in starting when list becomes circular. When all elements are removed and array becomes empty in starting. 
				size--;
				return data;
			}			
		}
		
		public int peek() {
			if(size == 0) {
				System.out.println("Queue underflow");
				return -1;
			} else {
				// No need to change the front and size as we are just returning not removing.
				int data = queue[front];
				return data;
			}
		}
		
		public void display() {
			for(int i=0; i<size; i++) {
				int idx = (front+i) % queue.length; // To handle the circular logic of array
				System.out.print(queue[idx]+" , ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		CustomQueue q1 = new CustomQueue(4);
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		System.out.println("Queue size is => "+q1.size);
		q1.display();
		q1.remove();
		q1.remove();
		System.out.println("Queue size is => "+q1.size);
		q1.display();
		System.out.println(q1.front+" , "+q1.size); // At this position front is at 2 and size is also 2, so element would be inserted using circular using modulus in starting.
		q1.add(50);
		q1.add(60);
		q1.add(70);
		System.out.println("Queue size is => "+q1.size);
		q1.display();
		q1.dynamicAdd(70);
		System.out.println("Queue size is => "+q1.size);
		q1.display();
	}

}
