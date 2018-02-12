package designpatterns.creational.factory;

public class FPLMonitor extends Monitor {
	
	private String name;
	private String group;

	public FPLMonitor(String name, String group){
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
