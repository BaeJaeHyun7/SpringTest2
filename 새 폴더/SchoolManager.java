import java.util.ArrayList;

public class SchoolManager {

	private ArrayList<Human> list = new ArrayList<>();
	
	public boolean insertHuman(Human h) {
		
		for(Human temp : list) {
			if(h.getSn().equals(temp.getSn())) return false;
			if(h instanceof Student && temp instanceof Student) {
				Student s1 = (Student)h;
				Student s2 = (Student)temp;
				if(s1.getSsn().equals(s2.getSsn())) return false;
			}
		}
		
		return list.add(h);
	}
	
	public Human findHuman(String sn) {
//		for(int i=0; i<list.size(); i++) {
//			Human temp = list.get(i);
//			if(sn.equals(temp.getSn())) return temp; 
//		}
		for(Human temp : list) {
			if(sn.equals(temp.getSn())) return temp; 
		}
		
		return null;
	}
	
	public boolean deleteHuman(Human h) {
		return list.remove(h);
	}
	
	public void printAll() {
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println();
//			list.get(i).print();
//		}
		for(Human temp : list) {
			System.out.println();
			temp.print();
		}
	}
}
