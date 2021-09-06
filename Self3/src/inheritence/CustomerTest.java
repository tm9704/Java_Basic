package inheritence;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer("Lee", 10010);
		Customer customerKim = new VIPCustomer("Kim", 10020);
		
		customerLee.calcPrice(1000);
		customerKim.calcPrice(1000);
		
		customerLee.getCustomerInfo();
		customerKim.getCustomerInfo();
	}

}
