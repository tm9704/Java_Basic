package staticex;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		
		//이것도 생성 불가 
		//Calendar calendar = new Calendar();
		
		Calendar calendar = Calendar.getInstance();
	}

}
