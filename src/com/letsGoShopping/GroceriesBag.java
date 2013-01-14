package com.letsGoShopping;

public class GroceriesBag {
	
	Fruit[] f;
	int[] quantity;

	void setF(Fruit[] f) {
		this.f = f;
	}
	
	Fruit[] getF() {
		return f;
	}
	
	void setQuantity(int[] q) {
		this.quantity = q;
	}
	
	int[] getQuantity() {
		
		return quantity;
	}

	void Shopping(Fruit[] f, int q){
		GroceriesBag bag = new GroceriesBag();
		bag.setF(f);
		bag.getQuantity();
		
		System.out.println(bag.getF() + "*" + bag.getQuantity());
		
	}



}
