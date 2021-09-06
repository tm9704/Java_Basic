package selfcheck1;

public class Restorant {
	private long orderNum;
	String phoneNum;
	String address;
	int date;
	int time;
	int price;
	int menuNum;
	
	public Restorant (long orderNum, String phoneNum, String address, int date, int time, int price, int menuNum) {
		this.orderNum = orderNum;
		this.phoneNum = phoneNum;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNum = menuNum;
	}
	
	void showOrderInfo() {
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNum);
	}
	
}
