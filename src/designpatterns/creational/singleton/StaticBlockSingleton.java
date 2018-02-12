/**
 * 
 */
package designpatterns.creational.singleton;

/*
 * Static block initialization implementation is similar to eager initialization,
 *  except that instance of class is created in the static block that provides option 
 *  for exception handling.
 *
 */
 class StaticBlockSingleton{

	private static StaticBlockSingleton instance;
	private StaticBlockSingleton() {	
		System.out.println("static block singleton instance is created - " + instance);

	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			System.out.println("problem when initing instance of singleton object, exception - " + e.getMessage());
		}
	}
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
	

}
