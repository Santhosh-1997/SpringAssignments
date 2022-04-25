package com.masai;

public class ServiceLayer {

	private int a;
	private int b;
	
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int calculate() {
		
		System.out.println("calculations done in service layer");
		return a+b;
		
	}
	
}
