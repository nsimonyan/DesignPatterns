package designpatterns.behavior.strategy;

import java.math.BigDecimal;

public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	public PaypalStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(BigDecimal amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}