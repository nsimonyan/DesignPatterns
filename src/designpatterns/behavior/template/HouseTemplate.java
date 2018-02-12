package designpatterns.behavior.template;

public abstract class HouseTemplate {

	//template method, final so subclasses can't override
	public final void buildHouse(){
		buildFoundation();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}
	//default implementation
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	//methods to be implemented by subclasses
	public abstract void buildWalls();
}