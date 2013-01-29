package GroceryShopping;

import java.util.Vector;

public class Cashier {
	String name;
	
	int calculateGBTotal(GroceryBag bag){
		int i = bag.FruitBag.capacity();
		return i;
	}
	
	
	String checkRecieve(double money){
		
		double cost = 100.0;
		String retrunMsg = null;
		if (money == cost) 
			retrunMsg = "no need for change";
		
		else if (money > cost)
			retrunMsg = "need change " + (money-cost);

		else if(money < cost)
			retrunMsg = "need add more " + (cost - money);

		return retrunMsg;
	}
	
	public static void main(String args[]){
		
		GroceryBag gb = new GroceryBag();		
		gb.addFruitToBag(new Fruit("Apple"));
		gb.addFruitToBag(new Fruit("orange"));
		gb.addFruitToBag(new Fruit("banana"));
		
		Cashier jill = new Cashier();
		System.out.println(jill.calculateGBTotal(gb));
//		if give Vector initialization as empty, always return 10???
	}

}
