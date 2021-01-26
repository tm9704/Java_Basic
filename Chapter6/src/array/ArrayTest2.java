package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		char[] alpabet = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpabet.length;i++) {
			alpabet[i] = ch++;
			System.out.println(alpabet[i]); 
		}
	}

}
