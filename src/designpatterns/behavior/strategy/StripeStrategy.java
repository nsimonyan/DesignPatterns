package designpatterns.behavior.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class StripeStrategy implements PaymentStrategy {

	private String name;
	private long cardNumber;
	private int cvv;
	private LocalDate expiryDate;
	
	public StripeStrategy(String name, long cardNumber, int cvv, LocalDate expiryDate){
		this.name=name;
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.expiryDate=expiryDate;
	}
	
	@Override
	public void pay(BigDecimal amount) {
		System.out.println(amount +" paid via stripe");
	}


}