package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		// 출력 : 화면에 두 수의 합을 출력한다.
		Scanner scan = new Scanner(System.in);
//		System.out.print("첫 번째 수를 입력해주세요 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두 번째 수를 입력해주세요 : ");
//		int num2 = scan.nextInt();
		
		String s1, s2;
		System.out.print("두 수를 입력해주세요 : ");
		s1 = scan.next();
		s2 = scan.next();
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		//System.out.print("두 수의 합은 : " + (num1+num2));
		System.out.printf("두 수의 합 : %d", num1+num2);
		
		scan.close();
	}
}
