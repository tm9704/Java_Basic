package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		//iNum 이 float로 바뀌고 더한 값은 double로 바뀜
		dNum = fNum + iNum;
		
		System.out.println(dNum);
	}

}
