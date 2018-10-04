/*
 * Procedure to create a thread using Thread class is using Inheritance
 * 1. Extend the Thread class and override the Thread's class run() method where thread needs to be run.
 * 2. Create an object of child class which has extended Thread class and call start() method of Thread parent class which automatically invokes run() method.
 * 3. Thread class also has run() method like Runnable interface which has abstract run() method.
 * 
 * Note : Always better to use Runnable interface to create a thread since user has an option to have one parent class and implement runnable interface at same time.
 * However, in case of creating extending thread using Thread class, Thread remains as a parent class which is a drawback. 
 * 
 * Thread LifeCycle : 
 * 1. New : When thread is created
 * 2. Runnable : When thread's start() method is called
 * 3. Non-Runnable : When other thread is running or any method like Thread.sleep(), Thread.wait(), Thread.suspend() is called
 * 4. Dead : When thread's run() method is completed or Thread.stop() method is called or any exception occurs.
 * 
 * Note : From Non Runnable to Runnable state
 * 1. Thread.wait() : Thread.notify() and Thread.notifyAll()
 * 2. Thread.suspend() : Thread.resume()
 * 3. Thread.sleep()
 */
package javaConcepts;

class FirstClass extends Thread{
	
	public void run(){
		
		for(int i=0; i<=10; i++){
			System.out.println("Thread A "+i);
		}
	}
}

class SecondClass extends Thread{
	
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println("Thread B "+i);
		}
	}
}

public class ThreadUsingThreadsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstClass a = new FirstClass();
		SecondClass b = new SecondClass();
		a.start();
		b.start();

	}

}
