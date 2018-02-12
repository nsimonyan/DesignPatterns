package designpatterns.behavior.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {

	public void pay(BigDecimal amount);
}