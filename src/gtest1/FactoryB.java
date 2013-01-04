package gtest1;


public class FactoryB implements AbstractFactory {   
	    public Plant createPlant() {   
	        return new PlantB();   
	    }   
	  
	    public Fruit createFruit() {   
	        return new FruitB();   
	    }    
}
