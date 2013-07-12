package ocp.kata.shoppingbasket;

public class Discount {

	private String item;
	private int quantity;
	private int discount;
	private int count;

	public Discount(String item, int quantity, int discount) {
		this.item = item;
		this.quantity = quantity;
		this.discount = discount;
	}

	public int apply(int total) {
		if (count >= quantity) {
			return total -= discount;
		}
		return total;
	}

	public void scan(String item) {
		if (this.item.equals(item)) {
			count++;
		}
	}
}
