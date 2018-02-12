package designpatterns.creational.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
	      //get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
	      //get an object of Shape Circle
	      Shape shape = shapeFactory.getShape("SQUARE");
	      //call draw method of Shape Circle
	      shape.draw();
	      
	      //get color factory
	      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
	      //get an object of Color Red
	      Color color1 = colorFactory.getColor("RED");
	      //call fill method of Red
	      color1.fill();
	}
}
