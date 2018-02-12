package designpatterns.behavior.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Plan {

	//List of items
	List<Item> items;
	
	public Plan(){
		this.items=new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public BigDecimal calculateTotal(){
		BigDecimal sum = BigDecimal.ZERO;
		items.forEach(item ->  sum.add(item.getPrice()));
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod){
		BigDecimal amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}