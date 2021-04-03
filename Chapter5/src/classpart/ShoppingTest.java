package classpart;

public class ShoppingTest {

	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		
		shopping.orderNum = 201907210001L;
		shopping.id = "abc123";
		shopping.orderDate = "2019년 7월 21일";
		shopping.orderName = "홍길순";
		shopping.orderObjectNum = "PD0345-12";
		shopping.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + shopping.orderNum);
		System.out.println("주문자 아이디: " + shopping.id);
		System.out.println("주문자 이름: " + shopping.orderName);
		System.out.println("주문 날짜: " + shopping.orderDate);
		System.out.println("주문 상품 번호: " + shopping.orderObjectNum);
		System.out.println("배송 주소: " + shopping.address);
	}

}
