//: control/WhileTest.java


public class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.39;
		System.out.print(result + ", ");
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(condition()) {
			System.out.println("Inside 'while'");
		}
		System.out.println("Exited 'while'");
	}

}
