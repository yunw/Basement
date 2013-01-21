package GrossayShopping;

public class GrossaryBag {
	Fruit[] f;

	void addFruitToBag (Fruit sf){
		for (int i =0 ; i<f.length; i ++){
		this.f[i] = sf;}
		
	}
	Fruit[] getFruitsFromBag(){
		return f;
	}

}

