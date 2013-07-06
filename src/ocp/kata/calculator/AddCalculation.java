package ocp.kata.calculator;

public class AddCalculation implements Calculation {

	@Override
	public int evaluate(int left, int right) {
		return left + right;
	}

}
