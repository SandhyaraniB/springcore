package com.bridgeit.autowired;

public class Heart
{
	private String  nameOfAnimal;
	private int noOfHear;
	
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}


	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}


	public int getNoOfHear() {
		return noOfHear;
	}


	public void setNoOfHear(int noOfHear) {
		this.noOfHear = noOfHear;
	}


	public void pump() {
		System.out.println("pumping......");
		System.out.println("alive");
	}

}
