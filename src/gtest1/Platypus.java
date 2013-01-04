package gtest1;

/**
 * Constructors and methods use the keyword this quite differently. 
 * A method uses this to refer to the instance of the class that is executing the method. 
 * Static methods do not use this; they do not belong to a class instance, so this would have nothing to reference. 
 * Static methods belong to the class as a whole, rather than to an instance. 
 * Constructors use this to refer to another constructor in the same class with a different parameter list. 
 * @author p-ywang
 *
 */
	
	public class Platypus {
	       String name;
	       Platypus(String input) {
//	               name = input;
	    	   this.name = input;
	               System.out.print(name + "\n");
	              
	       }
	       Platypus() {
	               this("John/Mary Doe");
//	               System.out.print(name);
	       }
	       public static void main(String args[]) {
	               Platypus p1 = new Platypus("digger");
	              
	               Platypus p2 = new Platypus();
	       }


}
