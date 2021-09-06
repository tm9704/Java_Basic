package inheritence;

public class VIPCustomer extends Customer{
	private int agentID;
	private double salesRatio;

	public VIPCustomer() {
		super(null, 0);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		agentID = 1000;
	}
	
	public VIPCustomer(String customerName, int customerID) {
		super(customerName, customerID);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		agentID = 1000;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
