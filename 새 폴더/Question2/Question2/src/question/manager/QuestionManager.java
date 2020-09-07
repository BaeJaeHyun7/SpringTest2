package question.manager;

import java.util.Scanner;

import question.vo.Question;

public class QuestionManager {
	
	Scanner sc = new Scanner(System.in);
    Question [] questionArray = new Question[100];
    int count = 0;
	
	public QuestionManager() {
		do {
			printMenu();
			inputMenu();
			
		} while (true);
		
		
	}
	
	public void printMenu() {
		System.out.println("===============");
		System.out.println("1.���");
		System.out.println("2.���");
		System.out.println("===============");		
	}
	
	public void inputMenu() {
		System.out.println("���� : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		
		case 1 : if (count < 100) {
			if (count < 100) {
				questionArray[count] = questionInsert();
				count++;
			}else {System.out.println("100���ʰ�");}
		}
			
			break;
			
		case 2 : if (count != 0) {
			for (int i = 0; i < count; i++) {
				questionArray[i].printInfo();		
				
			}
		}else {System.out.println("����� �ο��� �����ϴ�");}
			
			break;

		default : System.out.println("�߸��Է��ϼ̽��ϴ�");
			break;
		}
		
	}
	
	
	
	public Question questionInsert() {
		sc.nextLine();
		System.out.println("ID �Է� : ");
		String inputid = sc.nextLine();
		System.out.println("PW �Է� : ");
		String inputpw = sc.nextLine();
		System.out.println("�̸� �Է� : ");
		String inputName = sc.nextLine();
		
		Question q = new Question(inputid, inputpw, inputName);
		
		return q;
	}	
	
	
		
	}	


