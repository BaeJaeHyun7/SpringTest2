package member.manager;

import java.util.Scanner;

import member.vo.Member;

public class MemberManager {
	
	Scanner sc = new Scanner(System.in);
	
	Member [] memberArray = new Member[10];
	int count = 0;

	public MemberManager() {
		do {
			printMenu();
			inputMenu();
			
		} while (true);		
	}
	
	
	public void printMenu() {
		System.out.println("===================");
		System.out.println("1. ȸ������ ���");
		System.out.println("2. ȸ������ ���");
		System.out.println("3. ����");
		System.out.println("===================");		
	}
	
	public void inputMenu() {
		System.out.println("�޴���ȣ�� �Է��� �ּ���:");
		int menuNum = sc.nextInt();
		
		switch (menuNum) {
		
		case 1 : if (count < 10) {
			memberArray[count] = memberInsert();
			count++;
		}else {System.out.println("ȸ�������� 10�������� ����Ҽ� �ֽ��ϴ�");
			
		}			
			break;
			
		case 2 : if (count != 0) {
			for (int i = 0; i < count; i++) {
				memberArray[i].printInfo();
			}
		}else {System.out.println("----------------------");
			   System.out.println("��ϵ� ȸ�������� �����ϴ�");
			   System.out.println("----------------------");}
			
			break;
		
		case 3 : System.exit(0);
	
			break;


		default : System.out.println("�߸��Է��߽��ϴ�");
			break;
		}
		
	}
	
	public Member memberInsert() {
		sc.nextLine();
		System.out.println("ȸ���̸��� �Է��� �ּ��� : ");
		String inputName = sc.nextLine();
		System.out.println("ȸ�� ��ȭ��ȣ�� �Է��� �ּ��� : ");
		String inputPhone = sc.nextLine();
		System.out.println("ȸ�����̸� �Է��� �ּ��� : ");
		int inputAge = sc.nextInt();
		
		Member m = new Member();
		m.setName(inputName);
		m.setPhone(inputPhone);
		m.setAge(inputAge);
		
		return m;
		
		
		
	}
	
	

}
