package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	public static void main(String[] args) {

		// ctrl + shift + o --> import 가져오기 단축키
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력 하세요 : ");
		int maxNumber = sc.nextInt();

		int sum = 0;

		// 반복적인 패턴이 확인 된다.
		// i = i + 2 --> i += 2
		for (int i = 2; i <= maxNumber; i += 2) {
			sum = sum + i;
		}

		System.out.println("sum : " + sum);

	} // end of main

} // end of class
