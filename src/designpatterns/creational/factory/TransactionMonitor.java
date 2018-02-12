package designpatterns.creational.factory;

public class TransactionMonitor extends Monitor{

	private String name;
	private String group;

	public TransactionMonitor(String name, String group){
		this.name=name;
		this.group=group;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getGroup() {
		return this.group;
	}

}
