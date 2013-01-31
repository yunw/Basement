package GroceryShopping;

import java.util.Enumeration;
import java.util.Vector;

public class Person {
	String name;
	GroceryBag gb;
	
	Person(String name, GroceryBag gb){
		this.name = name;
		this.gb = gb;
	}
	

	void putFruitIntheBag (Fruit f){
//		gb.FruitBag.add(f);
		gb.addFruitToBag(f);	
	}
	
	Vector getBag(){
		return gb.FruitBag;
	}
	
	public static void main(String args[]){
		GroceryBag bg = new GroceryBag();
		Person x = new Person("Monster", bg);
		x.putFruitIntheBag(new Fruit("Apples"));
		x.putFruitIntheBag(new Fruit("Banana"));
		x.putFruitIntheBag(new Fruit("herbs"));

		Enumeration bgEn = x.getBag().elements();
		while(bgEn.hasMoreElements()){
			System.out.print(x.name + " put " + bgEn.nextElement() + "" + " in to her bag." + "\n");
		}
	}
	
	
	
}
