package IreneGoesShopping;

import IreneGoesShopping.Fruit.FruitName;

public class FunnyGurl {
	
	Fruit GroceriesBag[];
	
	public static void main(String[] args){
		FunnyGurl irene = new FunnyGurl();
		irene.GroceriesBag[0] = new Fruit("Apple");
		irene.GroceriesBag[1] = new Fruit("Banana");
		
		FruitName fn = null;

		
		System.out.println("Today Irene's grocessies bag has " + irene.GroceriesBag[0].fruitType
				+ "and " + irene.GroceriesBag[1].fruitType);
		System.out.print("She spent: ");
		System.out.print(irene.GroceriesBag[0].caculatePrice(fn.Apple, 6) + 
				irene.GroceriesBag[1].caculatePrice(fn.Balana, 2));
	}

	

}
