package designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

/*
 * Reflection can be used to destroy all the above singleton implementation approaches.
 * 
 */
 class ReflectionSingleton {

	 ReflectionSingleton() {}
	 static void destroySingleton() {
		 
			EagleLoadSingleton eagleLoadSingleton1 = EagleLoadSingleton.getInstance();
			EagleLoadSingleton eagleLoadSingleton2 = null;
			System.out.println("eagle load singleton 1 - " + eagleLoadSingleton1);
			System.out.println("eagle load singleton 2 - " + eagleLoadSingleton2);
			
			try {
				Constructor[] constructors = EagleLoadSingleton.class.getDeclaredConstructors();
				for (Constructor constructor : constructors) {
					constructor.setAccessible(true);
					eagleLoadSingleton2 = (EagleLoadSingleton) constructor.newInstance();
					break;
				}
			} catch (Exception e) {
				System.out.println("problem when trying to destroy singleton, exception - " + e.getMessage());
			}
			System.out.println("eagle load singleton 1 destroing - " + eagleLoadSingleton1);
			System.out.println("eagle load singleton 2 after destroing - " + eagleLoadSingleton2);
	 }
}
