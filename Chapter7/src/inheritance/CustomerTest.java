package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		/*Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		*/
		Customer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000; 
		System.out.println(customerKim.showCustomerInfo());
	} 

}