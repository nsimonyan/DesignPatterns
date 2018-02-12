package designpatterns.behavior.template;


public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

}