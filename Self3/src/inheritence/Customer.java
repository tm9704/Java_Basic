package inheritence;

public class Customer {
	protected String customerName;
	protected String customerGrade;
	protected int customerID;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer(String customerName, int customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
		customerGrade = "SILVER";
		bonusPoint = 1000;
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void getCustomerInfo() {
		System.out.println("이름은 " + customerName + "아이디는 " + customerID + "보너스 포인트는 " + bonusPoint + "입니다.");
	}

}
