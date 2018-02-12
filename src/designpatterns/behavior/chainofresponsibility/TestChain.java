package designpatterns.behavior.chainofresponsibility;

public class TestChain {

	   public static void main(String[] args) {
		      AbstractLogger loggerChain = Chain.getChainOfLoggers();

		      loggerChain.logMessage(Level.INFO, 
		         "This is an information.");

		      loggerChain.logMessage(Level.DEBUG, 
		         "This is an debug level information.");

		      loggerChain.logMessage(Level.ERROR, 
		         "This is an error information.");
	   }
}
