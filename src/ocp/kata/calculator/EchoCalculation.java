package ocp.kata.calculator;

public class EchoCalculation implements Calculation {

	@Override
	public int evaluate(int left, int right) {
		return left;
	}

}
