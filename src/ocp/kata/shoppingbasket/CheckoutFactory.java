package ocp.kata.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutFactory {

	public Checkout create() {
		
		Map<String, Integer> prices = new HashMap<String, Integer>();
		prices.put("",0);
		prices.put("A",50);
		prices.put("B",30);
		prices.put("C",20);
		prices.put("D",15);
		
		List<Discount> discounts = new ArrayList<Discount>();
		discounts.add(new Discount("A",3,20));
		discounts.add(new Discount("B",2,15));
		
		Discounter discounter = new Discounter(discounts);
		
		return new Checkout(prices, discounter);
	}

}
