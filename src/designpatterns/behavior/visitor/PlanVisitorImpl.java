package designpatterns.behavior.visitor;

import java.math.BigDecimal;

public class PlanVisitorImpl implements PlanVisitor{

	BigDecimal DISCOUNT = new BigDecimal(50);
	
	@Override
	public BigDecimal visit(Monitor monitor) {
		BigDecimal cost= BigDecimal.ZERO;
		//apply 5$ discount if monitor price is greater than 50
		if(DISCOUNT.compareTo(monitor.getPrice()) < 0){
			cost = monitor.getPrice().subtract(new BigDecimal(5));
		}else {
			cost = monitor.getPrice();
		}
		System.out.println("Monitor :: "+monitor.getName() + " cost ="+cost);
		return cost;
	}

	@Override
	public BigDecimal visit(Notification notification) {
		BigDecimal cost= notification.getPrice().multiply(new BigDecimal(notification.getCount()));
		System.out.println("Monitor :: "+notification.getName() + " cost ="+cost);
		return cost;
	}

}

