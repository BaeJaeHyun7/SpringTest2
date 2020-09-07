package member.manager;

import java.util.Scanner;

import member.vo.Member;

//ȸ�������� ����� ����ϴ� Ŭ����
public class MemberManager {
	
	//Ŭ�����ȿ��� ��𼭵� ����� �������� ��������� ��ġ���� Scanner�� ����
	Scanner sc = new Scanner(System.in);
	
	//����ڷκ��� �Է¹��� ������ ������ ȸ�� �迭 ��ü
	private Member[] memberArray = new Member[10];
	
	//ȸ�� ������ ������ ������ ����
	private int memberCnt;
	
	//ManagerŬ������ ������
	public MemberManager() {
		
		do {
			//���θ޴� ���
			printMenu();
			//����ڷ� ���� �޴� ��ȣ �Է� �ް� ��� ����
			inputInfo();
			
		}while(true);
			
	}
	
	//���θ޴��� ����ϴ� ���
	private void printMenu() {
		System.out.println("===================================");
		System.out.println("1. ȸ������ ���");
		System.out.println("2. ȸ������ ���");
		System.out.println("3. ����");
		System.out.println("===================================");
	}
	
	private void inputInfo() {
		System.out.print("�޴� ��ȣ�� �Է��� �ּ��� : ");
		int menuNum = sc.nextInt();
		
		switch (menuNum) {
		case 1:
			
			//��ϵ� ȸ�� ������ 10���� �Ѿ�� ������
			//��, ȸ�� ���� �迭�� ũ�⺸�� ������
			if(memberCnt < 10) {
				//ȸ������ ���
				memberArray[memberCnt] = memberInsert();
				
				//��ϵ� ȸ�� ���� �� 1 ����
				memberCnt++;
			} else {
				System.out.println("ȸ�� ������ 10�� ������ ��� �� �� �ֽ��ϴ�.");
			}
			
			break;
		case 2:
			//memberCnt�� 0 �϶��� ���� ȸ���� 1�� ���� ����
			if(memberCnt != 0) {
				//ȸ������ ���
				for(int i=0; i < memberCnt; i++) {
					memberArray[i].printMemberInfo();
				}
			} else {
				System.out.println("------------------------");
				System.out.println("��ϵ� ȸ�� ������ �����ϴ�.");
				System.out.println("------------------------");
			}
			break;
		case 3:
			//���ø����̼� ����
			System.exit(0);
		default:
			//�߸��� �Է�
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
			break;
		}
		
	}
	
	private Member memberInsert() {
		
		//Scanner�� ���� �Է��ؼ� �ʱ�ȭ �ϴ� �۾�
		/*
		 * Scanner�� nextInt()���Ŀ� nextLine()�� ����ϱ� ���ؼ��� Scanner�� �ʱ�ȭ ���־�� �Ѵ�.
		 * nextLine()�Լ��� ���͸� �ν��ؼ� �Է��� �������� �Ǵ��Ѵ�.
		 * nextInt()�Լ� ���Ŀ� ����ڰ� ���� �Է��ϰ� ���͸� ġ�� ���
		 * �Է��� ���� nextInt()�� ���ؼ� ���� ������ �� �ڿ� ���Ͱ� ���� Scanner�� ���� �ִ� �����̴�.
		 * ���� nextLine()�Լ��� �ѹ��� ����ϹǷν� ������ �ԷµǾ��� ���͸� ó���� �� �ֵ��� ���ش�.
		 * */
		sc.nextLine();
		
		System.out.println("-----------------------------------------");
		System.out.print("ȸ�� �̸��� �Է��� �ּ��� : ");
		String inputName = sc.nextLine();
		System.out.print("ȸ�� ��ȭ��ȣ�� �Է��� �ּ��� : ");
		String inputPhone = sc.nextLine();
		System.out.print("ȸ�� ���̸� �Է��� �ּ��� : ");
		int inputAge = sc.nextInt();
		
		Member m = new Member();
		m.setName(inputName);
		m.setPhone(inputPhone);
		m.setAge(inputAge);
		
		return m;
	}
	
}
