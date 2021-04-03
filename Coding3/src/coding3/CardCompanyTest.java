package coding3;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.creatCard();
		Card yourCard = company.creatCard();
		
		System.out.println(myCard.getCardNum());
		System.out.println(yourCard.getCardNum());
		
		
	}

}
