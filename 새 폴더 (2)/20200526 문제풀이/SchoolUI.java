import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolUI {

	private SchoolManager sm = new SchoolManager();
	private Scanner sc = new Scanner(System.in);
	
	public void printMainMenu() {
		System.out.println();
		System.out.println("==============");
		System.out.println("∥ 직원 관리 시스템  ∥");
		System.out.println("==============");
		System.out.println("1. 등록");
		System.out.println("2. 찾기");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
		System.out.println("0. 종료");
		System.out.println("=============");
		System.out.print("메뉴 선택 => ");
	}
	
	public void printInsertHumanMenu() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥        등록 메뉴    ∥");
		System.out.println("=============");
		System.out.println("1. 학생");
		System.out.println("2. 직원");
		System.out.println("3. 교수");
		System.out.println("0. 상위 메뉴");
		System.out.println("=============");
		System.out.print("메뉴 선택 => ");
	}
	
	public void insertHuman() {
		boolean result = false;
		
		while(true) {
			printInsertHumanMenu();
			
			try {
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					result = insertStudent();
					if(result) System.out.println("정상 등록 완료");
					else System.out.println("등록 오류");
					break;
				case 2:
					result = insertStaff();
					if(result) System.out.println("정상 등록 완료");
					else System.out.println("등록 오류");
					break;
				case 3:
					result = insertProfessor();
					if(result) System.out.println("정상 등록 완료");
					else System.out.println("등록 오류");
					break;
				case 0:
					return;
				default:
					System.out.println("잘못된 입력");
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				sc.nextLine();
			}
			
			
		}
	}
	
	public boolean insertStudent() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       학생 등록     ∥");
		System.out.println("=============");
		
		try {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("주민번호 : ");
			String sn = sc.next();
			System.out.print("학번 : ");
			String ssn = sc.next();
			
			Student s = new Student(sn, name, age, ssn);
			return sm.insertHuman(s);
			
		} catch(InputMismatchException e) {
			System.out.println("잘못된 입력");
			sc.nextLine();
			return false;
		}
	}
	
	public boolean insertStaff() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       직원 등록     ∥");
		System.out.println("=============");
		
		try {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("주민번호 : ");
			String sn = sc.next();
			System.out.print("부서 : ");
			String field = sc.next();
			
			Staff s = new Staff(sn, name, age, field);
			return sm.insertHuman(s);
		} catch(InputMismatchException e) {
			System.out.println("잘못된 입력");
			sc.nextLine();
			return false;
		}
		
	}
	
	public boolean insertProfessor() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       교수 등록     ∥");
		System.out.println("=============");
		
		try {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("주민번호 : ");
			String sn = sc.next();
			System.out.print("전공 : ");
			String major = sc.next();
			
			Professor p = new Professor(sn, name, age, major);
			return sm.insertHuman(p);
		}catch(InputMismatchException e) {
			System.out.println("잘못된 입력");
			sc.nextLine();
			return false;
		}
	}
	
	public Human findHuman() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       정보 출력     ∥");
		System.out.println("=============");
		
		System.out.print("주민번호 입력 : ");
		String sn = sc.next();
		
		return sm.findHuman(sn);
	}
	
	public void printAll() {
		sm.printAll();
	}
	
	public boolean deleteHuman() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥         삭 제       ∥");
		System.out.println("=============");
		System.out.print("주민번호 : ");
		String sn = sc.next();
		
		Human h = sm.findHuman(sn);
		
		if(h == null) return false;
		return sm.deleteHuman(h);
	}
	
	public void exec() {
		Human h = null;
		boolean result = false;
		
		while(true) {
			
			printMainMenu();
			
			try {
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					insertHuman();
					break;
				case 2:
					h = findHuman();
					if(h != null) h.print();
					else System.out.println("일치하는 정보 없음");
					break;
				case 3:
					result = deleteHuman();
					if(result) System.out.println("삭제 성공");
					else System.out.println("삭제 실패");
					break;
				case 4:
					printAll();
					break;
				case 0:
					return;
				default:
					System.out.println("잘못된 입력");
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				sc.nextLine();
			}
		}
	}
}
