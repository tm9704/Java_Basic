package staticex;

public class Company {
	
	//유일한 객체 생성
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		//혹시 모르는 상황대비.
		if(instance == null)
			instance = new Company();
			
		return instance;
	}
}
