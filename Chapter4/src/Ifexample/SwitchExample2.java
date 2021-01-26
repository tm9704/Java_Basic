package Ifexample;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("달 입력:");
		int month = scanner.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			System.out.println("31일");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
		default:
			System.out.println("잘못 입력된 값");	
		}
		
		
	}

}
