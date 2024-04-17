package basic.exercise;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = findMax(num1, num2);
		System.out.println(result);

	}
	
	static int findMax(int num1, int num2) {
	
		int result = (num1 > num2) ? num1 : num2;
		return result;
	}

}
