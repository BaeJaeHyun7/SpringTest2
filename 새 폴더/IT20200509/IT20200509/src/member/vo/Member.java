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
		System.out.println("ȸ���� �̸��� : "+name);
		System.out.println("ȸ���� ��ȭ��ȣ�� : "+phone);
		System.out.println("ȸ���� ���̴� : "+age);
		System.out.println("-----------------------------");
		
	}
	
	
	
	
	
}
