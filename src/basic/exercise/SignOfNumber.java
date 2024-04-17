package basic.exercise;

import java.util.Scanner;

public class SignOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int num1 = sc.nextInt();
		
		String result = signOfNumber(num1);
		System.out.println(result);
		
		
	}
	
	static String signOfNumber(int num1) {
		String result1 = "positive";
		String result2 = "zero";
		String result3 = "negative";
		
		if (num1 > 0) {
			return result1;
		} else if (num1 == 0) {
			return result2;
		} else {
			return result3;
		}
		
	}

}
