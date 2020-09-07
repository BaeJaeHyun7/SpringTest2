package member.vo;

public class Member {

	private String name;
	private String phone;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("-----------------------------");
		System.out.println("회원의 이름은 : "+name);
		System.out.println("회원의 전화번호는 : "+phone);
		System.out.println("회원의 나이는 : "+age);
		System.out.println("-----------------------------");
		
	}
	
	
	
	
	
}
