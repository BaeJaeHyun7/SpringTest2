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
		System.out.println("1. 예약");
		System.out.println("2. 조회");
		System.out.println("3. 전체출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("===============");
	}
	
	public void inputMenu() {
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : if (count < 100) {
			reservationArr[count] = inputInsert();
			count++;
		}else {
			System.out.println("100명 초과");
		}
			
			break;
		case 2 : sc.nextLine();
			     System.out.println("전화번호 입력");
		         String inputPhonenum = sc.nextLine();
		         for (int i = 0; i < count; i++) {
					if (reservationArr[i].getPhone().equals(inputPhonenum)) {
						reservationArr[i].printInfo();
					}else {
						System.out.println("검색결과가 없습니다");
					}
				}
			
			break;
		case 3 : if (count != 0) {
			for (int i = 0; i < count; i++) {
				reservationArr[i].printInfo();
			}
		}else {
			System.out.println("검색결과가 없습니다");
		}
	
			break;
		case 4 : System.exit(0);
	
			break;
			

		default : System.out.println("잘못 입력하셨습니다");
			break;
		}
	}
	
	public Reservation inputInsert() {
		sc.nextLine();
		System.out.println("이름을 입력 : ");
		String inputName = sc.nextLine();
		System.out.println("차번호를 입력 : ");
		String inputCarnum = sc.nextLine();
		System.out.println("전화번호를 입력 : ");
		String inputPhone = sc.nextLine();
		System.out.println("위치를 입력 : ");
		String inputLocation = sc.nextLine();
		
		Reservation r = new Reservation(inputName, inputCarnum, inputPhone, inputLocation);
		return r;
	}

}
