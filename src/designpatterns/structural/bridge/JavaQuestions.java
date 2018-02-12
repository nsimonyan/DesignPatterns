package designpatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

//Create a JavaQuestions implementation class that will implement Question interface.
public class JavaQuestions implements Question {  
	 private List <String> questions = new ArrayList<String>();  
	 private int current = 0;  
	
	 public JavaQuestions(){  
	    questions.add("What is class? ");  
	    questions.add("What is interface? ");  
	    questions.add("What is abstraction? ");  
	    questions.add("How multiple polymorphism is achieved in java? ");  
	    questions.add("How many types of exception  handling are there in java? ");  
	    questions.add("Define the keyword final for  variable, method, and class in java? ");  
	    questions.add("What is abstract class? ");  
	    questions.add("What is multi-threading? ");  
	 }  
	 public void nextQuestion() {  
	    if( current <= questions.size()-1 )  
	    current++;  
	    System.out.print(current);  
	 }  
	  
	 public void previousQuestion() {  
	    if( current > 0 )  
	    current--;  
	 }  
	  
	 public void newQuestion(String question) {  
	    questions.add(question);  
	 }  
	  
	 public void deleteQuestion(String question) {  
	    questions.remove(question);  
	 }  
	  
	 public void displayQuestion() {  
	    System.out.println(questions.get(current) );  
	 }  
	 public void displayAllQuestions() {  
		 questions.stream().forEach(question -> System.out.println(question));
	}  
}