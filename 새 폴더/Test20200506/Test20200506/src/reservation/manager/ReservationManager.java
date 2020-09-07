package reservation.manager;

import java.util.Scanner;

import reservation.vo.Reservation;

public class ReservationManager {
	
	Scanner sc = new Scanner(System.in);
	
	Reservation [] reservationArray = new Reservation[100];
	int count = 0;
	
	public ReservationManager() {
		do {
			printMenu();
			inputMenu();
			
		} while (true);		
	}
	
	public void printMenu() {
		System.out.println("===================");
		System.out.println("1. ����");
		System.out.println("2. ��ȸ");
		System.out.println("3. ��ü���");
		System.out.println("4. ���α׷� ����");
		System.out.println("===================");		
	}
	
	public void inputMenu() {
		System.out.println("����");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 :if (count < 100) {
			reservationArray[count] = reservationInsert();{
			count++;	
			}
		}else {System.out.println("�Է��μ� �ʰ�");}
			
			break;
			
		case 2 : sc.nextLine();
			     System.out.println("��ȭ��ȣ �Է� : ");
		         String phoneNum = sc.nextLine();
		         for (int i = 0; i < count; i++) {
					if (reservationArray[i].phone.equals(phoneNum)) {
						reservationArray[i].printInfo();
					    break;
						
					}else {System.out.println("�˻������ �����ϴ�");
					       }
					      
				}		         
		         
			
			break;
			
		case 3 : if (count != 0) {
			for (int i = 0; i < count; i++) {
				reservationArray[i].printInfo();
			}
		}else {System.out.println("�Է��μ��� �����ϴ�");
			
		}
	
			break;
	
		case 4 : System.exit(0);
	
			break;

		default:System.out.println("�߸��Է��ϼ̽��ϴ�");
			break;
		}
		
	}
	
	public Reservation reservationInsert() {
		sc.nextLine();
		System.out.println("�̸��� �Է�");
		String inputName = sc.nextLine();
		System.out.println("����ȣ�� �Է�");
		String inputCarnum = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է�");
		String inputPhone = sc.nextLine();
		System.out.println("��ġ�� �Է�");
		String inputLocation = sc.nextLine();
		
		Reservation r = new Reservation(inputName, inputCarnum, inputPhone, inputLocation);
		
		return r;
		
		
		
	}
	
	

}
