package GroceryShopping;

import java.util.*;

public class GroceryBag {
	Vector FruitBag = new Vector(0);

	void addFruitToBag (Fruit f){
		FruitBag.addElement(f);
	}
	
	Fruit getFruitsFromBag(int i){
		return (Fruit) FruitBag.get(i);
	}
	
	
	public static void main(String args[]){
		
		GroceryBag bg = new GroceryBag();
		Vector FruitBag = bg.FruitBag;
		bg.addFruitToBag(new Fruit("Apple"));
		bg.addFruitToBag(new Fruit("orange"));
	
		System.out.println ("FruitBag content is: " + FruitBag + "\n");
		Fruit myFruitRetrievedFromBag = bg.getFruitsFromBag(0);
		
		System.out.println ("the fruit i retrieved from the bag is : " + myFruitRetrievedFromBag);
	}

}

