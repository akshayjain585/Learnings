package linkedListDS;

public class Queue {
	
	final int max = 5;
	int front;
	int rear;
	int size;
	int[] queue = new int[max];
	
	public void enqueue(int data){
		if(size<max){
			queue[rear] = data;
			rear = (rear+1)%max;
			size++;
		}else{
			System.out.println("Queue is full");
		}
		
	}
	
	public int dequeue(){
		if(size>=0){
			int data = queue[front];
			front = (front+1)%max;
			size--;
			return data;
		}
		return -1;
		
	}
	
	public void show(){
		for(int i=0; i<size; i++){
			System.out.print(queue[(front+i)%max]+" ");
		}
		System.out.println();
		
		for(int n : queue){
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.dequeue());
		q.show();
		q.enqueue(50);
		System.out.println();
		q.show();
		q.enqueue(60);
		q.enqueue(70);
	
		

	}

}
