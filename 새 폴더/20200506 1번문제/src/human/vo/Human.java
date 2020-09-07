package human.vo;

public class Human {
	
	private String name;
	private String carnum;
	private String phone;
	private String location;
		
	public Human(String name, String carnum, String phone, String location) {
		super();
		this.name = name;
		this.carnum = carnum;
		this.phone = phone;
		this.location = location;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarnum() {
		return carnum;
	}
	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("차번호 : "+carnum);
		System.out.println("전화번호 : "+phone);
		System.out.println("위치 : "+location);
	}

}
