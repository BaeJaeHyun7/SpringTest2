package question.vo;

public class Question {		
		
		public String id;
		public String pw;
		public String name;
		
		public Question(String id, String pw, String name) {
			
			this.id = id;
			this.pw = pw;
			this.name = name;
		}
		
		public void printInfo() {
			System.out.println("ID : "+name);
			System.out.println("PW : "+pw);
			System.out.println("¿Ã∏ß : "+name);	
	}
		
		

}
