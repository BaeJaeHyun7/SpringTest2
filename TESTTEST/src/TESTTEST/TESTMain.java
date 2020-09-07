package TESTTEST;

import java.util.Scanner;

public class TESTMain {

	public static void main(String[] args) {
		
		TESTVo[] array = new TESTVo[100];
		int count = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=================");
			System.out.println("1. 등록");
			System.out.println("2. 출력");
			System.out.println("=================");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.print("ID 입력 : ");
				String id = sc.nextLine();
				System.out.print("PW 입력 : ");
				String pw = sc.nextLine();
				System.out.print("이름 입력 : ");
				String name = sc.nextLine();
				
				TESTVo vo = new TESTVo(id, pw, name);
				
				array[count] = vo;
				count++;
				break;
			case 2:
				for(int i=0; i<count; i++) {
					System.out.println("ID : " + array[i].getId());
					System.out.println("PW : " + array[i].getPw());
					System.out.println("이름 : " + array[i].getName());
				}
				break;
			case 0:
				return;
			}
		
		}
	}
		
		
			
		}

	
	
	

