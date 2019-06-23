package demo;

public class Calculator {

	public void add(int a, int b) { // add method is being defined here, a and b are called as formal parameters
		System.out.println(a + b);
	}

	public static void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.add(20, 30);
		subtract(20,10);
	}

	

}
