import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calc c = new Calc();
		c.printMenu();
		System.out.println("���ϴ� �޴��� ����� �ּ���");
		int choice = sc.nextInt();
		
		System.out.println("ù��° ����");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ����");
		int num2 = sc.nextInt();
		
		
		
		switch (choice) {
		case 1 : System.out.println(c.sum(num1, num2));
			
			break;
		case 2:System.out.println(c.minus(num1, num2));
			
			break;
		case 3:System.out.println(c.multiply(num1, num2));
	
			break;
		case 4:System.out.println(c.dividing(num1, num2));
	
			break;

		default:System.out.println("�߸� �Է��ϼ̽��ϴ�");
			break;
		}
		
		

}
}