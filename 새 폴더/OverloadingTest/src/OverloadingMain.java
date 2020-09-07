
public class OverloadingMain {
	
	public static void main(String[] args) {
		//1
		Calculator cal = new Calculator();
		int sum1 = cal.add(10, -50);
		double sum2 = cal.add(30.32, 1.46);
		System.out.println(sum1);
		System.out.println(sum2);
		
		//2
		Product[] pArr = new Product[3];
		Product p1 = new Product();
		p1.setName("»ç°ú");
		p1.setPrice(7000);
		
		Product p2 = new Product("¹è");
		Product p3 = new Product("±Ö", 5000);
		
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
	}
	
}
