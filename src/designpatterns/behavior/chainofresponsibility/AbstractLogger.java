package designpatterns.behavior.chainofresponsibility;

public abstract class AbstractLogger {

	   protected Level level;

	   //next element in chain or responsibility
	   protected AbstractLogger nextLogger;

	   public void setNextLogger(AbstractLogger nextLogger){
	      this.nextLogger = nextLogger;
	   }

	   public void logMessage(Level level, String message){
	      if(this.level.getLevel() <= level.getLevel()){
	         write(message);
	      }
	      if(nextLogger !=null){
	         nextLogger.logMessage(level, message);
	      }
	   }

	   abstract protected void write(String message);
		
	}