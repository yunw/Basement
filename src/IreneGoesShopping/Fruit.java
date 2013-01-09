package IreneGoesShopping;

public class Fruit {
	String name;
	Float price;
	int quantity;
	String fruitType;
	
	enum FruitName{
		Apple, Balana, Berries, Orange;
	}
	
	FruitName fname;
	
	public Fruit(String fruitType){
		this.fruitType = fruitType;
		this.name = fruitType;
		
	}
	
	float caculatePrice(FruitName fname, int quantity){
		Fruit f = new Fruit(fruitType);
		switch (f.fname){
		case Apple: price = 1.02f; break;
		case Balana: price = 1.0f; break;
		case Berries: price = 2.1f; break;
		case Orange: price = 1.3f; break;
		default: price = (float) 0; break;
		}
		
		return price*quantity;
	}
}
