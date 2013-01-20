package com.GrossaryShopping;

public class Cashier {
	GrossaryBag gb;
	double total;
	
	GrossaryBag getGb() {
		return gb;
	}
	
	Double caculateGBTotal(GrossaryBag gb){
		System.out.println("caculating the total in cashier...");
		return 100.0;
	}
	
	void checkRecieve(double money){
		
		double total = 100.0;
		if (money == total) 
			{System.out.println("no need for change");}			
		else if (money > total)
			{System.out.println("need change " + (money-total));}
		else if(money > total)
			{System.out.println("need add more " + (total - money));}
	}

}
