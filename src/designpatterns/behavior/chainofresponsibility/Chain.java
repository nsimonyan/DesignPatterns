package designpatterns.behavior.chainofresponsibility;

public class Chain {

	   static AbstractLogger getChainOfLoggers(){

		      AbstractLogger errorLogger = new ErrorLogger(Level.ERROR);
		      AbstractLogger fileLogger = new FileLogger(Level.DEBUG);
		      AbstractLogger consoleLogger = new ConsoleLogger(Level.INFO);

		      errorLogger.setNextLogger(fileLogger);
		      fileLogger.setNextLogger(consoleLogger);

		      return errorLogger;	
		}
 }
