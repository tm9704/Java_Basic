package variable;

public class Explicit {

	public static void main(String[] args) {
		int i = 1000;
		byte bNum = (byte)i; 
		
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		//1+0
		int iNum1 = (int)dNum1 + (int)fNum;
		//2
		int iNum2 = (int)(dNum1 + fNum);
		
		//실수가 정수로 형변환되면 소수점 부분이 없어
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
