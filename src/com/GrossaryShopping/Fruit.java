package com.GrossaryShopping;

public class Fruit extends Glossary{
	private String type;
	int number;
//	private String name;

	public void setType(String type) {
		this.type = type;
		System.out.print(type);
	}

	public String getType() {
		return type;
	}
	
	public Fruit(){
		this.type = null;
		
	}
	
	public Fruit(String type, int number){
		this.type = type;
		this.number = number;
	}
	
	public Fruit(int number){
		this.number = number;
	}
	

}
