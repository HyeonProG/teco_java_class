package basic.exercise;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String name = sc.next();
		
		greet(name);

	}
	
	static void greet(String name1) {
		
		System.out.println("안녕하세요, " + name1 + "님!");
		
	}

}
