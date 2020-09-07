
public class Student extends Human {

	private int stNum;

	public Student(String name, int age, int stNum) {
		super(name, age);
		this.stNum = stNum;
	}

	public int getStNum() {
		return stNum;
	}



	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("학번 : " + stNum);
	}
}
