package designpatterns.behavior.visitor;

import java.math.BigDecimal;

public class Notification implements ItemElement{

	private BigDecimal price;
	private String name;
	private int count;
	
	public Notification(BigDecimal price, String name , int count) {
		this.price=price;
		this.name=name;
		this.count=count;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public int getCount(){
		return this.count;
	}
	public String getName(){
		return this.name;
	}
	
	@Override
	public BigDecimal accept(PlanVisitor visitor) {
		return visitor.visit(this);
	}

}
