package IreneGoesShopping;

import IreneGoesShopping.Fruit.*;

public class FunnyGurl {
	GroceriesBag gb;
	float money;
	
	public static void main(String[] args){
		FunnyGurl gurlA = new FunnyGurl();
		gurlA.gb.f = new Fruit[2];
	
		gurlA.gb.f[0] = new Fruit("Apple");
		gurlA.gb.f[1] = new Fruit("Orange");
		
		int[] a = {1, 2};

		gurlA.gb.quantity = a;
		
		GrocerySalesPerson jimmy = new GrocerySalesPerson();
		gurlA.money = jimmy.caculatePrice(gurlA.gb);
		
		System.out.println("Today Irene spent " + gurlA.money + "on " +
				gurlA.gb.f.toString());
	}

	

}
