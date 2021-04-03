package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		//지역변수의 가시성 
		/*for(num = 1; sum <= 100; num++) {
			sum += num;
		}*/
		
		for(num = 1; ; num++) {
			sum += num;
			if(sum >= 100) break;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
