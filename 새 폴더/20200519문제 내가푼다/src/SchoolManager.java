
public class SchoolManager {
	
	Human [] humanArr = new Human[100];
	int count = 0;
	
	public boolean insertHuman(Human h) {
		
		for (int i = 0; i < count; i++) {
			if (humanArr[i].getSn().equals(h.getSn())) {
				return false;
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

}
