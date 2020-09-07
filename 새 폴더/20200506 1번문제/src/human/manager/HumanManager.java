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
		System.out.println("1. 예약");
		System.out.println("2. 조회");
		System.out.println("3. 전체출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("============");	
	}
	
	public void inputMenu() {
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : if(count < 100) {humanArr[count] = humanInsert();
		                          count++;}
		
		         else System.out.println("100명 초과");
			break;
		case 2 : sc.nextLine();
			     System.out.println("전화번호 입력 : ");
		         String PhoneNum = sc.nextLine();
			     for (int i = 0; i < count; i++) {
					if (humanArr[i].getPhone().equals(PhoneNum)) {
						humanArr[i].printInfo();
					}else {System.out.println("검색결과가 없습니다");
				           break;}
			     }
			
		case 3 : if(count != 0)
			     for (int i = 0; i < count; i++) {
					humanArr[i].printInfo();
				}else System.out.println("입력된 값이 없습니다");
			
			break;
			
		case 4 : System.exit(0);
		     break;

		default:System.out.println("잘못된 입력");
			break;
		}
	}
	
	public Human humanInsert() {
		sc.nextLine();
		System.out.println("이름을 입력");
		String inputName = sc.nextLine();
		System.out.println("차번호를 입력");
		String inputCarnum = sc.nextLine();
		System.out.println("전화번호를 입력");
		String inputPhone = sc.nextLine();
		System.out.println("위치를 입력");
		String inputLocation = sc.nextLine();
		
		Human h = new Human(inputName, inputCarnum, inputPhone, inputLocation);
		return h;
		
	}
	
	
	

}
