package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
//		try(AutoCloseObj obj = new AutoCloseObj()){
//			//강제 예외 발
//			throw new Exception();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj){
			throw new Exception();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
