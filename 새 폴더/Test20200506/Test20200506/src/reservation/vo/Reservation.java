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
		System.out.println("�̸�  : "+name);
		System.out.println("����ȣ  : "+carnum);
		System.out.println("��ȭ��ȣ  : "+phone);
		System.out.println("�̸�  : "+location);
		System.out.println("==================");	
		
	}
	
	

}
