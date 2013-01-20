package com.GrossaryShopping;

public class Person {
	String name;
	GrossaryBag gb;
	double payment;
	
	void setGrossaryBag(){
		
	}
	
	double goCheck(GrossaryBag gb){
		this.gb = gb;
		System.out.println("checking out grossarybag... ");
		return payment;
	}
	
}
