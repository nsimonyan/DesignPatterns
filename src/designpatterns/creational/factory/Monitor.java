package designpatterns.creational.factory;

public abstract class Monitor {
	public abstract String getName();
	public abstract String getGroup();
	
	@Override
	public String toString(){
		return "Monitor name= "+this.getName() + ", group="+this.getGroup();
	}

}
