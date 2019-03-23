package com.bridgeit.aop;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	//to make this class as spring bean
	
	public void show()
	{
		System.out.println("hello world");
	}

}
