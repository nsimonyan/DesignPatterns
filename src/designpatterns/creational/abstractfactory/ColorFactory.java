package designpatterns.creational.abstractfactory;

/**
 * Create Factory classes extending AbstractFactory to generate object of concrete class 
 * based on given information.
 * @author Admin
 *
 */
public class ColorFactory extends AbstractFactory {
	
	   @Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   Color getColor(String color) {
	      if(color == null){
	         return null;
	      }		
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	      }
	      return null;
	   }
	}