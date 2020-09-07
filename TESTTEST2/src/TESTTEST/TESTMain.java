package TESTTEST;

import java.util.ArrayList;
import java.util.Scanner;

public class TESTMain {

	public static void main(String[] args) {
		
		ArrayList<TESTVo> list = new ArrayList<TESTVo>();
		
		
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
				
				list.add(vo);
				break;
			case 2:
				for(int i=0; i<list.size(); i++) {
					System.out.println("ID : " + list.get(i).getId());
					System.out.println("PW : " + list.get(i).getPw());
					System.out.println("이름 : " + list.get(i).getName());
				}
				break;
			case 0:
				return;
			}
		
		}
	}
		
		
			
		}

	
	
	

