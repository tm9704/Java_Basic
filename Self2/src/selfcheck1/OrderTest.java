package selfcheck1;

public class OrderTest {

	public static void main(String[] args) {
		Person personTom = new Person(170, 78, "Tomas", 37);
		
		personTom.showPersonInfo();
		
		Restorant restorant = new Restorant(202011020003L, "01023450001", "서울시 강남구 역삼동 111-333", 
				20201102, 130258, 35000, 3);
		
		restorant.showOrderInfo();

	}

}
