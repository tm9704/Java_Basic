package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//이미 버스랑 지하철이 생성되어있고 그걸 매개변수로 받으면 됨.
	//객체의 협업
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -=1200;
	}
	
	public void takeTexi(Texi texi) {
		texi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + 
	money + "원 입니다.");
	}
	
}
