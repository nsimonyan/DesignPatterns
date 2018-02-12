package designpatterns.creational.factory;

public class MonitorFactory {
	
	public static Monitor getMonitor(String type, String name, String group){
		if(TYPE.TRANSACTION.toString().equals(type)) return new TransactionMonitor(name, group);
		else if(TYPE.FPL.toString().equals(type)) return new FPLMonitor(name, group);
		return null;
	}

}
