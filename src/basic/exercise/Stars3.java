package basic.exercise;

public class Stars3 {

	public static void main(String[] args) {

		char star = '*';
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			} // end of second for
			System.out.println();
		} // end of first for

	} // end of main

} // end of class
