package GroceryShopping;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGroceryBag {
	
	@Test
	public void test() {
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
		int bagsize = 10;
		for (int i =0; i<bagsize; i++){
		coach.addFruitToBag(ft[i]);}
		assertArrayEquals(coach.getFruitsFromBag(), coach.f);
	}

}
