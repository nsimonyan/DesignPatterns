package designpatterns.creational.singleton;

/*
 * Prior to Java 5, java memory model had a lot of issues and above approaches used to fail in
 * certain scenarios where too many threads try to get the instance of the Singleton class 
 * simultaneously. Bill Pugh came up with a different approach to create the Singleton class 
 * using a inner static helper class
 * Notice the private inner static class that contains the instance of the singleton class. 
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory 
 * and only when someone calls the getInstance method, this class gets loaded and 
 * creates the Singleton class instance.
 * This is the most widely used approach for Singleton class as it doesn’t require synch
 * The JLS guarantees that a class is only loaded when it's used for the first time 
 * (making the singleton initialization lazy),
 * and the class loading is thread-safe as the first time getInstance() is called,
 * the JVM will hold the holder class. If another thread calls getInstance() concurrently, 
 * the JVM won't load the holder class a second time: 
 * it will wait for the first thread to have completed the class loading, 
 * and at the end of the loading and initialization of the holder class, 
 * both thread will see the holder class properly initialized 
 * and thus containing the unique singleton instance .
 */
class BillPughSingleton {

	private BillPughSingleton(){
		System.out.println("bill pugh singleton instance is created");
	}
	    
	private static class SingletonHelper{
		private SingletonHelper() {}
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	 }
	    
	public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
     }
}
