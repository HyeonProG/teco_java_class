package basic.exercise;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int num1 = sc.nextInt();

		int result = square(num1);
		System.out.println(result);

	}

	static int square(int num1) {
		return num1 * num1;

	}

}
