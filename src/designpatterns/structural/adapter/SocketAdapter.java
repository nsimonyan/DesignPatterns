package designpatterns.structural.adapter;

//Target Interface - This is the desired interface class which will be used by the clients.
public interface SocketAdapter {

	public Volt get120Volt();
		
	public Volt get12Volt();
	
	public Volt get3Volt();
}