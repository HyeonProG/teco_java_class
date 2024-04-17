package basic.exercise;

public class Stars2 {

	public static void main(String[] args) {

		char star = '*';

		for (int i = 1; i < 10; i += 2) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			} // end of second for
			System.out.println();
		} // end of first for

	} // end of main

} // end of class
