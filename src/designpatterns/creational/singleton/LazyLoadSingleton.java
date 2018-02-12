package designpatterns.creational.singleton;

/*
 * Lazy initialization method to implement Singleton pattern
 *  creates the instance in the global access method. 
 *  The below implementation works fine in case of single threaded environment 
 *  but when it comes to multi threaded systems,
 *  it can cause issues if multiple threads are inside the if loop at the same time.
 *  It will destroy the singleton pattern and both threads will get the different instances
 *  of singleton class. 
 */
class LazyLoadSingleton{

	private static LazyLoadSingleton instance;
	
	private LazyLoadSingleton() {
		System.out.println("lazy load singleton instance is created - " + instance);
	}

	public static LazyLoadSingleton getInstance() {
		if (instance == null) {
			instance = new LazyLoadSingleton();
		}
		return instance;
	}

}
