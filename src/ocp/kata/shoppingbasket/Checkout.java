package ocp.kata.shoppingbasket;

import java.util.Map;

public class Checkout {

	private Map<String, Integer> prices;
	private int total;
	private Discounter discounter;

	public Checkout(Map<String, Integer> prices, Discounter discounter) {
		this.prices = prices;
		this.discounter = discounter;
	}

	public void scan(String item) {
		discounter.scan(item);
		total += prices.get(item);
	}

	public int total() {
		return discounter.apply(total);
	}

}
