package ocp.kata.calculator;

import java.util.HashMap;
import java.util.Map;

public class CalculatorFactory {

	public Calculator create() {
		
		Map<String, Calculation> calculationOperators = new HashMap<String, Calculation>();
		calculationOperators.put("+", new AddCalculation());
		calculationOperators.put("", new ZeroCalculation());
		calculationOperators.put(null, new EchoCalculation());
		calculationOperators.put("-", new SubtractCalculation());
		calculationOperators.put("*", new MuliplicationCalculation());
		calculationOperators.put("/", new DivideCalculation());
		
		return new Calculator(calculationOperators);
	}

}
