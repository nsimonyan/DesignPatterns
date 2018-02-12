package designpatterns.creational.singleton;

/*
 * In eager initialization, the instance of Singleton Class is created at the time of class loading, 
 * this is the easiest method to create a singleton class but it has a drawback that instance is 
 * created even though client application might not be using it.
 * In most of the scenarios, Singleton classes are created for resources such as File System, 
 * Database connections etc and we should avoid the instantiation until unless client calls the 
 * getInstance method.
 * Also this method doesn’t provide any options for exception handling.
 */
public class EagleLoadSingleton {

	private static EagleLoadSingleton instance = new EagleLoadSingleton();

    //private constructor to avoid client applications to use constructor
	private EagleLoadSingleton() {	
		System.out.println("eagle load singleton instance is created - " + instance);
	}


	public static EagleLoadSingleton getInstance() {
		return instance;
	}

}
