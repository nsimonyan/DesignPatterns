package designpatterns.behavior.visitor;

import java.math.BigDecimal;

public interface PlanVisitor {
		BigDecimal visit(Monitor book);
		BigDecimal visit(Notification fruit);
}
