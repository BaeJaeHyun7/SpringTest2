package member.vo;

//ȸ�������� �����ϴ� Ŭ����
public class Member {
	
	private String name;		//ȸ���̸�
	private String phone;		//ȸ����ȭ��ȣ
	private int age;			//ȸ������

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
		System.out.println("ȸ���� �̸��� : "+name);
		System.out.println("ȸ���� ��ȭ��ȣ�� : "+phone);
		System.out.println("ȸ���� ���̴� : "+age);
		System.out.println("-------------------------------------------");
	}
}
