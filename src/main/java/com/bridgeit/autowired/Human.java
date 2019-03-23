package com.bridgeit.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("octpousHeart")
	private Heart heart;
	
    public Human() {
		
	}

   
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("human constructor exicuting");
	}
	//@autowired doesnot need a setter to do the dependency injection
	//then y it is working?
	//simple,if match found for humanheart in the beans.xml file then directly create humanheart object and inject that to the dependency called heart
	
//	//@Qualifier("octpousHeart")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("setter method gooo...");
//	}
	
	public void startPumping()
	{
		if(heart!=null)
		{
		heart.pump();
		System.out.println("name of the animal is :"+heart.getNameOfAnimal()+" no of heart present :  "+heart.getNoOfHear());
		}
		else
		{
			System.out.println("you are dead");
		}
	}
}
