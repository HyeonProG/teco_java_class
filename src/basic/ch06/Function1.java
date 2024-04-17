package basic.ch06;

import java.util.Iterator;

public class Function1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);

		int result2 = calcSum(7, 10);
		System.out.println(result2);

	} // end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	// 연습 문제
	// 함수를 수정 --> 파라메터 정수 2개를 받을 수 있도록 설계
	// s1, s2 --> 반복
	// for문 -- > 1, 10 --> 55
	// 7, 200 --> 7 + 8 + 9 ...
	static int calcSum(int s1, int s2) {
		int sum = 0;
		int i;
		for (i = s1; i <= s2; i++) {
			sum = sum + i;
		}
		return sum;
	}

} // end of class
