package notgenericex;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		//Object를 사용하는 경우 형 변환을 해야함.
		
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		
		Powder P = (Powder)printer.getMaterial();
	}

}
