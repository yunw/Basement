package GrossayShopping;

public class GrossaryBag {
	Fruit[] f;

	void addFruitToBag (Fruit sf){
		int bagmax = 100;
		for (int i=0 ; i<f.length && i < bagmax; i++)
		{ this.f[i] = sf;
		}
	}
	
	Fruit[] getFruitsFromBag(){
		return f;
	}

}

