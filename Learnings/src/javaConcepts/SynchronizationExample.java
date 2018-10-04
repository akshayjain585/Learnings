/*
 * If you have to synchronize the whole method, you should use synchronized method. For synchronizing a part of method, you should use synchronized block.
These two cases are used for lock on instance i.e. if there are two instances, there will be two locks. There can be context switching between the threads working on different objects.
In case of static synchronization, lock doesn't belongs to instance rather class. So if there are multiple threads working on different objects, there will not be context switching (i.e. at a time only thread will be executed). 
 */

package javaConcepts;

public class SynchronizationExample {
	
	public synchronized void lockedByThis(){
        System.out.println(" This synchronized method is locked by current instance of object i.e. this");
    }
 
    public static synchronized void lockedByClassLock(){
        System.out.println("This static synchronized method is locked by class level lock of this class i.e. SychronizationExample.class");

    }
 
    public void lockedBySynchronizedBlock(){
        System.out.println("This line is executed without locking");
     
        Object obj = String.class; //class level lock of String class
     
        synchronized(obj){
            System.out.println("synchronized block, locked by lock represented using obj variable");
        }
    }
     
}



