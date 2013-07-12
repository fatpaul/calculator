package ocp.kata.shoppingbasket;

import java.util.List;

public class Discounter {

	private List<Discount> discounts;
	
	public Discounter(List<Discount> discounts){
		this.discounts = discounts;
	}
	
	public int apply(int total) {
		for (Discount discount : discounts) {
			total = discount.apply(total);
		}
		return total;
	}

	public void scan(String item) {
		for (Discount discount : discounts) {
			discount.scan(item);
		}
	}
}
