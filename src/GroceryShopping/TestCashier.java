package GroceryShopping;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCashier {
	
	@Test
	public void testCashierName() {
		Cashier c = new Cashier();
		int total = 0;
		
		c.name = "jim";
		
//		check if the name attribute is called correctly;
		assertEquals("jim", c.name);
		
		
//		check method calculateGBTotal()
		Fruit[] ft = new Fruit[8];
		ft[0] = new Fruit("Apple");
		ft[1] = new Fruit("Berries");
		ft[2] = new Fruit("Orange");
		ft[3] = new Fruit("Balana");
		ft[4] = new Fruit("Pear");
		ft[5] = new Fruit("Pomegranate");
		ft[6] = new Fruit("Tomato");
		ft[7] = new Fruit("Grape");
		
		GroceryBag coach = new GroceryBag();
		Person p = new Person("Irene", coach);
		
		for (int i=0; i < 7; i++){
			coach.addFruitToBag(ft[i]);
			total = c.calculateGBTotal(p.getBag());
		}
		
		assertEquals(total, 7);
		
//		check method checkReceive
		String actualRes = c.checkRecieve(90.0);
		assertEquals("need add more " + 10.0, actualRes);
		
		
	}
	
		
	
	

}
