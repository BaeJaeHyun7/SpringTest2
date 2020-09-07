package reservation.vo;

public class Reservation {
	
	public String name;
	public String carnum;
	public String phone;
	public String location;
	
	public Reservation(String name, String carnum, String phone, String location) {
		
		this.name = name;
		this.carnum = carnum;
		this.phone = phone;
		this.location = location;
	}
	
	public void printInfo() {
		System.out.println("==================");
		System.out.println("이름  : "+name);
		System.out.println("차번호  : "+carnum);
		System.out.println("전화번호  : "+phone);
		System.out.println("이름  : "+location);
		System.out.println("==================");	
		
	}
	
	

}
