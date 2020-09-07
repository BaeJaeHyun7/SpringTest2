
public class SchoolManager {

	private Human[] arr = new Human[100];
	private int count = 0;
	
	public boolean insertHuman(Human h) {
		
		for(int i=0; i<count; i++) {
			Human temp = arr[i];
			
//			boolean result = h.getSn().equals(temp.getSn());
//			return !result;
			if(h.getSn().equals(temp.getSn())) return false;
		}
		
		if(h instanceof Student) {
			Student s1 = (Student)h;
			
			for(int i=0; i<count; i++) {
				Human temp = arr[i];
				
				if(temp instanceof Student) {
					Student s2 = (Student)temp;
					
//					boolean result = s1.getSsn().equals(s2.getSsn());
//					return !result;
					if(s1.getSsn().equals(s2.getSsn())) return false;
				}
			}
		}
		
		arr[count++] = h;
		return true;
	}
	
	public Human findHuman(String sn) {
		for(int i=0; i<count; i++) {
			Human temp = arr[i];
			
			if(sn.equals(temp.getSn())) return temp; 
		}
		
		return null;
	}
	
	public boolean deleteHuman(Human h) {
		for(int i=0; i<count; i++) {
			if(arr[i] == h) {
				for(int j=i; j<count-1; j++) {
					arr[j] = arr[j+1];
				}
				count--;
				return true;
			}
		}
		
		return false;
	}
	
	public void printAll() {
		
		for(int i=0; i<count; i++) {
			System.out.println();
			arr[i].print();
		}
	}
}
