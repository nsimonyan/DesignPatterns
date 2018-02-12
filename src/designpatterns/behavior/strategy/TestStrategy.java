package designpatterns.behavior.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class TestStrategy {

	public static void main(String[] args) {
		Plan plan = new Plan();
		
		Item item1 = new Item("1234", new BigDecimal(10));
		Item item2 = new Item("5678", new BigDecimal(40));
		
		plan.addItem(item1);
		plan.addItem(item2);
		
		//pay by paypal
		plan.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		
		//pay by stripe
		plan.pay(new StripeStrategy("Naira Simonyan", 4242424242424242L, 123, LocalDate.of(2019, Month.APRIL, 11) ));
	}

}
