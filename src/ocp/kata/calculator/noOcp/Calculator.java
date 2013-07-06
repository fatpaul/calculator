package ocp.kata.calculator.noOcp;

public class Calculator {

	public int evaluate(String calculation) {

		if ("".equals(calculation.trim())) {
			return 0;
		}

		String[] calculationElements = calculation.split(" ");
		int firstNumber = Integer.parseInt(calculationElements[0]);

		if (calculationElements.length == 1) {
			return firstNumber;
		}

		int secondNumber = Integer.parseInt(calculationElements[2]);
		String operation = calculationElements[1];

		if ("+".equals(operation)) {
			return firstNumber + secondNumber;
		} else if ("-".equals(operation)) {
			return firstNumber - secondNumber;
		} else if ("*".equals(operation)) {
			return firstNumber * secondNumber;
		} else if ("/".equals(operation)) {
			return firstNumber / secondNumber;
		}

		return 0;
	}

}
