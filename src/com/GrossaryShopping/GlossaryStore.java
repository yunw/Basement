package com.GrossaryShopping;

//import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

public class GlossaryStore {
	Fruit[] fruit;
	String fruitype;
	int total;
	int num;
	
	public void setTotal(int typetotal) {
		typetotal = 100;
		this.total = typetotal;
	}
	
	public int getTotal(){
		return total;
	}

	Person p;
	
	int caculateStorage(){
		
		Fruit fruit = new Fruit(num);
		
		return total=total-num;
	}
}
