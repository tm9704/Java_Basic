package cooperation;

public class Texi {
	int TexiNum;
	int money;
	
	public Texi(int TexiNum) {
		this.TexiNum = TexiNum;
	}
	
	public void take(int money) { //승차 메소드
		this.money += money;
	}
	
	public void showTexiInfo() {
		System.out.println(TexiNum + "번 택시의 수입은 " + money + "원 입니다.");
	}
}
