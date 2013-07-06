package ocp.kata.calculator;

public class SubtractCalculation implements Calculation {

	@Override
	public int evaluate(int left, int right) {
		return left-right;
	}

}
