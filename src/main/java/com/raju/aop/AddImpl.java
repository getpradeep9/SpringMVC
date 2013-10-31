package com.raju.aop;

public class AddImpl implements Add {

	@Override
	public double doAdd(double a, double b) {

		
		System.out.println("\n\t  IN doAdd(..) method \n\t");
		double c = a + b;

		return c;
	}

	public double doDiv(double a, double b) {

		System.out.println("\n\t  IN doSub(..) method \n\t");
		
		if(b==0){
			throw new ArithmeticException("Divide by Zero is not accepted");
		}
		
		double c = a - b;

		return c;
	}

}
