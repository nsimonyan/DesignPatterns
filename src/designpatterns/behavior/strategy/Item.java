package designpatterns.behavior.strategy;

import java.math.BigDecimal;

public class Item {

	private String itemCode;
	private BigDecimal price;
	
	public Item(String itemCode, BigDecimal price){
		this.itemCode=itemCode;
		this.price=price;
	}

	public String getItemCode() {
		return itemCode;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
}