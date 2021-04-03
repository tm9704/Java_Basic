package coding3;

public class Card {
	private static int serialNum = 10000;
	private int cardNum;
	
	Card(){
		serialNum++;
		cardNum = serialNum;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNumber(int cardNum) {
		this.cardNum = cardNum;
	}
}
