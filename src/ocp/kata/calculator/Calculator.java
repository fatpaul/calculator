package ocp.kata.calculator;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Calculator {

	private Map<String, Calculation> calculationOperators;
	private String operator = null;
	private int left = 0;
	private int right = 0;

	public Calculator(Map<String, Calculation> calculationOperators) {
		this.calculationOperators = calculationOperators;
	}

	public int evaluate(String calculationExpression) {
		parseExpression(calculationExpression);
		return this.calculationOperators.get(operator).evaluate(left, right);
	}

	private void parseExpression(String calculationExpression) {
		StringTokenizer st = new StringTokenizer(calculationExpression, " ");
		try {
			left = Integer.parseInt(st.nextToken());
			operator = st.nextToken();
			right = Integer.parseInt(st.nextToken());
		} catch (NoSuchElementException ignore) {
		}
	}
}
