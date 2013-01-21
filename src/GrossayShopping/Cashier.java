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
		
		double cost = 100.0;
		String retrunMsg = null;
		if (money == cost) 
			retrunMsg = "no need for change";
		
		else if (money > cost)
			retrunMsg = "need change " + (money-cost);

		else if(money < cost)
			retrunMsg = "need add more " + (cost - money);

		return retrunMsg;
	}

}
