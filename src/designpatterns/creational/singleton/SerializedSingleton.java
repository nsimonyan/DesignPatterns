package designpatterns.creational.singleton;

import java.io.Serializable;

/*
 * Sometimes in distributed systems, 
 * we need to implement Serializable interface in Singleton class so that we can store it’s state
 * in file system and retrieve it at later point of time. 
 * The problem with below serialized singleton class is that whenever we deserialize it, 
 * it will create a new instance of the class
 * So it destroys the singleton pattern, to overcome this scenario 
 * all we need to do it provide the implementation of readResolve() method.
 * 
 protected Object readResolve() {
    return getInstance();
 }
 
 */
 class SerializedSingleton implements Serializable{

	 private static final long serialVersionUID = -7604766932017737115L;

	    private SerializedSingleton(){}
	    
	    private static class SingletonHelper{
	        private static final SerializedSingleton instance = new SerializedSingleton();
	    }
	    
	    public static SerializedSingleton getInstance(){
	        return SingletonHelper.instance;
	    }
	    
	    
}
