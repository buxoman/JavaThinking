

public class Flower {
	int petalCount = 0;
	String s = "initial value";
	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
	}
	Flower(String ss) {
		s = ss;
		System.out.println("Constructor w/ String arg only, s = " + s);
	}
	Flower(String s, int petals) {
		this(petals);
		//! this(s);
		this.s = s;
		System.out.println("String & int args");
	}
	Flower() {
		this("hi", 47);
		System.out.println("Default Constructor (no args)");
	}
	void printPetalCount() {
		//! this(11);
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower x = new Flower();
		x.printPetalCount();
	}

}
