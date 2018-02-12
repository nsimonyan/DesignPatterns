package designpatterns.behavior.interpreter;

public class TestInterpreter {

	  public static void main(String[] args) {
	      Expression isMale = Rules.getMaleExpression();
	      Expression isMarriedWoman = Rules.getMarriedWomanExpression();

	      System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	   }
}
