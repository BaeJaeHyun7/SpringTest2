
public class HumanManager {

	private Human[] arr = new Human[100];
	int count = 0;
	
	public void insertStudent(String name, int age, int stNum) {
		Student s = new Student(name, age, stNum);
		arr[count++] = s;
	}
	
	public void showAll() {
		for(int i=0; i<count; i++) {
			arr[i].showInfo();
			System.out.println();
		}
	}
	
}
