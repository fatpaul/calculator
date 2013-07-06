package ocp.kata.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTester {

	private Calculator calculator;

	@Before
	public void setup(){
		calculator = new CalculatorFactory().create();
	}
	
	@Test
	public void calculatorTest_1() {
		assertEquals(4, calculator.evaluate("2 + 2"));
	}
	@Test
	public void calculatorTest_2() {
		assertEquals(0, calculator.evaluate("  "));
	}
	@Test
	public void calculatorTest_3() {
		assertEquals(234, calculator.evaluate("234"));
	}
	@Test
	public void calculatorTest_4() {
		assertEquals(9, calculator.evaluate("6 + 3"));
	}
	@Test
	public void calculatorTest_5() {
		assertEquals(46, calculator.evaluate("12 + 34"));
	}
	@Test
	public void calculatorTest_6() {
		assertEquals(3, calculator.evaluate("6 - 3"));
	}
	@Test
	public void calculatorTest_7() {
		assertEquals(14, calculator.evaluate("18 - 4"));
	}
	@Test
	public void calculatorTest_8() {
		assertEquals(18, calculator.evaluate("6 * 3"));
	}
	@Test
	public void calculatorTest_9() {
		assertEquals(110, calculator.evaluate("5 * 22"));
	}
	@Test
	public void calculatorTest_10() {
		assertEquals(2, calculator.evaluate("6 / 3"));
	}
	@Test
	public void calculatorTest_11() {
		assertEquals(3, calculator.evaluate("36 / 12"));
	}
}
