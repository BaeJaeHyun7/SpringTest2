
public class Calc {
	
	private int sum;
	private int minus;
	private int multiply;
	private int dividing;
	
	
	
	
	
	
	public int sum(int num1, int num2) {
		sum = num1 + num2;
		return sum;
	}
	
	public int minus(int num1, int num2) {
		minus = num1 - num2;
		return minus;
	}
	
	public int multiply(int num1, int num2) {
		multiply = num1 + num2;
		return multiply;
	}
	
	public int dividing(int num1, int num2) {
		dividing = num1 + num2;
		return dividing;
	}
	
	



	public void printMenu() {
		System.out.println("===============");
		System.out.println("1. ´õÇÏ±â");
		System.out.println("2. »©±â");
		System.out.println("3. °öÇÏ±â");
		System.out.println("4. ³ª´©±â");
		System.out.println("===============");
	}

}
