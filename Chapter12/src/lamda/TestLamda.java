package lamda;


interface PrintString{
	void showString(String str);
}

public class TestLamda {

	public static void main(String[] args) {
		
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr);
		
		PrintString test = returnString();
		test.showString("Test3");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}

	public static PrintString returnString() {
		return s->System.out.println(s + "!!!");
	}
	//함수의 구현부가 마치 변수처럼 반환돼서 변수값에 대입.
}
