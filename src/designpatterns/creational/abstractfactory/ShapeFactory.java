package designpatterns.creational.abstractfactory;

/**
 * Create Factory classes extending AbstractFactory to generate object of concrete class 
 * based on given information. 
 * @author Admin
 *
 */
public class ShapeFactory extends AbstractFactory {
	
	   @Override
	   public Shape getShape(String shapeType){
	   
	      if(shapeType == null){
	         return null;
	      }		
	     if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	   }
	   
	   @Override
	   Color getColor(String color) {
	      return null;
	   }
	}