package designpatterns.behavior.visitor;

import java.math.BigDecimal;

public interface ItemElement {

	public BigDecimal accept(PlanVisitor visitor);
}