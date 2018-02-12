package designpatterns.structural.adapter;

//Adapter class - This class is a wrapper class which implements the desired target interface and modifies the specific request available from the Adaptee class.
public class SocketObjectAdapterImpl implements SocketAdapter{

	//Using Composition for adapter pattern
	private Socket sock = new Socket();
	private Volt volt = sock.getVolt();
	@Override
	public Volt get120Volt() {
		return volt;
	}

	@Override
	public Volt get12Volt() {
		return convertVolt(volt,10);
	}

	@Override
	public Volt get3Volt() {
		return convertVolt(volt,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}