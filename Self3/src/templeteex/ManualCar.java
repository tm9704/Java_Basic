package templeteex;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("Manual Car drive");
		
	}

	@Override
	public void stop() {
		System.out.println("Manual Car stop");
	}
	
}
