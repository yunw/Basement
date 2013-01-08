package gtest1;

public class Fruit {
	String x;
	public static void main(String[] args) {
		Fruit[] Fruit1 = new Fruit[1];
	    Fruit[] Fruit2 = new Fruit[1];
	    Fruit1[0] = new Fruit();
	    Fruit2[0] = new Fruit();
	    Fruit1[0].x = "Apple";
	    Fruit1[1].x = "Grap";
	    Fruit2[0].x = "Orange";
	    Fruit2[1].x = "Banana";
	    SqueezeA(Fruit1, Fruit2);
	    System.out.println("Fruit Set A " + Fruit1[0].x + " " + Fruit2[0].x );
	    SqueezeB(Fruit1[0], Fruit2[0]);
	    System.out.println("Fruit Set B " + Fruit1[1].x + " " + Fruit2[1].x);
	    SqueezeC(Fruit1[0], Fruit2[0]);

	}

	public static void SqueezeA(Fruit[] o1, Fruit[] o2) {
	    Fruit[] temp;
	    temp = o1;
	    o1 = o2;
	    o2 = temp;
	    System.out.println("Squeeze A " + o1[0].x + " " + o2[0].x);
	}

	public static void SqueezeD(Fruit[] o1, Fruit[] o2) {
	    Fruit temp;
	    temp = o1[0];
	    o1[0] = o2[0];
	    o2[0] = temp;
	    System.out.println("Squeeze D " + o1[0].x + " " + o2[0].x);
	}

	public static void SqueezeB(Fruit o1, Fruit o2) {
	    Fruit temp;
	    temp = o1;
	    o1 = o2;
	    o2 = temp;
	    System.out.println("Squeeze B " + o1.x + " " + o2.x);
	}

	public static void SqueezeC(Fruit o1, Fruit o2) {
	    String temp;
	    temp = o1.x;
	    o1.x = o2.x;
	    o2.x = temp;
	    System.out.println("Squeeze C " + o1.x + " " + o2.x);
	}

	
}
