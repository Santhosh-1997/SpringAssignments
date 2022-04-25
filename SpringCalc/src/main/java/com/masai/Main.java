package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationLayer pl = ctx.getBean(PresentationLayer.class, "pl");
		
		A a = ctx.getBean(A.class,"a");
		
		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext)ctx;
		
		ctx2.close();
		
	}

}
