
public class Human {
	
	String sn;
	String name;
	int age;
	
	public Human(String sn, String name, int age) {
		super();
		this.sn = sn;
		this.name = name;
		this.age = age;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println("sn : "+sn);
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		
	}
	
	

}
