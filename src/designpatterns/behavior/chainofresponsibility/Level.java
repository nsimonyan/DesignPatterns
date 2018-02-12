package designpatterns.behavior.chainofresponsibility;

public enum Level {

	  INFO(1),
	  DEBUG(2),
	  ERROR(3);
	
	private int level;
	
	Level(int level){
		this.level = level;
	}
	
	public int getLevel() {
		return this.level;
	}
	
}
