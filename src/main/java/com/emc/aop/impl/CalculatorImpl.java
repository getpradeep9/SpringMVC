package com.emc.aop.impl;

import com.emc.aop.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public Double add(Double a, Double b) {
					
		return (a+b);
	}

	@Override
	public Double sub(Double a, Double b) {
		
		
		System.out.println(" \n came to sub(..)");
		
		if(a<b){
			throw new ArithmeticException();
		}
		System.out.println("\n\t inside SUB()  Just before returning\n\t");
		return (a-b);
	}

}
