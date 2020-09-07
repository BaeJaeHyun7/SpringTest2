package member.manager;

import java.util.Scanner;

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
			System.out.println("========================");
			System.out.println("1. 회원정보 등록");
			System.out.println("2. 회원정보 출력");
			System.out.println("3. 종료");
			System.out.println("========================");
		}
		
		public void inputMenu() {
			System.out.println("메뉴번호를 입력해 주세요 : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1 : if (count < 10) {
				memberArray[count] = memberInsert();
				count++;
			}else {
				System.out.println("회원 정보를 10개까지만 등록할수 있습니다");
			}
				
				break;
			case 2 : if (count != 0) {
				for (int i = 0; i < count; i++) {
					memberArray[i].printInfo();
				}
			}else {
				System.out.println("등록된 회원 정보가 없습니다.");
			}
				
				break;

			case 3 : System.exit(0);
	
				break;


			default : System.out.println("잘못 입력하셨습니다. 다시입력해 주세요");
				break;
			}
			
		}
		
		public Member memberInsert() {
			sc.nextLine();
			System.out.println("-------------------------------");
			System.out.println("회원 이름을 입력해주세요");
			String inputName = sc.nextLine();
			System.out.println("회원 전화번호를 입력해주세요");
			String inputPhone = sc.nextLine();
			System.out.println("회원 나이를 입력해주세요");
			int inputAge = sc.nextInt();
			
			Member m = new Member();
			m.setName(inputName);
			m.setPhone(inputPhone);
			m.setAge(inputAge);
			
			return m;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
    
    

}
