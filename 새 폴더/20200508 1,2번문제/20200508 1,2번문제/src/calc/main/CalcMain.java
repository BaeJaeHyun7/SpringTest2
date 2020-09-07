package calc.main;

import java.util.Scanner;

import calc.vo.Calc;

public class CalcMain {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.printMenu();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 번호를 선택해 주세요");
		int choice = sc.nextInt();
		
		System.out.println("정수의 값을 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("정수의 값을 입력하세요");
		int num2 = sc.nextInt();
		
		switch (choice) {
		case 1:System.out.println(c.sum(num1, num2));
			
			break;
		case 2:System.out.println(c.minus(num1, num2));
			
			break;
		case 3:System.out.println(c.multiply(num1, num2));
	
			break;
		case 4:System.out.println(c.dividing(num1, num2));
	
			break;

		default:System.out.println("잘못 입력하셨습니다");
			break;
		}
		

	}

}
