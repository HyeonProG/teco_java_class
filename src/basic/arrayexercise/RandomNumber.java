package basic.arrayexercise;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		int[] makeNumber = randomNumber();
		for (int i = 0; i < makeNumber.length; i++) {
			System.out.print(makeNumber[i] + "\t");
		}
	}
	
	// 랜덤 번호를 생성하는 메서드
	public static int[] randomNumber() {
		// 배열 안의 크기 1개 생성
		int[] numbers = new int[10];
		// 랜덤 번호 생성
		Random random = new Random();
		// 배열안의 요소에 값을 넣기 위해 반복
		for (int i = 0; i < 10; i++) {
			// 요소 하나당 랜덤값 부여
			int num = random.nextInt(100) + 1;
			// 중복된 숫자가 나오는 것을 방지 하기 위해 반복
			for (int j = 0; j < i; j++) {
				// 배열안의 요소가 같다면
				if (numbers[i] == numbers[j]) {
					// 뒤돌아가서 다시 반복
					i--;
				}
			}
			numbers[i] = num;
		}
		return numbers;
	}
}

