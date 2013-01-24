package GroceryShopping;

import java.util.*;

public class GroceryBag {
	Fruit[] f;
	Vector<Fruit> FruitBag;

	GroceryBag(Fruit[] f){
		this.f = f;
	}

	void addFruitToBag (Fruit sf){
		FruitBag.addElement(sf);
		System.out.println(FruitBag.elements());
		FruitBag.capacity();
	}
	
	Vector<Fruit> getFruitsFromBag(){
		return FruitBag;
	}
	
	
	public static void main(String args[]){
		int i = 5;
		Fruit[] f = new Fruit[i];
		GroceryBag coach = new GroceryBag(f);
		coach.addFruitToBag(new Fruit("Apple"));
		coach.addFruitToBag(new Fruit("orange"));
		coach.FruitBag.elements();
		
	}

}

