package gtest1;

class Mammal {
    void getBirthInfo() {
            System.out.println("born alive.");
    }
}
class Platypus1 extends Mammal {
    void getBirthInfo() {
            System.out.println("hatch from eggs");
            System.out.print("a mammal normally is ");
            super.getBirthInfo();
    }
}


class Child extends SuperClass {
   Child() {
           super();
   }
   void test(){System.out.println("ChildClass" + "\n");}
}

class SuperClass {
    SuperClass() {System.out.println("SuperClass");}
}

public class SuperClassDemo{
	
	public static void main(String args[]){
		Platypus1 p1 = new Platypus1();
		p1.getBirthInfo();
		Child c1 = new Child();
		c1.test();
		
		
	}
	
}