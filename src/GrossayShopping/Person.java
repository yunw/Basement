package GrossayShopping;

public class Person {
	String name;
	GrossaryBag gb;
	
	Person(String name, GrossaryBag gb){
		this.name = name;
		this.gb = gb;
	}
	

	void putFruitIntheBag (Fruit f){


		gb.addFruitToBag(f);
		
		
	}
	
	GrossaryBag getBag(){
		return gb;
		
	}
	


	
}
