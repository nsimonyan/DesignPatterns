package designpatterns.structural.adapter;

//Using inheritance for adapter pattern
//Adapter class - This class is a wrapper class which implements the desired target interface and modifies the specific request available from the Adaptee class.
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		return convertVolt(getVolt(),10);
	}

	@Override
	public Volt get3Volt() {
		return convertVolt(getVolt(),40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}