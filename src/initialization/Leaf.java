package initialization;

public class Leaf {
	int i = 0;
	Leaf increment() {
		++i;
		return this;
	}
	void print() {
		System.out.println("i = " + i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}

}
