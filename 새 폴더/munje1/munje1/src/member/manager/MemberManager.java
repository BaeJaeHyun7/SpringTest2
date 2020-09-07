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
		System.out.println("1. 회원정보 등록");
		System.out.println("2. 회원정보 출력");
		System.out.println("3. 종료");
		System.out.println("===================");		
	}
	
	public void inputMenu() {
		System.out.println("메뉴번호를 입력해 주세요 : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 : if (count < 10) {
			memberArr[count] = memberInsert();
			count++;
		}else {
			System.out.println("회원정보를 10개까지만 등록 할 수 있습니다.");
		}
			
			break;
			
		case 2: if (count != 0 ) {
			for (int i = 0; i < count; i++) {
				memberArr[i].printInfo();
			}
		}else {
			System.out.println("등록된 회원정보가 없습니다.");
		}
			
			break;
			
		case 3 : System.exit(0);
	
			break;

		default:System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요");
			break;
		}
	}
	
	public Member memberInsert() {
		sc.nextLine();
		System.out.println("회원 이름을 입력해 주세요 : ");
		String inputName = sc.nextLine();
		System.out.println("회원 전화번호를 입력해 주세요 : ");
		String inputPhone = sc.nextLine();
		System.out.println("회원 나이를 입력해 주세요 : ");
		int inputAge = sc.nextInt();
		
		Member m = new Member(inputName, inputPhone, inputAge);
		return m;
		
	}
	
	

}
