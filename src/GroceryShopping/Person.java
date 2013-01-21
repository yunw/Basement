package GroceryShopping;

public class Person {
	String name;
	GroceryBag gb;
	
	Person(String name, GroceryBag gb){
		this.name = name;
		this.gb = gb;
	}
	

	void putFruitIntheBag (Fruit f){
		gb.addFruitToBag(f);	
	}
	
	GroceryBag getBag(){
		return gb;
	}
	
}
