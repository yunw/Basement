package GroceryShopping;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFruit {

	@Test
	public void test() {
		String type = "Apple";
		Fruit ft = new Fruit(type);
		
		assertEquals("Apple", ft.type);

		
	}

}
