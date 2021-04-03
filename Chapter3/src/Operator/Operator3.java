package Operator;

public class Operator3 {

	public static void main(String[] args) {
		int score = 100;
		
		//아래 세개 모두 동일.
		System.out.println(++score);
		//score = score + 1;
		//score += 1;
		
		System.out.println(score++);
		System.out.println(score);
	}

}
