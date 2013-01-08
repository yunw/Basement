package IreneGoesShopping;

public class FunnyGurl {
	
	Fruit GroceriesBag[];
	
	public static void main(String[] args){
		FunnyGurl irene = new FunnyGurl();
		irene.GroceriesBag[0] = new Fruit("Apple");
		irene.GroceriesBag[1] = new Fruit("Banana");
		
		System.out.println("Today Irene's grocessies bag has " + irene.GroceriesBag[0].fruitType
				+ "and " + irene.GroceriesBag[1].fruitType);
		System.out.print("She spent: ");
		System.out.print(irene.GroceriesBag[0].caculatePrice("Apple", 6) + 
				irene.GroceriesBag[1].caculatePrice("Banana", 2));
	}

	

}
