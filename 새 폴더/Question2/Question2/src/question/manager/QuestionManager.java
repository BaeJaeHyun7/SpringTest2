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
		System.out.println("1.등록");
		System.out.println("2.출력");
		System.out.println("===============");		
	}
	
	public void inputMenu() {
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		
		case 1 : if (count < 100) {
			if (count < 100) {
				questionArray[count] = questionInsert();
				count++;
			}else {System.out.println("100명초과");}
		}
			
			break;
			
		case 2 : if (count != 0) {
			for (int i = 0; i < count; i++) {
				questionArray[i].printInfo();		
				
			}
		}else {System.out.println("저장된 인원이 없습니다");}
			
			break;

		default : System.out.println("잘못입력하셨습니다");
			break;
		}
		
	}
	
	
	
	public Question questionInsert() {
		sc.nextLine();
		System.out.println("ID 입력 : ");
		String inputid = sc.nextLine();
		System.out.println("PW 입력 : ");
		String inputpw = sc.nextLine();
		System.out.println("이름 입력 : ");
		String inputName = sc.nextLine();
		
		Question q = new Question(inputid, inputpw, inputName);
		
		return q;
	}	
	
	
		
	}	


