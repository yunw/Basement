package GrossayShopping;

public class Cashier {
	String name;
	int total;
	
	int calculateGBTotal(GrossaryBag bag){
		bag.getFruitsFromBag();
		System.out.println("getting fruits....");
		System.out.println("caculating the total Fruits types...");
		total = total +1;
		System.out.println(total);
		return total;
	}
	
	
	String checkRecieve(double money){
		
		double total = 100.0;
		String retrunMsg = null;
		if (money == total) 
			retrunMsg = "no need for change";
		
		else if (money > total)
			retrunMsg = "need change " + (money-total);

		else if(money > total)
			retrunMsg = "need add more " + (total - money);

		return retrunMsg;
	}

}
