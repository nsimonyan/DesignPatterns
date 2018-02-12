package designpatterns.behavior.visitor;

import java.math.BigDecimal;

public class Monitor implements ItemElement {

	private BigDecimal price;
	private String name;
	
	public Monitor(BigDecimal price, String name){
		this.price=price;
		this.name=name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public BigDecimal accept(PlanVisitor visitor) {
		return visitor.visit(this);
	}

}