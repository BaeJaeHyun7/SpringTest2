package member.manager;

import java.util.Scanner;

import member.vo.Member;

//회원정보의 기능을 담당하는 클래스
public class MemberManager {
	
	//클래스안에서 어디서든 사용할 목적으로 멤버변수의 위치에서 Scanner를 생성
	Scanner sc = new Scanner(System.in);
	
	//사용자로부터 입력받은 정보를 저장할 회원 배열 객체
	private Member[] memberArray = new Member[10];
	
	//회원 정보의 개수를 저장할 변수
	private int memberCnt;
	
	//Manager클래스의 생성자
	public MemberManager() {
		
		do {
			//메인메뉴 출력
			printMenu();
			//사용자로 부터 메뉴 번호 입력 받고 기능 연결
			inputInfo();
			
		}while(true);
			
	}
	
	//메인메뉴를 출력하는 기능
	private void printMenu() {
		System.out.println("===================================");
		System.out.println("1. 회원정보 등록");
		System.out.println("2. 회원정보 출력");
		System.out.println("3. 종료");
		System.out.println("===================================");
	}
	
	private void inputInfo() {
		System.out.print("메뉴 번호를 입력해 주세요 : ");
		int menuNum = sc.nextInt();
		
		switch (menuNum) {
		case 1:
			
			//등록된 회원 정보가 10개를 넘어서지 않으면
			//즉, 회원 정보 배열의 크기보다 작으면
			if(memberCnt < 10) {
				//회원정보 등록
				memberArray[memberCnt] = memberInsert();
				
				//등록된 회원 정보 수 1 증가
				memberCnt++;
			} else {
				System.out.println("회원 정보를 10개 까지만 등록 할 수 있습니다.");
			}
			
			break;
		case 2:
			//memberCnt가 0 일때는 아직 회원이 1명도 없는 상태
			if(memberCnt != 0) {
				//회원정보 출력
				for(int i=0; i < memberCnt; i++) {
					memberArray[i].printMemberInfo();
				}
			} else {
				System.out.println("------------------------");
				System.out.println("등록된 회원 정보가 없습니다.");
				System.out.println("------------------------");
			}
			break;
		case 3:
			//어플리케이션 종료
			System.exit(0);
		default:
			//잘못된 입력
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			break;
		}
		
	}
	
	private Member memberInsert() {
		
		//Scanner에 빈값을 입력해서 초기화 하는 작업
		/*
		 * Scanner의 nextInt()이후에 nextLine()을 사용하기 위해서는 Scanner를 초기화 해주어야 한다.
		 * nextLine()함수는 엔터를 인식해서 입력이 끝난것을 판단한다.
		 * nextInt()함수 이후에 사용자가 값을 입력하고 엔터를 치는 경우
		 * 입력한 값은 nextInt()에 의해서 대입 되지만 그 뒤에 엔터가 아직 Scanner에 남아 있는 상태이다.
		 * 따라서 nextLine()함수를 한번더 사용하므로써 이전에 입력되었던 엔터를 처리할 수 있도록 해준다.
		 * */
		sc.nextLine();
		
		System.out.println("-----------------------------------------");
		System.out.print("회원 이름을 입력해 주세요 : ");
		String inputName = sc.nextLine();
		System.out.print("회원 전화번호를 입력해 주세요 : ");
		String inputPhone = sc.nextLine();
		System.out.print("회원 나이를 입력해 주세요 : ");
		int inputAge = sc.nextInt();
		
		Member m = new Member();
		m.setName(inputName);
		m.setPhone(inputPhone);
		m.setAge(inputAge);
		
		return m;
	}
	
}
