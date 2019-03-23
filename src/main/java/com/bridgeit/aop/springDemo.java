package com.bridgeit.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class springDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext();
		Alien al= context.getBean(Alien.class);
		al.show();
	}

}
