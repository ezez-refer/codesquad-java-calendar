package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, calendar");

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 월을 입력해주세요 : ");									
		int month = scan.nextInt();													// 월 입력받기
		int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };			// 최대 일수 저장하는 배열
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month - 1]);		// 출력
		scan.close();
	}
}