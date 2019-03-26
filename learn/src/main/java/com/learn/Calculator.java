package com.learn;

public class Calculator {
	
	CalculatorService calculatorService;
	
	public Calculator(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public int add(int val1, int val2) {
		return calculatorService.add(val1, val2);
	}

}
