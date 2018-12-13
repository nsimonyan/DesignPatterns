package designpatterns.behavior.visitor;

import java.math.BigDecimal;

public interface PlanVisitor {
		BigDecimal visit(Monitor monitor);
		BigDecimal visit(Notification notification);
}
