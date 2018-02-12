package designpatterns.creational.singleton;

/*
 * 
 *The easier way to create a thread-safe singleton class is to make the global access method synch, 
 *so that only one thread can execute this method at a time. 
 *It works fine and provides thread-safety but it reduces the performance 
 *because of cost associated with the synchronized method, 
 *although we need it only for the first few threads who might create the separate instances 
 *(Read: https://www.journaldev.com/1061/thread-safety-in-java). 
 *To avoid this extra overhead every time, double checked locking principle is used
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){
		System.out.println("thread safety singleton instance is created - " + instance);
    }
    
    public static ThreadSafeSingleton getInstance(){
    	if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    	
    }
}
