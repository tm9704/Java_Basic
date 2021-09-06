package selfcheck1;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private static int carSerialNum = 10000;
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
				if(instance == null)
					instance = new CarFactory();
					
				return instance;
	}
	
	public Car creatCar() {
		carSerialNum++;
		Car car = new Car(carSerialNum);

		return car;
	}

	public static int getCarSerialNum() {
		return carSerialNum;
	}
}
