package basic.exercise.toy;

import java.util.Random;

public class RandomNumber {
	
	public static int makeNumber() {
		Random random = new Random();
		int resultNumber = random.nextInt(20) + 1;
		return resultNumber;

	}

}
