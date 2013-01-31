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
		Vector FruitBag1 = bg.FruitBag;
		FruitBag1.clear();
		bg.addFruitToBag(new Fruit("Apple"));
		bg.addFruitToBag(new Fruit("orange"));
	
		System.out.println ("FruitBag content is: " + FruitBag1 + "\n");
		System.out.println("there are fruit(s) in the bag : " + FruitBag1.capacity());
		System.out.print("the fruit(s) retrieved from the bag is : " );
		
		for (int i=0; i < FruitBag1.capacity(); i++){
		Fruit myFruitRetrievedFromBag = bg.getFruitsFromBag(i);
		
		System.out.print (myFruitRetrievedFromBag.type + " ");}
	}

}

