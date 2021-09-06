 package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		//뒤에 꺽쇠에는 자료형 안적어줘도됨.
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic= new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter); 
	}

}
