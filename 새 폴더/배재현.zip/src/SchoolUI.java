import java.util.Scanner;

public class SchoolUI {
	
	SchoolManager sm = new SchoolManager();
	Scanner sc = new Scanner(System.in);
	
	public void printMainMenu() {
		System.out.println("==================");
		System.out.println("|| ���� ���� �ý��� ||");
		System.out.println("==================");
		System.out.println("1. ���");
		System.out.println("2. ��ü ���");
		System.out.println("0. ����");
		System.out.println("==================");
		System.out.println("�޴� ���� =>");
	}
	
	public void printInsertHumanMenu() {
		System.out.println("============");
		System.out.println("|| ��� �޴� ||");
		System.out.println("============");
		System.out.println("1. �л�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("0. �����޴�");
		System.out.println("============");
		System.out.println("�޴� ���� =>");
	}
	
	public void printAll() {
		sm.printAll();
	}
	
	public void insertStudent() {
		System.out.println("============");
		System.out.println("|| �л� ��� ||");
		System.out.println("============");
		System.out.print("�̸� : ");
		String inputName = sc.nextLine();
		sc.nextLine();
		System.out.print("���� : ");
		int inputAge = sc.nextInt();
		System.out.print("�ֹι�ȣ : ");
		String inputSn = sc.nextLine();
		System.out.print("�й� : ");
		String inputSsn = sc.nextLine();
		
		Student student = new Student(inputSn, inputName, inputAge, inputSsn);
		boolean result = sm.insertHuman(student);
		
		if (result == true) {
			System.out.println("���� ��� �Ϸ�");
		}else {
			System.out.println("��� ����(�̹� �����ϴ� �ֹι�ȣ �Ǵ� �й� )");
		}
	}
		
		public void insertStaff() {
			System.out.println("============");
			System.out.println("|| �л� ��� ||");
			System.out.println("============");
			System.out.print("�̸� : ");
			String inputName = sc.nextLine();
			sc.nextLine();
			System.out.print("���� : ");
			int inputAge = sc.nextInt();
			System.out.print("�ֹι�ȣ : ");
			String inputSn = sc.nextLine();
			System.out.print("�μ� : ");
			String inputField = sc.nextLine();
			
			Staff staff = new Staff(inputSn, inputName, inputAge, inputField);
			boolean result = sm.insertHuman(staff);
			
			if (result == true) {
				System.out.println("���� ��� �Ϸ�");
			}else {
				System.out.println("��� ����(�̹� �����ϴ� �ֹι�ȣ �Ǵ� �μ� )");
			}
		
	}
		
		public void insertProfessor() {
			System.out.println("============");
			System.out.println("|| ���� ��� ||");
			System.out.println("============");
			System.out.print("�̸� : ");
			String inputName = sc.nextLine();
			sc.nextLine();
			System.out.print("���� : ");
			int inputAge = sc.nextInt();
			System.out.print("�ֹι�ȣ : ");
			String inputSn = sc.nextLine();
			System.out.print("���� : ");
			String inputMajor = sc.nextLine();
			
			Professor professor = new Professor(inputSn, inputName, inputAge, inputMajor);
			boolean result = sm.insertHuman(professor);
			
			if (result == true) {
				System.out.println("���� ��� �Ϸ�");
			}else {
				System.out.println("��� ����(�̹� �����ϴ� �ֹι�ȣ �Ǵ� ���� )");
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

				default : System.out.println("�߸��� �Է�");
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

				default : System.out.println("�߸��� �Է�");
					break;
				}
				
			}
		}
		
		

}
