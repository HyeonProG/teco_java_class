package basic.exercise;

import java.util.Scanner;

public class CheckAdult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int age = sc.nextInt();
		
		boolean result = checkAdult(age);	
		System.out.println(result);

	}
	
	static boolean checkAdult(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

}
