package designpatterns.creational.singleton;

import java.io.*;


public class Singleton{

	public static void main(String[] args) {

		EagleLoadSingleton eagleLoadSingleton1 = EagleLoadSingleton.getInstance();
		EagleLoadSingleton eagleLoadSingleton2 = EagleLoadSingleton.getInstance();
		System.out.println("eagle load singleton 1 - " + eagleLoadSingleton1);
		System.out.println("eagle load singleton 2 - " + eagleLoadSingleton2);
		
		StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();
		System.out.println("static block singleton 1 - " + staticBlockSingleton1);
		System.out.println("static block singleton 2 - " + staticBlockSingleton2);
		
		LazyLoadSingleton lazyLoadSingleton1 = LazyLoadSingleton.getInstance();
		LazyLoadSingleton lazyLoadSingleton2 = LazyLoadSingleton.getInstance();
		System.out.println("lazy load singleton 1 - " + lazyLoadSingleton1);
		System.out.println("lazy load singleton 2 - " + lazyLoadSingleton2);

		ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
		System.out.println("thread safe singleton 1 - " + threadSafeSingleton1);
		System.out.println("thread safe singleton 2 - " + threadSafeSingleton2);
		
		BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
		System.out.println("bill pugh singleton 1 - " + billPughSingleton1);
		System.out.println("bill pugh singleton 2 - " + billPughSingleton2);
		
		ReflectionSingleton.destroySingleton();
		
		EnumSingleton enumSingleton1 = EnumSingleton.instance;
		EnumSingleton enumSingleton2 = EnumSingleton.instance;
		System.out.println("enum singleton 1 - " + enumSingleton1);
		System.out.println("enum singleton 2 - " + enumSingleton2);

		
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		    out.writeObject(instanceOne);
		    out.close();
		    //deserailize from file to object
		    ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		    SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		    in.close();
		    System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
