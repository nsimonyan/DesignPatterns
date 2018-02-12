package designpatterns.behavior.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

}