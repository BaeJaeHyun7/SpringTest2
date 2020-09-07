package human.manager;

import java.util.Scanner;

import human.vo.Human;

public class HumanManager {
	
	Scanner sc = new Scanner(System.in);
	
	Human []humanArr = new Human[100];
	int count = 0;
	
	public HumanManager() {
		super();
		while (true) {
			printMenu();
			inputMenu();
		}	
		
	}
	
	public void printMenu() {
		System.out.println("============");
		System.out.println("1. ����");
		System.out.println("2. ��ȸ");
		System.out.println("3. ��ü���");
		System.out.println("4. ���α׷� ����");
		System.out.println("============");	
	}
	
	public void inputMenu() {
		System.out.println("���� : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : if(count < 100) {humanArr[count] = humanInsert();
		                          count++;}
		
		         else System.out.println("100�� �ʰ�");
			break;
		case 2 : sc.nextLine();
			     System.out.println("��ȭ��ȣ �Է� : ");
		         String PhoneNum = sc.nextLine();
			     for (int i = 0; i < count; i++) {
					if (humanArr[i].getPhone().equals(PhoneNum)) {
						humanArr[i].printInfo();
					}else {System.out.println("�˻������ �����ϴ�");
				           break;}
			     }
			
		case 3 : if(count != 0)
			     for (int i = 0; i < count; i++) {
					humanArr[i].printInfo();
				}else System.out.println("�Էµ� ���� �����ϴ�");
			
			break;
			
		case 4 : System.exit(0);
		     break;

		default:System.out.println("�߸��� �Է�");
			break;
		}
	}
	
	public Human humanInsert() {
		sc.nextLine();
		System.out.println("�̸��� �Է�");
		String inputName = sc.nextLine();
		System.out.println("����ȣ�� �Է�");
		String inputCarnum = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է�");
		String inputPhone = sc.nextLine();
		System.out.println("��ġ�� �Է�");
		String inputLocation = sc.nextLine();
		
		Human h = new Human(inputName, inputCarnum, inputPhone, inputLocation);
		return h;
		
	}
	
	
	

}
