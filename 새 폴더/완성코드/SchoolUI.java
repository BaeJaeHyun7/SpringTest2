import java.util.Scanner;

public class SchoolUI {

	private HumanManager hm = new HumanManager();
	private Scanner sc = new Scanner(System.in);
	
	public void printMainMenu() {
		System.out.println();
		System.out.println("==============");
		System.out.println("∥ 직원 관리 시스템  ∥");
		System.out.println("==============");
		System.out.println("1. 등록");
		System.out.println("2. 전체 출력");
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
		System.out.println("0. 상위 메뉴");
		System.out.println("=============");
		System.out.print("메뉴 선택 => ");
	}
	
	public void insert() {
		int choice = 0;
		
		while(true) {
			printInsertHumanMenu();
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				insertStudent();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
	
	public void insertStudent() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       학생 등록     ∥");
		System.out.println("=============");
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("학번 : ");
		int stNum = sc.nextInt();
		
		hm.insertStudent(name, age, stNum);
		System.out.println("정상 등록 완료");
	}
	
	public void showAll() {
		hm.showAll();
	}
	
	public void exec() {
		int choice = 0;
		
		while(true) {
			
			printMainMenu();
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				showAll();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
}
