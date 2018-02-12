package designpatterns.structural.adapter;

class Socket {
//producing constant volts of 120V
//Adaptee class - This is the class which is used by the Adapter class to reuse the existing functionality and modify them for desired use.
	public Volt getVolt(){
		return new Volt(120);
	}
}