package com.letsGoShopping;


public class GrocerySalesPerson {
	GroceriesBag bag;
	float price;
	

	float getPrice() {
		return price;
	}

	void setPrice(float price) {
//		this.price = price;
		FruitName fn = null;
		switch(fn){
		case Apple: price = 1.02f; break;
		case Banana: price = 1.0f; break;
		case Berries: price = 2.1f; break;
		case Orange: price = 1.3f; break;
		default: price = (float) 0; break;
		}
		
	}


	float caculatePrice(GroceriesBag bag){
		for (int i=0; i<bag.getF().length; i++){
		 this.price = bag.f[i].price * bag.f[i].quantity;
		}
		return price;
		
	}

}
