package reservation.manager;

import java.util.Scanner;

import reservation.vo.Reservation;

public class ReservationManager {
	
	Reservation [] reservationArr = new Reservation[100];
	int count = 0;
	Scanner sc = new Scanner(System.in);
	
	public ReservationManager() {		
		while (true) {
			printMenu();
			inputMenu();
	}
	}
	public void printMenu() {
		System.out.println("===============");
		System.out.println("1. ����");
		System.out.println("2. ��ȸ");
		System.out.println("3. ��ü���");
		System.out.println("4. ���α׷� ����");
		System.out.println("===============");
	}
	
	public void inputMenu() {
		System.out.println("���� : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : if (count < 100) {
			reservationArr[count] = inputInsert();
			count++;
		}else {
			System.out.println("100�� �ʰ�");
		}
			
			break;
		case 2 : sc.nextLine();
			     System.out.println("��ȭ��ȣ �Է�");
		         String inputPhonenum = sc.nextLine();
		         for (int i = 0; i < count; i++) {
					if (reservationArr[i].getPhone().equals(inputPhonenum)) {
						reservationArr[i].printInfo();
					}else {
						System.out.println("�˻������ �����ϴ�");
					}
				}
			
			break;
		case 3 : if (count != 0) {
			for (int i = 0; i < count; i++) {
				reservationArr[i].printInfo();
			}
		}else {
			System.out.println("�˻������ �����ϴ�");
		}
	
			break;
		case 4 : System.exit(0);
	
			break;
			

		default : System.out.println("�߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}
	
	public Reservation inputInsert() {
		sc.nextLine();
		System.out.println("�̸��� �Է� : ");
		String inputName = sc.nextLine();
		System.out.println("����ȣ�� �Է� : ");
		String inputCarnum = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է� : ");
		String inputPhone = sc.nextLine();
		System.out.println("��ġ�� �Է� : ");
		String inputLocation = sc.nextLine();
		
		Reservation r = new Reservation(inputName, inputCarnum, inputPhone, inputLocation);
		return r;
	}

}
