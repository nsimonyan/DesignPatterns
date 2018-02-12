package designpatterns.behavior.visitor;

import java.math.BigDecimal;

public class TestVisitor {

	public static void main(String[] args) {
		BigDecimal monitorPrice1 = new BigDecimal(20);
		BigDecimal monitorPrice2 = new BigDecimal(200);
		BigDecimal notificationPrice = new BigDecimal(2);
		ItemElement[] items = new ItemElement[]{new Monitor(monitorPrice1, "FPL"),
												new Monitor(monitorPrice2, "TR"),
												new Notification(notificationPrice, "SMS", 50)};
		
		 BigDecimal total = calculateTotalPrice(items);
		System.out.println("Total Cost = "+total);
	}

	public static BigDecimal calculateTotalPrice(ItemElement[] items) {
		PlanVisitor visitor = new PlanVisitorImpl();
		BigDecimal sum= BigDecimal.ZERO;
		for(ItemElement item : items){
			sum.add(item.accept(visitor));
		}
		return sum;
	}
}
