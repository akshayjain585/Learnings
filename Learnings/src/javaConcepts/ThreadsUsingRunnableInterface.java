/*
 * Two ways to create a thread :
 * 1. Using Runnable Interface
 * 2. Using Thread Class
 * 
 * Procedure:
 * 1. Create an object of Thread class as shown below in main method.
 * 2. Pass the object of the class in Thread's constructor which implements Runnable interface.
 * 3. Define the abstract run() method of Runnable interface which runs the thread.
 * 4. Call the start() method of Thread class which automatically invokes the run() method.
 * 
 * Priority of Thread :
 * 1. Ranges from (1-10) with 1 being Minimum and 10 being Maximum 
 * 2. By Default priority of thread is 5(Normal Priority)
 * 3. Using t1.setPriority(10); //Setting the priority number to 10 which is maximum
 */
package javaConcepts;

class AB implements Runnable{
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println("Thread A "+i);
		}
	}
}

class BC implements Runnable{
	
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println("Thread B "+i);
		}
	}
}

public class ThreadsUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new AB());
		Thread t2 = new Thread(new BC());
		t1.start();
		t2.start();

	}

}
