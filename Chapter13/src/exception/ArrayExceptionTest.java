package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			//toString
			System.out.println(e);
			System.out.println("예외처리");
		}
		//다운된게 아니라 try 부분이 수행되다가 예외가 떨어져서 처리된것 (서버 죽은것x)
		//runtime exception
		System.out.println("프로그램 종료");
	}

}
