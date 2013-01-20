package com.GrossaryShopping;

public class ShoppingTest {
//	Fruit[] f;
	
	public static void main(String[] args){
		
		Fruit[] f = new Fruit[2];
		f[0] = new Fruit("Apple", 2);
		f[1] = new Fruit("orange", 6);

		
		GrossaryBag gb = new GrossaryBag();
		gb.setF(f);
		
		Person p1 = new Person();
		p1.name = "Irene";
		p1.gb = gb;
		
		p1.goCheck(gb);
		
		Cashier jim = new Cashier();
		jim.caculateGBTotal(p1.gb);
		
		System.out.println(p1.name + " bought: " + "\n" + f[0].getType() + "\t" + f[1].getType() + 
				", go cheking out now..." + "\n");
		
		double cash = 100.0;
		jim.checkRecieve(cash);	
		
	}
	
}
