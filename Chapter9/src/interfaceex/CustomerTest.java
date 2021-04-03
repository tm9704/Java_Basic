package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();

 		customer.buy();
 		customer.sell();
 		customer.order();
 		customer.sayHello();

 		Buy buyer = customer;
 		buyer.buy();
 		//인스턴스의 오더가 호출됨.
 		buyer.order();

 		Sell seller = customer;
 		seller.sell();
 		seller.order();
	}

}
