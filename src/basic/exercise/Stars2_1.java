package basic.exercise;

public class Stars2_1 {

	public static void main(String[] args) {

		char star = '*';
		// 10번
		// i == 2 
		for (int i = 1; i < 10; i++) {
			// i << 2
			for (int j = 0; j < i; j++) { // i == 1
				if (i % 2 != 0) {
					System.out.print(star);
				} // end of if
				
			} // end of second for	
			
			if (i % 2 != 0) {
				System.out.println();
			} // end of if
			
		} // end of first for

	} // end of main

} // end of class
