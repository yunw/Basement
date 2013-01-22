package GroceryShopping;

import java.util.*;

public class GroceryBag {
	Fruit[] f;
	int bagsize;

	void addFruitToBag (Fruit sf){
		List<Fruit> list = new ArrayList<Fruit>();
		for(int i=0; i< bagsize; i++){
			list.add(sf); }
		this.f = list.toArray(new Fruit[list.size()]);	
	}
	
	Fruit[] getFruitsFromBag(){
		return f;
	}

}

