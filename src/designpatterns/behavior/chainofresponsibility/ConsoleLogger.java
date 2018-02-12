package designpatterns.behavior.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

	   public ConsoleLogger(Level level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Standard Console::Logger: " + message);
	   }
}