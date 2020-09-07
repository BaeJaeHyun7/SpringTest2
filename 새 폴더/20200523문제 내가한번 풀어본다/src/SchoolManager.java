
public class SchoolManager {
	
	Human [] humanArr = new Human[100];
	int count = 0;
	
	public boolean insertHuman(Human h) {
		
		
		
		for (int i = 0; i < count; i++) {
			if (humanArr[i].getSn().equals(h.getSn())) {
				return false;
			}
		}
		
		if (h instanceof Student) {
			Student student1 = (Student)h;
			
			for (int i = 0; i < count; i++) {
				if (humanArr[i] instanceof Student) {
					Student student2 = (Student)humanArr[i];
					
					if (student1.getSsn().equals(student2.getSsn())) {
						return false;
					}
				}
			}
			
		}humanArr[count] = h;
		 count++;
		 return true;
		
	}
	
	public void printAll() {
		for (int i = 0; i < count; i++) {
			humanArr[i].print();
		}
	}
	
	public Human findHuman(String sn) {
		
		for (int i = 0; i < count ; i++) {
			if (humanArr[i].getSn().equals(sn)) 
				return humanArr[i];
			}		
	     return null;		
	}
	
	public boolean deleteHuman(Human h) {
		
		for (int i = 0; i < count; i++) {
			if (humanArr[i] == h) {
				for (int j = 0; j < count-1; j++) {
					humanArr[j] = humanArr[j+1];
				}
				count--;
				return true;
			}
		}return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
