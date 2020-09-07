public class MyClass {
	
	int age;
	String name;
	boolean isMale;
	
	
	
	public MyClass(int newAge, String newName, boolean newMale) {
		
		age = newAge;
		name = newName;
		isMale = newMale;
	
}
	
public MyClass(){
		
		
	}
	//사용자로부터 나이를 입력받아서 멤버변수 age에 대입하는 기능
	public void setAge(int newAge) {
		age = newAge;
}
}