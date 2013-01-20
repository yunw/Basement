package com.GrossaryShopping;

public class GrossaryBag {
	Fruit[] f;

	public Fruit[] getF() {
		return f;
	}

	public void setF(Fruit[] f) {
		this.f = f;
		for (int i = 0; i<f.length; i++){
		System.out.println("picking fruits..." + this.f[i].getType());}
	}
	

}
