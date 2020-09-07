package member.vo;

//회원정보를 저장하는 클래스
public class Member {
	
	private String name;		//회원이름
	private String phone;		//회원전화번호
	private int age;			//회원나이

	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String newPhone) {
		phone = newPhone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void printMemberInfo() {
		System.out.println("-------------------------------------------");
		System.out.println("회원의 이름은 : "+name);
		System.out.println("회원의 전화번호는 : "+phone);
		System.out.println("회원의 나이는 : "+age);
		System.out.println("-------------------------------------------");
	}
}
