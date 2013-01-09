package IreneGoesShopping;

import IreneGoesShopping.Fruit.*;

public class FunnyGurl {
	
//	Fruit[] GroceriesBag;
	
	public static void main(String[] args){
//		FunnyGurl irene = new FunnyGurl();
//		GroceriesBag gb = new GroceriesBag();
		
		
		Fruit[] f = new Fruit[2];
		f[0] = new Fruit("Apple");
		f[1] = new Fruit("Orange");
		
//		irene.GroceriesBag[0] = new Fruit("Apple");
//		irene.GroceriesBag[1] = new Fruit("Banana");
		
		FruitName fn = null;

		
		System.out.println("Today Irene's grocessies bag has " + f[0].fruitType
				+ " and " + f[1].fruitType);
		System.out.print("She spent: ");
		System.out.print(f[0].caculatePrice(fn.Apple, 6) + 
				f[1].caculatePrice(fn.Orange, 2));
	}

	

}
