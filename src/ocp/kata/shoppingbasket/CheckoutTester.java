package ocp.kata.shoppingbasket;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckoutTester {

	// one test at a time, listen to test, get the one bit that is failing the test to
	// be injected into the factory
	// don't skip ahead Paul!
	
	@Test
	public void emptyBasket(){
		assertEquals(0,price(""));
	}
	
	// the propblem was the 0 in checkout, pass in a map of prices instead
	@Test
	public void singleItem(){
		assertEquals(50,price("A"));
		assertEquals(30,price("B"));
		assertEquals(20,price("C"));
		assertEquals(15,price("D"));
	}
	
	// wrote a discounter with hard coded A and 20 p
	@Test
	public void threeAsGet20pDiscount(){
		assertEquals(100,price("A","A"));
		assertEquals(130,price("A","A","A"));
		assertEquals(180,price("A","A","A","A"));
	}

	// problem here is the hard coded nature of the discounter
	@Test
	public void twoBsGet15pDiscount(){
		assertEquals(45,price("B","B"));
		assertEquals(175,price("A","B","A","B","A"));
		assertEquals(180,price("A","C","A","B","D","B"));
	}

	private int price(String... items){
		Checkout checkout = new CheckoutFactory().create();
		for(String item : items){
			checkout.scan(item);
		}
		return checkout.total();
	}
}
