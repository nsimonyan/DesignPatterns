package designpatterns.behavior.chainofresponsibility;

public class FileLogger extends AbstractLogger {

	   public FileLogger(Level level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("File::Logger: " + message);
	   }
}