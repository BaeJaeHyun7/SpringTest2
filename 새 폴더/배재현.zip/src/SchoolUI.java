import java.util.Scanner;

public class SchoolUI {
	
	SchoolManager sm = new SchoolManager();
	Scanner sc = new Scanner(System.in);
	
	public void printMainMenu() {
		System.out.println("==================");
		System.out.println("|| 직원 관리 시스템 ||");
		System.out.println("==================");
		System.out.println("1. 등록");
		System.out.println("2. 전체 출력");
		System.out.println("0. 종료");
		System.out.println("==================");
		System.out.println("메뉴 선택 =>");
	}
	
	public void printInsertHumanMenu() {
		System.out.println("============");
		System.out.println("|| 등록 메뉴 ||");
		System.out.println("============");
		System.out.println("1. 학생");
		System.out.println("2. 직원");
		System.out.println("3. 교수");
		System.out.println("0. 상위메뉴");
		System.out.println("============");
		System.out.println("메뉴 선택 =>");
	}
	
	public void printAll() {
		sm.printAll();
	}
	
	public void insertStudent() {
		System.out.println("============");
		System.out.println("|| 학생 등록 ||");
		System.out.println("============");
		System.out.print("이름 : ");
		String inputName = sc.nextLine();
		sc.nextLine();
		System.out.print("나이 : ");
		int inputAge = sc.nextInt();
		System.out.print("주민번호 : ");
		String inputSn = sc.nextLine();
		System.out.print("학번 : ");
		String inputSsn = sc.nextLine();
		
		Student student = new Student(inputSn, inputName, inputAge, inputSsn);
		boolean result = sm.insertHuman(student);
		
		if (result == true) {
			System.out.println("정상 등록 완료");
		}else {
			System.out.println("등록 오류(이미 존재하는 주민번호 또는 학번 )");
		}
	}
		
		public void insertStaff() {
			System.out.println("============");
			System.out.println("|| 학생 등록 ||");
			System.out.println("============");
			System.out.print("이름 : ");
			String inputName = sc.nextLine();
			sc.nextLine();
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			System.out.print("주민번호 : ");
			String inputSn = sc.nextLine();
			System.out.print("부서 : ");
			String inputField = sc.nextLine();
			
			Staff staff = new Staff(inputSn, inputName, inputAge, inputField);
			boolean result = sm.insertHuman(staff);
			
			if (result == true) {
				System.out.println("정상 등록 완료");
			}else {
				System.out.println("등록 오류(이미 존재하는 주민번호 또는 부서 )");
			}
		
	}
		
		public void insertProfessor() {
			System.out.println("============");
			System.out.println("|| 교수 등록 ||");
			System.out.println("============");
			System.out.print("이름 : ");
			String inputName = sc.nextLine();
			sc.nextLine();
			System.out.print("나이 : ");
			int inputAge = sc.nextInt();
			System.out.print("주민번호 : ");
			String inputSn = sc.nextLine();
			System.out.print("전공 : ");
			String inputMajor = sc.nextLine();
			
			Professor professor = new Professor(inputSn, inputName, inputAge, inputMajor);
			boolean result = sm.insertHuman(professor);
			
			if (result == true) {
				System.out.println("정상 등록 완료");
			}else {
				System.out.println("등록 오류(이미 존재하는 주민번호 또는 전공 )");
			}		
	}
		
		public void insertHuman() {
			while (true) {
				printInsertHumanMenu();
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1 : insertStudent();
					
					break;
					
				case 2 : insertStaff();
					
					break;
					
				case 3 : insertProfessor();
	
					break;
	
				case 0 :
	
					return;

				default : System.out.println("잘못된 입력");
					break;
				}
			}
		}
		
		public void exec() {
			
			while (true) {
				printMainMenu();
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1 : insertHuman();
					
					break;
					
				case 2 : printAll();
					
					break;
					
				case 0 :
	
					return;

				default : System.out.println("잘못된 입력");
					break;
				}
				
			}
		}
		
		

}
