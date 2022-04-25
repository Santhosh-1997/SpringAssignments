package com.masai;

public class PresentationLayer {

	private ServiceLayer s;

	public void setS(ServiceLayer s) {
		this.s = s;
	}
	
	public void calculate() {
		
		int result = s.calculate();
		System.out.println("printing in presentation layer");
		
		System.out.println("sum is : " + result);
		
	}
	
	
}
