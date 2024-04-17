package basic.exercise;

public class Stars1 {

	public static void main(String[] args) {

		char star = '*';
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			} // end of second for
			System.out.println();
		} // end of first 

	} // end of main

} // end of class
