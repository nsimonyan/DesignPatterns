package designpatterns.behavior.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

	   public ErrorLogger(Level level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Error Console::Logger: " + message);
	   }
}