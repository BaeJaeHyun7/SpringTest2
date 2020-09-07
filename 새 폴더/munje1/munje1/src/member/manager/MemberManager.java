package member.manager;

import java.util.Scanner;

import member.vo.Member;

public class MemberManager {
	
	Member [] memberArr = new Member[10];
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public MemberManager() {
		while (true) {
			printMenu();
			inputMenu();
		}
		
		
	}
	
	public void printMenu() {
		System.out.println("===================");
		System.out.println("1. ȸ������ ���");
		System.out.println("2. ȸ������ ���");
		System.out.println("3. ����");
		System.out.println("===================");		
	}
	
	public void inputMenu() {
		System.out.println("�޴���ȣ�� �Է��� �ּ��� : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : if (count < 10) {
			memberArr[count] = memberInsert();
			count++;
		}else {
			System.out.println("ȸ�������� 10�������� ��� �� �� �ֽ��ϴ�.");
		}
			
			break;
			
		case 2: if (count != 0 ) {
			for (int i = 0; i < count; i++) {
				memberArr[i].printInfo();
			}
		}else {
			System.out.println("��ϵ� ȸ�������� �����ϴ�.");
		}
			
			break;
			
		case 3 : System.exit(0);
	
			break;

		default:System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
			break;
		}
	}
	
	public Member memberInsert() {
		sc.nextLine();
		System.out.println("ȸ�� �̸��� �Է��� �ּ��� : ");
		String inputName = sc.nextLine();
		System.out.println("ȸ�� ��ȭ��ȣ�� �Է��� �ּ��� : ");
		String inputPhone = sc.nextLine();
		System.out.println("ȸ�� ���̸� �Է��� �ּ��� : ");
		int inputAge = sc.nextInt();
		
		Member m = new Member(inputName, inputPhone, inputAge);
		return m;
		
	}
	
	

}
